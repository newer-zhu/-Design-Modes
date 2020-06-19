package factory.factoryMethod;

public class AmericanPizza extends Pizza {

    @Override
    public void purchase() {
        setName("American Pizza");
        System.out.println("purchase American Cheese and floor");
    }
}
