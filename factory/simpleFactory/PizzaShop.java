package factory.simpleFactory;

public class PizzaShop {
    public static void main(String[] args) {
        OrderPizza order = new OrderPizza(new SimpleFactory());
    }
}
