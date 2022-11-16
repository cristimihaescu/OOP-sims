package ConstructionBusiness;

import java.util.UUID;

public abstract class Employee {
private UUID id;
private String name;
int salary;
int hourlySalary;

    public Employee(String name, int salary, int hourlySalary) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
        this.hourlySalary = hourlySalary;
    }
}
