package builder;

public class BuildingDirector {
    BuildProcess process = null;
    /**
     * 构造器指定生产过程
     */
    public BuildingDirector(BuildProcess process) {
        this.process = process;
    }

    /**
     * 返回一个Building对象
     * @return
     */
    public Building build(){
        return process.getBuilding();
    }
}
