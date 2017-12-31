package serialize;

import java.io.Serializable;

/**
 * Author JC on 2017/12/31.
 * Email: jiangchaokenan@gmail.com
 */
public class Animal implements Serializable {

    private static final long serialVersionUID = -328782329529118151L;

    private String name;

    public Animal(){
    }

    public Animal(String name){
        this.name = name;
        System.out.println("animal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
