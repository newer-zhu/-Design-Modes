package factory.factoryMethod;

public class ChineseFactory extends Factory {
    @Override
    public Pizza getPizza() {
        return new ChinesePizza();
    }
}
