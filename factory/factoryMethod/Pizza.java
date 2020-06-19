package factory.factoryMethod;

public abstract class Pizza {
    private String name;

    public abstract void purchase();

    public void bake(){
        System.out.println(name + " is baking");
    }

    public void cut(){
        System.out.println(name + " is cutting");
    }

    public void packing()
    {
        System.out.println( name + " is packing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
