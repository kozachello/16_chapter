import java.util.*;

/**
 * Created by Козак on 01.10.2016.
 */
public class Opgave8 {
    public static ArrayList<Integer> switchPairs(ArrayList<Integer> list) {
        if(list.size()%2 != 0) {
            list.add(list.size(), null);
        }
        int value = 1;
        for(int i=0; i<list.size(); i+=2) {
            if(list.get(value) != null) {
                Collections.swap(list, i, value);
            } else break;
            value += 2;
        }
        list.remove(null);
        return list;
    }
    public static void main(String args[]) {
        int[] arr = {10, 25, 31, 47, 52, 68, 77};
        ArrayList<Integer> list = new ArrayList<>();
        for(int x: arr) {
            list.add(x);
        }
        System.out.println(switchPairs(list));
    }
}
