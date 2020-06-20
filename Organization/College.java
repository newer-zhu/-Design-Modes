package Organization;

import java.util.ArrayList;
import java.util.List;

public class College extends EduComponent {
    List<EduComponent> eduComponents = new ArrayList<>();

    public College(String name, String des) {
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

        for (EduComponent c : eduComponents){
            c.print();
        }
        System.out.println();
    }
}
