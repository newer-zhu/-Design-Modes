package proxy.dynamicProxy;

public class PE_Teacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("上体育课");
    }
}
