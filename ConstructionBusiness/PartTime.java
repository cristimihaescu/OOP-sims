package ConstructionBusiness;

public class PartTime extends Employee{
    public PartTime(String name, int salary, int hourlySalary) {
        super(name, salary, hourlySalary);
        this.salary = 0;
        this.hourlySalary = 12;
    }
}
