package iterator;

import Organization.Department;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mechanic implements College {
    List<Department> departments;

    public Mechanic() {
        this.departments = new ArrayList<Department>();
    }

    @Override
    public String getName() {
        return "机械学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        departments.add(new Department(name,des));
    }

    @Override
    public Iterator createIterator() {
        return new MechanicsIterator(departments);
    }
}
