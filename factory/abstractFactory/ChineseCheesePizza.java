package factory.abstractFactory;

public class ChineseCheesePizza extends Pizza {

    @Override
    public void purchase() {
        setName("Chinese CheesePizza");
        System.out.println("purchase Chinese Cheese and floor");
    }
}
