package prototype.shallowCopy;

public class People implements Cloneable{
    String name;
    String address;
    int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        People p  =null;
        try{
            p = (People)super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return p;
    }

    public People(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
