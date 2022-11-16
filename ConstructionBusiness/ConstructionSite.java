package ConstructionBusiness;

import java.util.List;

public abstract class ConstructionSite {
    private List<Employee> employeeList;

    public ConstructionSite(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    boolean isSiteManager() {
        for (Employee siteManager : employeeList) {
            if (employeeList.contains(siteManager)) {
                return true;
            }
        }
        return false;
    }

    public void addEngineer(Engineer engineer) {
        employeeList.add(engineer);
    }

    public void addWorker(Worker worker){
        employeeList.add(worker);
    }

    public void addSupervisor(Supervisor supervisor){
        employeeList.add(supervisor);
    }

    public void addSiteManager(SiteManager siteManager){
        employeeList.add(siteManager);
    }

    public void addPartTime(PartTime partTime){
        employeeList.add(partTime);
    }

}
