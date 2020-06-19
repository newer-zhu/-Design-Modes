package prototype.shallowCopy;

/**
 * spring中bean的创建
 */

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        People people = new People("tom", "china", 20);
        People people1 = (People) people.clone();
        System.out.println(people);
        System.out.println(people1);
    }
}
