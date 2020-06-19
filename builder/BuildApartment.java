package builder;

public class BuildApartment extends BuildProcess {
    @Override
    void buildBase() {
        System.out.println("公寓打地基");
    }

    @Override
    void paintWall() {
        System.out.println("公寓刷漆");
    }

    @Override
    void buildRoof() {
        System.out.println("公寓封顶");
    }

    @Override
    public Building getBuilding() {
        buildBase();
        paintWall();
        buildRoof();
        return new Apartment();
    }
}
