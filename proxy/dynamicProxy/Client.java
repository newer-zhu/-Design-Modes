package proxy.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        Object proxyInstance = new ProxyFactory(new PE_Teacher()).getProxyInstance();
        //强转代理对象
        Teacher teacher = (Teacher)proxyInstance;
        teacher.teach();
    }
}
