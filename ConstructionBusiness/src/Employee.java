package ConstructionBusiness.src;

import java.util.UUID;

public abstract class Employee {
    UUID employeeId;
    String name;
    int salary;
    int salaryPerHour;
    int workingHours;
    EmployeeType employeeType;

    public Employee(String name, int salary, int salaryPerHour, int workingHours, EmployeeType employeeType) {
        this.employeeId = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
        this.salaryPerHour = salaryPerHour;
        this.workingHours = workingHours;
        this.employeeType = employeeType;
    }

    public int getSalary(EmployeeType employeeType) {
        if(employeeType == EmployeeType.PART_TIME){
            salary = 0;
        }
        return salaryPerHour * 2;
    }
}
