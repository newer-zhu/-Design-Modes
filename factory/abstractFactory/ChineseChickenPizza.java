package factory.abstractFactory;

public class ChineseChickenPizza extends Pizza {

    @Override
    public void purchase() {
        setName("Chinese ChickenPizza");
        System.out.println("purchase Chinese chicken and floor");
    }
}


