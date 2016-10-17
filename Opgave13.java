import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Козак on 03.10.2016.
 */

class Transfer {
    LinkedList<Integer> list = new LinkedList<>();
    Transfer() {
    }
    Transfer(LinkedList<Integer> list) {
        this.list = list;
    }
    public LinkedList<Integer> transferFrom(LinkedList<Integer> trans) {
        for(int x: trans) {
            list.addLast(x);
        }
        trans.clear();
        return list;
    }
}

public class Opgave13 {
    public static void main(String args[]) {
        LinkedList<Integer> first = new LinkedList<>(Arrays.asList(8,17,2,4));
        LinkedList<Integer> second = new LinkedList<>(Arrays.asList(1,2,3));
        Transfer transfer = new Transfer(first);
        System.out.println(transfer.transferFrom(second));
    }
}
