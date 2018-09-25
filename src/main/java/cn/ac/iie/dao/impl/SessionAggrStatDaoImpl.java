package cn.ac.iie.dao.impl;

import cn.ac.iie.dao.SessionAggrStatDao;
import cn.ac.iie.domain.SessionAggrStat;
import cn.ac.iie.util.JDBCHelper;

/**
 * @author Fighter Created on 2018/9/25.
 */
public class SessionAggrStatDaoImpl implements SessionAggrStatDao {
    String sql = "insert into session_aggr_stat values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    @Override
    public void insert(SessionAggrStat sessionAggrStat) {
        Object[] params = new Object[]{
                sessionAggrStat.getTaskId(),
                sessionAggrStat.getSessionCount(),
                sessionAggrStat.getVisitTime1s3sRatio(),
                sessionAggrStat.getVisitTime4s6sRatio(),
                sessionAggrStat.getVisitTime7s9sRatio(),
                sessionAggrStat.getVisitTime10s30sRatio(),
                sessionAggrStat.getVisitTime30s60sRatio(),
                sessionAggrStat.getVisitTime1m3mRatio(),
                sessionAggrStat.getVisitTime3m10mRatio(),
                sessionAggrStat.getVisitTime10m30mRatio(),
                sessionAggrStat.getVisitTime30mRatio(),
                sessionAggrStat.getVisitStep1_3Ratio(),
                sessionAggrStat.getVisitStep4_6Ratio(),
                sessionAggrStat.getVisitStep7_9Ratio(),
                sessionAggrStat.getVisitStep10_30Ratio(),
                sessionAggrStat.getVisitStep30_60Ratio(),
                sessionAggrStat.getVisitStep60Ratio()
        };
        JDBCHelper jdbcHelper = JDBCHelper.getInstance();
        jdbcHelper.update(sql, params);
    }

}
