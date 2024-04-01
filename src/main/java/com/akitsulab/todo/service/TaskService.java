package com.akitsulab.todo.service;

import com.akitsulab.todo.model.Task;
import com.akitsulab.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task get(int taskId) {
        return this.taskRepository.findOne(taskId);
    }

}
