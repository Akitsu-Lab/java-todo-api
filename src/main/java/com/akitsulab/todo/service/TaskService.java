package com.akitsulab.todo.service;

import com.akitsulab.todo.entity.Task;
import com.akitsulab.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository repository;

    public TaskService(TaskRepository repository){
        this.repository = repository;
    }

    public Task get(int taskId){
        return this.repository.getReferenceById(taskId);
    }

}
