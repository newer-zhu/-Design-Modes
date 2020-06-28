package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        //1.目标对象的类加载器 2.目标对象实现的接口类型 3.执行目标对象的方法时触发此方法
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理开始");
                        //1. 目标对象 2. 参数
                        Object invoke = method.invoke(target, args);
                        System.out.println("开始补课");
                        return invoke;
                    }
                });
    }
}
