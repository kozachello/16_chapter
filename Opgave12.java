import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Козак on 03.10.2016.
 */
class Split {
    LinkedList<Integer> list = new LinkedList<>();
    LinkedList<Integer> newlist = new LinkedList<>();
    Split(LinkedList<Integer> list) {
        this.list = list;
    }
    LinkedList<Integer> split() {
        for(int x: list) {
            if(x<0) {
                newlist.addFirst(x);
            } else {
                newlist.addLast(x);
            }
        }
        return newlist;
    }
}

public class Opgave12 {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(8, 7, -4, 19, 0, 43, -8, -7, 2));
        Split letsplit = new Split(list);
        System.out.print(letsplit.split());
    }
}
