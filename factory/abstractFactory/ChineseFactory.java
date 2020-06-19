package factory.abstractFactory;

public class ChineseFactory extends Factory {
    Pizza pizza = null;
    @Override
    public Pizza getPizza(String pizzaName) {
        if ("ChineseCheesePizza".equals(pizzaName)){
            pizza = new ChineseCheesePizza();
        }else if ("ChineseChickenPizza".equals(pizzaName)){
            pizza = new ChineseChickenPizza();
        }
        return pizza;
    }
}
