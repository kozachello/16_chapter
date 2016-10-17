import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Козак on 04.10.2016.
 */
class Remove<T> {
    T element;
    LinkedList<T> list = new LinkedList<T>();
    LinkedList<T> newlist = new LinkedList<T>();
    Remove() {
    }
    Remove(LinkedList<T> list) {
        this.list = list;
    }
    public LinkedList<T> removeAll(T element) {
        this.element = element;
        for(T x: list) {
            if(element.equals(x)) {
                newlist.add(x);
            }
        }
        list.removeAll(newlist);
        return list;
    }
}
public class Opgave14 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3,9,4,3,2,16,7,3,4,1));
        Remove remove = new Remove(list);
        System.out.println(remove.removeAll(3));
    }
}
