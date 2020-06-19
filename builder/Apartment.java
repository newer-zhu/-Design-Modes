package builder;

public class Apartment extends Building{

    private String base = "公寓地基";
    private int floors = 20;
    private int area = 50000;

    public Apartment(){
        super.setArea(this.area);
        super.setBase(this.base);
        super.setFloors(this.floors);
    };

    @Override
    public String toString() {
        return "Apartment{" +
                "base='" + base + '\'' +
                ", floors=" + floors +
                ", area=" + area +
                '}';
    }
}
