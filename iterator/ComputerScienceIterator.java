package iterator;

import Organization.Department;

import java.util.Iterator;

public class ComputerScienceIterator implements Iterator {

    Department[] departments;
    int pos = 0;

    public ComputerScienceIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (pos >= departments.length || departments[pos] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[pos];
        pos += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
