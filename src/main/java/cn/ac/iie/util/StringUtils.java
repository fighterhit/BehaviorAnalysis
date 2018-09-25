package cn.ac.iie.util;

/**
 * @author Fighter Created on 2018/9/25.
 */
public class StringUtils {

    public static String fulfill(String str) {
        if (str.length() == 2) {
            return str;
        } else {
            return "0" + str;
        }
    }

}
