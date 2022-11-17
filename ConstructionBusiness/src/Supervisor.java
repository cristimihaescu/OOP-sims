package ConstructionBusiness.src;

import java.util.List;

public class Supervisor extends Employee{
    public List<Worker> workerList;


    public Supervisor(String name, EmployeeType employeeType) {
        super(name, 700, 5, 10, employeeType);
    }

    private void addWorker(Worker worker){
        workerList.add(worker);
    }

    private int getSupervisorSalary(EmployeeType employeeType){
        if(employeeType == EmployeeType.BASE_SALARY || employeeType == EmployeeType.PART_TIME){
            salary = (int) (salary + (salaryPerHour * workingHours) + (0.5 * workerList.stream().count()));
        }
        return salary;
    }

}
