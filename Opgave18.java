import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Козак on 04.10.2016.
 */
class Copy<T> {
    Copy() {}
    private int size;
    LinkedList<T> list = new LinkedList<T>();
    LinkedList<T> newlist = new LinkedList<T>();
    Copy(LinkedList<T> list) {
        this.size = list.size()*2;
        this.list = list;
    }
    public LinkedList<T> doubleList() {
        newlist.addAll(list);
        for(T x: list) {
            newlist.addLast(x);
        }
        return newlist;
    }
}
public class Opgave18 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,3,2,7));
        LinkedList<String> names = new LinkedList<>(Arrays.asList("Bob","Anna","Louise"));
        Copy copy = new Copy(list);
        System.out.println(copy.doubleList());
        copy = new Copy(names);
        System.out.println(copy.doubleList());
    }
}
