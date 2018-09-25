package cn.ac.iie.util;

import cn.ac.iie.conf.ConfigurationManager;
import cn.ac.iie.conf.Constants;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * 单例 JDBCHelper，操作数据库工具类
 *
 * @author Fighter Created on 2018/9/21.
 */
public class JDBCHelper {
    /**
     * JDBCHelper 实例
     */
    private static JDBCHelper instance = null;
    /**
     * 数据库连接池
     */
    private LinkedList<Connection> dataSource = new LinkedList<>();

    private Connection conn;
    private Statement st;

    private String url;
    private String user;
    private String password;
    private boolean isLocalMode = ConfigurationManager.getBoolean(Constants.SPARK_IS_LOCAL);

    static {
        try {
            String driver = ConfigurationManager.getProperty(Constants.JDBC_DRIVER);
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static JDBCHelper getInstance() {
        if (instance == null) {
            synchronized (JDBCHelper.class) {
                if (instance == null) {
                    instance = new JDBCHelper();
                }
            }
        }
        return instance;
    }

    /**
     * 初始化数据库连接池
     */
    private JDBCHelper() {
        try {

            //获取连接池大小
            int dataSourceSize = ConfigurationManager.getInteger(Constants.JDBC_DATASOURCE_SIZE);

            if (isLocalMode) {
                url = ConfigurationManager.getProperty(Constants.JDBC_URL_LOCAL);
                user = ConfigurationManager.getProperty(Constants.JDBC_USER_LOCAL);
                password = ConfigurationManager.getProperty(Constants.JDBC_PASSWORD_LOCAL);

            } else {
                url = ConfigurationManager.getProperty(Constants.JDBC_URL_CLUSTER);
                user = ConfigurationManager.getProperty(Constants.JDBC_USER_CLUSTER);
                password = ConfigurationManager.getProperty(Constants.JDBC_PASSWORD_CLUSTER);
            }

            //创建指定数量连接
            for (int i = 0; i < dataSourceSize; i++) {
                conn = DriverManager.getConnection(url, user, password);
                dataSource.push(conn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     *
     * @return 返回一个数据库连接
     */
    public synchronized Connection getConnection() {
        while (dataSource.size() == 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return dataSource.poll();
    }

    /**
     * 单条查询数据库
     */
    public void query(String sql, Object[] params, QueryCallBack callBack) {

        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = getConnection();
            pst = conn.prepareStatement(sql);

            if (params != null && params.length > 0) {
                for (int i = 1; i <= params.length; i++) {
                    pst.setObject(i, params[i]);
                }
            }

            ResultSet rs = pst.executeQuery();
            callBack.process(rs);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSqlConnection(conn, pst);
        }
    }

    private void closeSqlConnection(Connection conn, PreparedStatement pst) {
        try {
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                dataSource.push(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 处理查询结果接口
     */
    public static interface QueryCallBack {
        void process(ResultSet rs) throws Exception;
    }

    /**
     * 单条更新数据库
     *
     * @param sql    sql语句
     * @param params 参数
     * @return 影响行数
     */
    public int update(String sql, Object[] params) {

        int rtn = 0;
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = getConnection();
            pst = conn.prepareStatement(sql);
            conn.setAutoCommit(false);

            if (params != null && params.length > 0) {
                for (int i = 1; i <= params.length; i++) {
                    pst.setObject(i, params[i]);
                }
            }

            rtn = pst.executeUpdate();
            conn.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSqlConnection(conn, pst);
        }
        return rtn;
    }

    public int[] updateBatch(String sql, List<Object[]> params) {

        Connection conn = null;
        PreparedStatement pst = null;
        int[] rtn = null;
        try {
            conn = getConnection();
            conn.setAutoCommit(false);
            pst = conn.prepareStatement(sql);
            if (params != null && params.size() > 0) {
                for (Object[] param : params) {
                    for (int i = 1; i <= param.length; i++) {
                        pst.setObject(i, param[i]);
                    }
                    pst.addBatch();
                }
            }
            rtn = pst.executeBatch();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeSqlConnection(conn, pst);
        }
        return rtn;

    }

}

