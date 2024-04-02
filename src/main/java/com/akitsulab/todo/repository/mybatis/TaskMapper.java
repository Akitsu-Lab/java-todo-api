package com.akitsulab.todo.repository.mybatis;

import com.akitsulab.todo.model.Task;
import com.akitsulab.todo.model.TaskList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskMapper {
    @Select("SELECT * FROM tasks WHERE id = #{id}")
    Task findById(@Param("id") int id);

    @Select("SELECT * FROM tasks")
    List<Task> findList();
}
