package com.edmilson.workersapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.edmilson.workersapi.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class Worker extends Person {
    private Long salary;

    @Column(nullable = false)
    private Role role;
}
