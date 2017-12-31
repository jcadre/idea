package serialize;

import java.io.ObjectStreamException;

/**
 * Created by JC on 2017/12/31.
 */
public class Person extends Animal{
    public Person(String name){
        super(name);
        System.out.println("person");
    }

    private Object readResolve() throws ObjectStreamException {
        return null;
    }
}
