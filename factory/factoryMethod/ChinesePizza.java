package factory.factoryMethod;

public class ChinesePizza extends Pizza {

    @Override
    public void purchase() {
        setName("Chinese Pizza");
        System.out.println("purchase Chinese cheese and floor");
    }
}


