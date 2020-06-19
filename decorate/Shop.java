package decorate;

public class Shop {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);

        System.out.println(order.cost());
    }
}
