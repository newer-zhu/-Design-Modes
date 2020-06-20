package Organization;

public class Department extends EduComponent {

    public Department(String name, String des) {
        super(name, des);
    }


    @Override
    protected void print() {
        System.out.println("----"+getName()+"------"+getDes());
    }
}
