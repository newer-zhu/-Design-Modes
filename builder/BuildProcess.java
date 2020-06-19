package builder;

public abstract class BuildProcess {
    //打地基
    abstract void buildBase();
    //刷漆
    abstract void paintWall();
    //封顶
    abstract void buildRoof();
    //获得完工的建筑
    public abstract Building getBuilding();
}
