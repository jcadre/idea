package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Author JC on 2017/12/31.
 * Email: jiangchaokenan@gmail.com
 */
public enum Singleton {
    INSTANCE;

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) throws Exception{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("E://aaaa.txt"));
        outputStream.writeObject(Singleton.INSTANCE);
        outputStream.close();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("E://aaaa.txt"));
        Singleton singleton = (Singleton)inputStream.readObject();
        System.out.println(Singleton.INSTANCE == singleton);
    }
}
