package factory.abstractFactory;

import java.util.Scanner;

public class orderPizza {

   public static Factory getFactory(String factoryName){
        Factory factory = null;
        if ("Chinese".equals(factoryName)){
            factory = new ChineseFactory();
        }else if ("American".equals(factoryName)){
            factory = new AmericanFactory();
        }
        return factory;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String country = "";
        String pizzaName = "";
        Factory factory = null;
        while (true){
            country = in.nextLine();
            pizzaName = in.nextLine();
            factory = getFactory(country);
            Pizza pizza = factory.getPizza(pizzaName);
            pizza.purchase();
            pizza.bake();
            pizza.cut();
            pizza.packing();
        }
    }
}
