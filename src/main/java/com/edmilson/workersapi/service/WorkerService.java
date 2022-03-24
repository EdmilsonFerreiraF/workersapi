package com.edmilson.workersapi.service;

import com.edmilson.workersapi.dto.response.MessageResponseDTO;
import com.edmilson.workersapi.entity.Worker;
import com.edmilson.workersapi.repository.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {
    private WorkerRepository workerRepository;

    @Autowired
    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public MessageResponseDTO createWorker(Worker worker) {
        Worker savedWorker = workerRepository.save(worker);
        
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedWorker.getId())
                .build();
    }
}
