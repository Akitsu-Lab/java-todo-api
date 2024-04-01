package com.akitsulab.todo.repository;

import com.akitsulab.todo.model.Task;
import com.akitsulab.todo.repository.mybatis.TaskMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {
    private final SqlSession sqlSession;

    public TaskRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Task findOne(int taskId){
        return sqlSession.getMapper(TaskMapper.class).findById(taskId);
    }
}
