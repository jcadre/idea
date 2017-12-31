package serialize;

import java.io.*;

/**
 * Author JC on 2017/12/31.
 * Email: jiangchaokenan@gmail.com
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("employee.dat"));
        Foo2 foo2 = new Foo2();
        oos.writeObject(foo2);
        oos.flush();
        oos.close();
        System.out.println("================");
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("employee.dat"));
        Foo2 foo21 = (Foo2) ois.readObject();

        System.out.println(foo21);
        ois.close();
    }
}

class Foo {
    public Foo() {
        System.out.println("foo...");
    }
}

class Foo1 extends Foo implements Serializable {
    public Foo1() {
        System.out.println("foo1...");
    }
}

class Foo2 extends Foo1 {
    public Foo2() {
        System.out.println("foo2...");
    }
}
