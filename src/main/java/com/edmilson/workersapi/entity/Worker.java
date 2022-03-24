package com.edmilson.workersapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.edmilson.workersapi.enums.RoleType;

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
    @Column(nullable = false)
    private Long salary;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleType role;
}
