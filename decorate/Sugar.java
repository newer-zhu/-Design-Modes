package decorate;

public class Sugar extends Decorator{

    public Sugar(Drink drink) {
        super(drink);
        setDsc("糖");
        setPrice(1);
    }
}
