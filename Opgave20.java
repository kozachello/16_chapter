import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Козак on 04.10.2016.
 */
class Shift<T> {
    private LinkedList<T> list = new LinkedList<T>();
    private int index = 1;
    private T element;
    private LinkedList<T> newlist = new LinkedList<T>();
    Shift() {}
    Shift(LinkedList<T> list) {
        this.list = list;
    }
    public LinkedList<T> shift() {
        while(index < list.size()) {
            element = list.get(index);
            newlist.add(element);
            index+=2;
        }
        list.removeAll(newlist);
        list.addAll(newlist);
        return list;
    }
}
public class Opgave20 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,31,42,23,44,75,86));
        Shift odd = new Shift(list);
        System.out.println(odd.shift());
    }
}
