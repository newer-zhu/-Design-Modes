package prototype.deepCopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Person person = new Person("zhu", 20, new House("china", 111));
//        Person person1 = (Person) person.clone();
//        Person person2 = (Person) person.clone();
//        System.out.println(person1.getHouse() == person2.getHouse());
//        System.out.println(person1);
//        System.out.println(person2);

        Person person = new Person("zhu", 20, new House("china", 111));
        Person person1 = (Person) person.deepClone();
        Person person2 = (Person) person.deepClone();
        System.out.println(person1.getHouse() == person2.getHouse());
        System.out.println(person1);
        System.out.println(person2);

    }
}
