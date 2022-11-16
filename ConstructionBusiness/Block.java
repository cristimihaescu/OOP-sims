package ConstructionBusiness;

import java.util.ArrayList;
import java.util.List;

public class Block extends ConstructionSite{
    private static final List<Employee> employeeList = new ArrayList<>();

    public Block() {
        super(employeeList);
    }
}
