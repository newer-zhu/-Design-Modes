package builder;

public class Villa extends Building {
    String base = "三层小洋楼";
    int area = 10000;
    int floors = 3;

    public Villa(){
        super.setArea(this.area);
        super.setBase(this.base);
        super.setFloors(this.floors);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "base='" + base + '\'' +
                ", area=" + area +
                ", floors=" + floors +
                '}';
    }
}
