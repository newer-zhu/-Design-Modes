package factory.abstractFactory;

public class AmericanCheesePizza extends Pizza {

    @Override
    public void purchase() {
        setName("American CheesePizza");
        System.out.println("purchase American Cheese and floor");
    }
}
