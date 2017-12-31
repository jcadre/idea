package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by JC on 2017/12/28.
 */
public class Lambda {
    /*public static void main(String[] args){
        lambda.Lambda lambda.Lambda = new lambda.Lambda();
        lambda.Lambda.lambdaTest();
    }

    public void lambdaTest(){
        new Thread(lambda.Lambda::print).start();
    }

    public static void print(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }*/
    /*public static void main(String[] args){
        new Thread(() -> System.out.println("线程启动")).start();
    }*/
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        //list.forEach((s)->);
        Consumer<String> consumer = (String t)->{System.out.println(String.format("consumer receive-->%s", t));};
        Consumer<String> consumer2 = (String t)->{System.out.println(String.format("consumer2 receive-->%s", t));};
        Consumer<String> consumer3 = (String t)->{System.out.println(String.format("consumer3 receive-->%s", t));};
        consumer.andThen(consumer2).andThen(consumer3).accept(new String("aaa"));
    }
}
