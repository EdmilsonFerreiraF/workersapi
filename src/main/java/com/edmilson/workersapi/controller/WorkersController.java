package com.edmilson.workersapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/workers")
public class WorkersController {
    @GetMapping
    public String getWorkers() {
        return "API Test!";
    }
}
