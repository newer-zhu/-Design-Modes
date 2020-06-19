package decorate;

public abstract class Drink {
    public String dsc;//描述
    private long price = 0;//价格

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public abstract long cost();
}
