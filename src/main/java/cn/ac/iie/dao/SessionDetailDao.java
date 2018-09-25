package cn.ac.iie.dao;

import cn.ac.iie.domain.SessionDetail;

import java.util.List;

/**
 * @author Fighter Created on 2018/9/25.
 */
public interface SessionDetailDao {

    void insert(SessionDetail sessionDetail);

    void insertBatch(List<SessionDetail> sessionDetails);
}
