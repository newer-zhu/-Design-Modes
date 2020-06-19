package prototype.deepCopy;

import java.io.*;

public class Person implements Serializable , Cloneable {
    private String name;
    private int age;
    private House house;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public House getHouse() {
        return house;
    }

    public Person(String name, int age, House house) {
        this.name = name;
        this.age = age;
        this.house = house;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonePerson =(Person) super.clone();
        House cloneHouse =(House) house.clone();
        clonePerson.house = cloneHouse;
        return clonePerson;
    }

    /**
     * 通过序列化来clone
     * @return
     */
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;

        try{
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            //以对象流的方式输出这个对象
            oos.writeObject(this);
            //反序列化
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            return (Person)ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                baos.close();
                oos.close();
                bais.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }







    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", house=" + house +
                '}';
    }
}
