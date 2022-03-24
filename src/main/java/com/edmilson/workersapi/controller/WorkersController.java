package com.edmilson.workersapi.controller;

import com.edmilson.workersapi.dto.response.MessageResponseDTO;
import com.edmilson.workersapi.entity.Worker;
import com.edmilson.workersapi.service.WorkerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/v1/workers")
public class WorkersController {
    private WorkerService workerService;

    @Autowired
    public void WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createWorker(@RequestBody Worker worker) {
        return workerService.createWorker(worker);
    }
}
