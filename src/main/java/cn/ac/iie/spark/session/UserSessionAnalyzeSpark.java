package cn.ac.iie.spark.session;

import cn.ac.iie.conf.Constants;
import org.apache.spark.SparkConf;

/**
 * @author Fighter Created on 2018/9/25.
 */
public class UserSessionAnalyzeSpark {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf()
                .setAppName(Constants.SPARK_APP_NAME_SESSION);

    }
}
