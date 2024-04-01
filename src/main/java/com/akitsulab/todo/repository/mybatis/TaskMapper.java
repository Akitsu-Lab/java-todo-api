package com.akitsulab.todo.repository.mybatis;

import com.akitsulab.todo.model.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TaskMapper {
    @Select("SELECT * FROM tasks WHERE id = #{id}")
    Task findById(@Param("id") int id);
}
