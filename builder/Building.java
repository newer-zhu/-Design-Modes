package builder;

public class Building {
    private String base;//地基
    private int floors;//层数
    private int area;//面积

    public Building(){};

    public void setBase(String base) {
        this.base = base;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
