package Organization;

import java.util.ArrayList;
import java.util.List;

public class University extends EduComponent {
    List<EduComponent> eduComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(EduComponent component) {
        eduComponents.add(component);
    }

    @Override
    protected void remove(EduComponent component) {
        eduComponents.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("----"+getName()+"------"+getDes());
        System.out.println();
        for (EduComponent c : eduComponents){
            c.print();
        }

    }
}
