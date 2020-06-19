package factory.factoryMethod;

public class AmericanFactory extends Factory {

    @Override
    public Pizza getPizza() {
        return new AmericanPizza();
    }
}
