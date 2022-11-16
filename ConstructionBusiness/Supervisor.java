package ConstructionBusiness;

public class Supervisor extends Employee{
    public Supervisor(String name, int salary, int hourlySalary) {
        super(name, salary, hourlySalary);
        this.salary = 700;
        this.hourlySalary = 5;
    }
}
