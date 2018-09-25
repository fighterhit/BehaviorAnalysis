package cn.ac.iie.dao;

import cn.ac.iie.domain.Task;

/**
 * @author Fighter Created on 2018/9/25.
 */
public interface TaskDao {
    /**
     * 根据 task 主键查询 task
     *
     * @param taskId
     * @return
     */
    Task findById(int taskId);
}
