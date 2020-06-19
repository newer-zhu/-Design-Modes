package decorate;

public class Coffee extends Drink{

    //获取单品价格
    @Override
    public long cost() {
        return super.getPrice();
    }
}
