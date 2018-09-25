package cn.ac.iie.dao.factory;

import cn.ac.iie.dao.SessionAggrStatDao;
import cn.ac.iie.dao.TaskDao;
import cn.ac.iie.dao.impl.SessionAggrStatDaoImpl;
import cn.ac.iie.dao.impl.TaskDaoImpl;

/**
 * @author Fighter Created on 2018/9/25.
 */
public class DaoFactory {
    public static TaskDao getTaskDao() {
        return new TaskDaoImpl();
    }
    public static SessionAggrStatDao getSessionAggrStatDao(){
        return new SessionAggrStatDaoImpl();
    }


}
