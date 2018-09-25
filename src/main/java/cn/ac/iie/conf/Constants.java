package cn.ac.iie.conf;

/**
 * @author Fighter Created on 2018/9/21.
 */
public interface Constants {

    /**
     * jdbc 配置项
     */
    String JDBC_DRIVER = "jdbc.driver";
    String JDBC_DATASOURCE_SIZE = "jdbc.datasource.size";

    String JDBC_URL_LOCAL= "jdbc.url.local";
    String JDBC_USER_LOCAL = "jdbc.user.local";
    String JDBC_PASSWORD_LOCAL = "jdbc.password.local";

    String JDBC_URL_CLUSTER="jdbc.url.cluster";
    String JDBC_USER_CLUSTER="jdbc.user.cluster";
    String JDBC_PASSWORD_CLUSTER="jdbc.password.cluster";



    /**
     * spark 配置项
     */
    String SPARK_IS_LOCAL = "spark.local";




}
