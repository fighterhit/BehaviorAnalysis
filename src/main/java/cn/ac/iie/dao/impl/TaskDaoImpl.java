package cn.ac.iie.dao.impl;

import cn.ac.iie.dao.TaskDao;
import cn.ac.iie.domain.Task;
import cn.ac.iie.util.JDBCHelper;

/**
 * @author Fighter Created on 2018/9/25.
 */
public class TaskDaoImpl implements TaskDao {

    @Override
    public Task findById(int taskId) {
//        final
        Task task = new Task();
        String sql = "select * from task where task_id = ?";
        Object[] params = new Object[]{taskId};

        JDBCHelper jdbcHelper = JDBCHelper.getInstance();
        jdbcHelper.query(sql, params, rs -> {
            if (rs.next()) {
                //从数据库读出字段值
                String taskName = rs.getString(2);
                String createTime = rs.getString(3);
                String startTime = rs.getString(4);
                String finishTime = rs.getString(5);
                String taskType = rs.getString(6);
                String taskStatus = rs.getString(7);
                String taskParam = rs.getString(8);

                //设置task对象值
                task.setTaskId(taskId);
                task.setTaskName(taskName);
                task.setCreateTime(createTime);
                task.setStartTime(startTime);
                task.setStartTime(startTime);
                task.setFinishTime(finishTime);
                task.setTaskStatus(taskStatus);
                task.setTaskParam(taskParam);

            }
        });

        return task;
    }
}
