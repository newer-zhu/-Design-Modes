package builder;

public class BuildVilla extends BuildProcess {
    @Override
    void buildBase() {
        System.out.println("别墅打地基");
    }

    @Override
    void paintWall() {
        System.out.println("别墅刷漆");
    }

    @Override
    void buildRoof() {
        System.out.println("别墅封顶");
    }

    /**
     *建造别墅并返回
     */
    @Override
    public Building getBuilding() {
        buildBase();
        paintWall();
        buildRoof();
        return new Villa();
    }
}
