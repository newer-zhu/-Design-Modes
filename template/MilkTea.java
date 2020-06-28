package template;

/**
 * Ioc用过
 * addConfigurationApplicationContext
 */
public abstract class MilkTea {
    final void make(){
        select();
        if (isAddResource())
            addSource();
        stir();
        packing();
    }

    void select(){
        System.out.println("1.选择奶和茶");
    }

    abstract void addSource();

    void stir(){
        System.out.println("3.搅拌");
    }

    void packing(){
        System.out.println("包装");
    }

    //钩子函数
    boolean isAddResource(){
        return true;
    }

}
