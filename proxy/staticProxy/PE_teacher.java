package proxy.staticProxy;

import proxy.staticProxy.Teacher;

public class PE_teacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("上体育课");
    }
}
