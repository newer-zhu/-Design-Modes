package visitor;

import com.sun.net.httpserver.Authenticator;

public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Man());
        structure.attach(new Man());
        structure.attach(new Man());
        structure.attach(new Woman());
        structure.attach(new Woman());

        Pass pass = new Pass();
        structure.display(pass);
    }
}
