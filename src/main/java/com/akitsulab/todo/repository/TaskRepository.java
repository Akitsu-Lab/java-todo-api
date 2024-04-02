package com.akitsulab.todo.repository;

import com.akitsulab.todo.model.Task;
import com.akitsulab.todo.model.TaskList;
import com.akitsulab.todo.repository.mybatis.TaskMapper;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    private final Logger logger = LoggerFactory.getLogger(TaskRepository.class);
    private final SqlSession sqlSession;

    public TaskRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Task findOne(int taskId){
        return sqlSession.getMapper(TaskMapper.class).findById(taskId);
    }

    public TaskList findList(){
        TaskList taskList = new TaskList();
        taskList.setTaskList(sqlSession.getMapper(TaskMapper.class).findList());
        logger.info("[TaskRepository] findList() called.");
        return taskList;
    }

}
