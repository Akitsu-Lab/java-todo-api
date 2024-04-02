package com.akitsulab.todo.controller;

import com.akitsulab.todo.model.Task;
import com.akitsulab.todo.model.TaskList;
import com.akitsulab.todo.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("services/v1/tasks")
public class TaskController {

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping(path = "", produces = "application/json")
    public TaskList findList() {
        logger.info("[TaskController] findList() called.");
        return this.service.getTaskList();
    }
    @GetMapping(path = "/{taskId}", produces = "application/json")
    public Task find(@PathVariable int taskId) {
        return this.service.getTask(taskId);
    }

}
