import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Козак on 04.10.2016.
 */
class Rotate<T> {
    private T element;
    private LinkedList<T> list = new LinkedList<T>();
    Rotate() {}
    Rotate(LinkedList<T> list) {
        this.list = list;
    }
    public void rotate() {
        element = list.pollFirst();
        list.addLast(element);
    }
}
public class Opgave19 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(8,23,19,7,45,98,102,4));
        Rotate rot = new Rotate(list);
        rot.rotate();
        System.out.println(list);
    }
}
