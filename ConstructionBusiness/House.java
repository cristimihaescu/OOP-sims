package ConstructionBusiness;

import java.util.ArrayList;
import java.util.List;

public class House extends ConstructionSite{
    private static final List<Employee> employeeList = new ArrayList<>() ;

    public House() {
        super(employeeList);
    }
}
