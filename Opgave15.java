import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Козак on 04.10.2016.
 */
class Equal<T> {
    T element;
    LinkedList<T> list = new LinkedList<T>();
    LinkedList<T> newlist = new LinkedList<T>();
    Equal() {
    }
    Equal(LinkedList<T> list) {
        this.list = list;
    }
    public boolean notEquals(LinkedList<T> newlist) {
        this.newlist = newlist;
        if(list.containsAll(newlist)) {
            return false;
        } else return true;
    }
}
public class Opgave15 {
    public static void main(String args[]) {
        LinkedList<Integer> first = new LinkedList<>(Arrays.asList(3,9,4,3,2,16,7,3,4));
        LinkedList<Integer> second = new LinkedList<>(Arrays.asList(3,9,4,3,2,16,7,3,4,1));
        LinkedList<Integer> third = new LinkedList<>(Arrays.asList(3,9,4,3,2,16,7,3,4));
        Equal list = new Equal(first);
        System.out.println(list.notEquals(second));
        System.out.println(list.notEquals(third));
    }
}