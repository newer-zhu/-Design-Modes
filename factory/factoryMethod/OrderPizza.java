package factory.factoryMethod;

import factory.simpleFactory.SimpleFactory;

import java.util.Scanner;

public abstract class OrderPizza {
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();
    Factory factory = null;
    Pizza pizza = null;
    public OrderPizza(Factory factory){

        while (true){
            if (name.equals("ChinesePizza")){
                pizza = new ChineseFactory().getPizza();
            }else if (name.equals("AmericanPizza")){
                pizza = new AmericanFactory().getPizza();
            }
            pizza.purchase();
            pizza.bake();
            pizza.cut();
            pizza.packing();
            name = in.nextLine();
        }
    }

}
