package visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    private List<Person> people = new LinkedList<>();

    public void attach(Person person){
        people.add(person);
    }

    public void detach(Person person){
        people.remove(person);
    }

    public void display(Action action){
        for (Person p : people){
            p.accept(action);
        }
    }
}
