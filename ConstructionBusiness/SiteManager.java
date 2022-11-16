package ConstructionBusiness;

public class SiteManager extends Employee{
    public SiteManager(String name, int salary, int hourlySalary) {
        super(name, salary, hourlySalary);
        this.salary = 1000;
        this.hourlySalary = 20;
    }
}
