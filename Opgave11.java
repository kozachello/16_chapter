import java.util.Arrays;
import java.util.LinkedList;
/**
 * Created by Козак on 02.10.2016.
 */
public class Opgave11 {
    public static LinkedList<Integer> compress(LinkedList<Integer> list) {
        LinkedList<Integer> newlist = new LinkedList<>();
        int size = list.size();
        int odd;
        if(size%2 == 0) {
            for(int x=0; x<size; x+=2) {
                newlist.add(list.get(x)+list.get(x+1));
            }
        } else {
            odd = list.pollLast();
            for(int x=0; x<size-1; x+=2) {
                newlist.add(list.get(x)+list.get(x+1));
            }
            newlist.addLast(odd);
        }
        return newlist;
    }
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,7,4,6,9,3,5));
        System.out.print(compress(list));
    }
}
