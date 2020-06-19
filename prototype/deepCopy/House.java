package prototype.deepCopy;

import java.io.Serializable;

public class House implements Serializable , Cloneable {
    private String address;
    private int number;

    public House(String address, int number) {
        this.address = address;
        this.number = number;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}
