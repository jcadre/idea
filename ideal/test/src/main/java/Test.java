import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JC on 2017/12/29.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("E://aaaa.txt"));
        outputStream.writeObject(list);
    }
}
