package decorate;


/**
 * IO流有应用
 * InputStream是抽象类Drink
 * FileInputStream和其他是子类
 * FilterInputStream是Decorator，其中包含有被装饰者
 * DataInputStream是其子类
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }
    @Override
    public long cost() {
        return super.getPrice() + drink.cost();
    }

    //调味的描述+咖啡的描述
    public String getDsc(){
        return super.getDsc() + " " + super.getPrice() + drink.getDsc();
    }
}
