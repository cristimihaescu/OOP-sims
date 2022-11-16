package ConstructionBusiness;

public class Worker extends Employee{
    public Worker(String name, int salary, int hourlySalary) {
        super(name, salary, hourlySalary);
        this.salary = 400;
        this.hourlySalary = 6;
    }
}
