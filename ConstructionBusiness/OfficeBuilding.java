package ConstructionBusiness;

import java.util.ArrayList;
import java.util.List;

public class OfficeBuilding extends ConstructionSite{
    private static final List<Employee> employeeList = new ArrayList<>();

    public OfficeBuilding() {
        super(employeeList);
    }
}
