package iterator;

import Organization.Department;

import java.util.Iterator;

public class ComputeScience implements College {
    Department[] departments;
    int numOfDepartment = 0;

    public ComputeScience(int i) {
        this.departments = new Department[i];
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name,String des) {
        Department department = new Department(name,des);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerScienceIterator(departments);
    }
}
