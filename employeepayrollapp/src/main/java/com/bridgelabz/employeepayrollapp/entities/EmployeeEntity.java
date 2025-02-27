package com.bridgelabz.employeepayrollapp.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "This field can't be null")
    private String name;

    private Double salary;

    public EmployeeEntity(String name,Double salary){
        this.name = name;
        this.salary = salary;
    }



}
