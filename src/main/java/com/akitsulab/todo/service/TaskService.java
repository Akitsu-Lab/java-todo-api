package com.akitsulab.todo.service;

import com.akitsulab.todo.model.Task;
import com.akitsulab.todo.model.TaskList;
import com.akitsulab.todo.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private static final Logger logger = LoggerFactory.getLogger(TaskService.class);
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task getTask(int taskId) {
        return this.taskRepository.findOne(taskId);
    }

    public TaskList getTaskList(){
        logger.info("[TaskService] getTaskList() called.");
        return this.taskRepository.findList();
    }

}
