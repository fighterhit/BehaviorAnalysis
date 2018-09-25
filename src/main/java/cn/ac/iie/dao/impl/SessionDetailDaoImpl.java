package cn.ac.iie.dao.impl;

import cn.ac.iie.dao.SessionDetailDao;
import cn.ac.iie.domain.SessionDetail;
import cn.ac.iie.util.JDBCHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fighter Created on 2018/9/25.
 */
public class SessionDetailDaoImpl implements SessionDetailDao {

    String sql = "insert into session_detail values(?,?,?,?,?,?,?,?,?,?,?,?)";

    @Override
    public void insert(SessionDetail sessionDetail) {
        Object[] params = new Object[]{
                sessionDetail.getTaskId(),
                sessionDetail.getUserId(),
                sessionDetail.getSessionId(),
                sessionDetail.getPageId(),
                sessionDetail.getActionTime(),
                sessionDetail.getSearchKeyword(),
                sessionDetail.getClickCategotyId(),
                sessionDetail.getClickProductId(),
                sessionDetail.getOrderCategoryIds(),
                sessionDetail.getOrderProductIds(),
                sessionDetail.getPayCategoryIds(),
                sessionDetail.getPayProductIds()
        };

        JDBCHelper jdbcHelper = JDBCHelper.getInstance();
        jdbcHelper.update(sql, params);
    }

    @Override
    public void insertBatch(List<SessionDetail> sessionDetails) {
        String sql = "insert into session_detail values(?,?,?,?,?,?,?,?,?,?,?,?)";
        List<Object[]> paramList = new ArrayList<>();
        for (SessionDetail sessionDetail : sessionDetails) {
            Object[] params = new Object[]{
                    sessionDetail.getTaskId(),
                    sessionDetail.getUserId(),
                    sessionDetail.getSessionId(),
                    sessionDetail.getPageId(),
                    sessionDetail.getActionTime(),
                    sessionDetail.getSearchKeyword(),
                    sessionDetail.getSearchKeyword(),
                    sessionDetail.getClickCategotyId(),
                    sessionDetail.getClickProductId(),
                    sessionDetail.getOrderCategoryIds(),
                    sessionDetail.getOrderProductIds(),
                    sessionDetail.getPayCategoryIds(),
                    sessionDetail.getPayProductIds()
            };
            paramList.add(params);
        }

        JDBCHelper jdbcHelper = JDBCHelper.getInstance();
        jdbcHelper.updateBatch(sql, paramList);
    }
}
