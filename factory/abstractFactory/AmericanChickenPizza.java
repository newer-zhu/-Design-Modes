package factory.abstractFactory;

public class AmericanChickenPizza extends Pizza {

    @Override
    public void purchase() {
        setName("American ChickenPizza");
        System.out.println("purchase American chicken and floor");
    }
}


