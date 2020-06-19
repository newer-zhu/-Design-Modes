package factory.simpleFactory;

public class CheesePizza extends Pizza {

    @Override
    public void purchase() {
        setName("CheesePizza");
        System.out.println("purchase Cheese and floor");
    }
}
