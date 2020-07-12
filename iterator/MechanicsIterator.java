package iterator;

import Organization.Department;

import java.util.Iterator;
import java.util.List;

public class MechanicsIterator implements Iterator {
    List<Department> list;
    int index = -1;

    public MechanicsIterator(List<Department> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.size()-1)
            return false;
        else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return list.get(index);
    }
}
