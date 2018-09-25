package cn.ac.iie.dao;

import cn.ac.iie.domain.SessionAggrStat;

/**
 * @author Fighter Created on 2018/9/25.
 */
public interface SessionAggrStatDao {

    /**
     * 向数据库插入聚合统计结果
     * @param SessionAggrStat
     */
    void insert(SessionAggrStat SessionAggrStat);
}
