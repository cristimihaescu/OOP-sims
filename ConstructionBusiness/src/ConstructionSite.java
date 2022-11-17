import java.util.ArrayList;
import java.util.List;

public class ConstructionSite {
    public List<Employee> employeeList;
    ConstructionType constructionType;

    public ConstructionSite(ConstructionType constructionType) {
        this.constructionType = constructionType;
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public int totalWorkers(){
        int count = 0;
        for(Employee employee : employeeList){
            if(employee instanceof Worker){
                count++;
            }
        }
        return count;
    }

    public boolean isSiteManager() {
        for (Employee employee : employeeList) {
            if (employee instanceof SiteManager) {
                return true;
            }
        }
        System.out.println("Cannot start the construction ! The SiteManager is missing !");
        return false;
    }
}
