package ConstructionBusiness;

public class Engineer extends Employee{
    public Engineer(String name, int salary, int hourlySalary) {
        super(name, salary, hourlySalary);
        this.salary = 700;
        this.hourlySalary = 40;
    }
}
