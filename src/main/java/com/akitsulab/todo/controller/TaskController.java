package com.akitsulab.todo.controller;

import com.akitsulab.todo.model.Task;
import com.akitsulab.todo.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("services/v1/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping(path = "/{taskId}",produces = "application/json")
    public Task find(@PathVariable int taskId){
        return this.service.get(taskId);
    }

}
