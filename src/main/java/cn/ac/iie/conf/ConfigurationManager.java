package cn.ac.iie.conf;

import java.io.InputStream;
import java.util.Properties;

/**
 * 配置管理
 * @author Fighter Created on 2018/9/19.
 */
public class ConfigurationManager {

    private static Properties pro = new Properties();

    static {
        try {
            InputStream in = ConfigurationManager.class.getClassLoader().getResourceAsStream("my.properties");
            pro.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return pro.getProperty(key);
    }

    public static Integer getInteger(String key) {
        String val = pro.getProperty(key);
        try {
            return Integer.valueOf(val);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static Boolean getBoolean(String key) {
        String val = pro.getProperty(key);
        try {
            return Boolean.valueOf(val);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Long getLong(String key) {
        String val = pro.getProperty(key);
        try {
            return Long.valueOf(val);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0L;
    }
}
