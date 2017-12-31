package serialize;

import java.io.*;

/**
 * Author JC on 2017/12/31.
 * Email: jiangchaokenan@gmail.com
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("JC");
        System.out.println("==========");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E://aaaa.txt"));
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("==========");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E://aaaa.txt"));
        Student foo21= (Student)ois.readObject();
        System.out.println("==========");
        System.out.println(foo21);
        ois.close();
    }
}
