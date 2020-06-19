package factory.simpleFactory;

import java.util.Scanner;

public class OrderPizza {
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();
    SimpleFactory factory = null;

    public OrderPizza(SimpleFactory factory){
        setFactory(factory);

        while (true){
            Pizza pizza = factory.getPizza(name);
            pizza.purchase();
            pizza.bake();
            pizza.cut();
            pizza.packing();
            name = in.nextLine();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleFactory getFactory() {
        return factory;
    }

    public void setFactory(SimpleFactory factory) {
        this.factory = factory;
    }
}
