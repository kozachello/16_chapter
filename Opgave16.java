import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Козак on 04.10.2016.
 */

class Even {
    LinkedList<Integer> list = new LinkedList<>();
    LinkedList<Integer> newlist = new LinkedList<>();
    int element;
    Even() {
    }
    Even(LinkedList<Integer> list) {
        this.list = list;
    }
    public LinkedList<Integer> removeEvens() {
        for(int x=0; x<list.size(); x+=2) {
            element = list.get(x);
            newlist.add(element);
        }
        list.removeAll(newlist);
        return newlist;
    }
    public LinkedList<Integer> checkList() {
        return list;
    }
}

public class Opgave16 {
    public static void main(String args[]) {
        LinkedList<Integer> first = new LinkedList<>(Arrays.asList(1,4,12,7,8,17,2,4));
        Even even = new Even(first);
        LinkedList<Integer> second = even.removeEvens();
        System.out.println(second);
        System.out.println(even.checkList());
    }
}