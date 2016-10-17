
import java.util.*;

/**
 * Created by Козак on 22.09.2016.
 */
public class Opgave2 {

    public static void ex(Set<Integer> set) {
        if(set.isEmpty()) {
            throw new NoSuchElementException("EMPTY !!!");
        }
    }
    public static int moreThenOne(int[] arr) {
        int size = arr.length;
        for(int i=0; i<size; i++) {
            return arr[i];
        }
        return 0;
    }

    public static int max(ArrayList<Integer> list) {
        SortedSet<Integer> set = new TreeSet<>(list);
        ex(set);
        int value = set.last();
        set.remove(value);
        int nextvalue = set.last();
        if(nextvalue==value) {
            int[] arr = {value, nextvalue};
            value = moreThenOne(arr);
        }
        return value;
    }

    public static void main(String args[]) {
        int[] arr = {1,2,4,2,9,0,0,8,4,0,4,5,1,0};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr) {
            list.add(i);
        }
        System.out.print(max(list));
        list.removeAll(list);
        //System.out.print(max(list));
    }
}
