package factory.simpleFactory;

public class ChickenPizza extends Pizza{

    @Override
    public void purchase() {
        setName("ChickenPizza");
        System.out.println("purchase chicken and floor");
    }
}


