package bridge;

public abstract class Phone {
    //组合进Brand
    private Brand brand;
    public Phone(Brand brand){
        this.brand = brand;
    }

    void call(){
        brand.call();
    }

    void close(){
        brand.close();
    }
}
