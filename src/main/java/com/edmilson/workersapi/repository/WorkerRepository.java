package com.edmilson.workersapi.repository;

import com.edmilson.workersapi.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Person, Long> {
    
}