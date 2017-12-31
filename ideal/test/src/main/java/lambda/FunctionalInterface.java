package lambda;

/**
 * Created by JC on 2017/12/28.
 */
@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public void pt(String s);

    default void test(String s){
        System.out.println("test");
        pt(s);
    }
}
