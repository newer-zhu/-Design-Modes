package factory.simpleFactory;

/**
 * jdk的calender类采用了此方法
 */
public class SimpleFactory {
    public Pizza getPizza(String name){
        Pizza pizza = null;
        if ("CheesePizza".equals(name)){
            pizza = new CheesePizza();
        }else if ("ChickenPizza".equals(name)){
            pizza = new ChickenPizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
