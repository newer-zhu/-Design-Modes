package factory.abstractFactory;

public class AmericanFactory extends Factory {
    Pizza pizza = null;
    @Override
    public Pizza getPizza(String pizzaName) {

        if ("AmericanCheesePizza".equals(pizzaName)){
            pizza = new AmericanCheesePizza();
        }else if("AmericanChickenPizza".equals(pizzaName)){
            pizza = new AmericanChickenPizza();
        }
        return pizza;
    }
}
