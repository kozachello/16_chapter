
import java.util.*;

/**
 * Created by Козак on 22.09.2016.
 */
public class Opgave3 {

    public static boolean isSorted(ArrayList<Integer> list) {
        boolean check = true;
        for(int i=0; i<list.size(); i++) {
            int a = list.get(i);
            if(i+1<list.size()) {
                if (a > list.get(i + 1)) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static void main(String args[]) {
        int[] arr = {1,2,4,2,9,0,0,8,4,0,4,5,1,0};
        ArrayList<Integer> one = new ArrayList<>();
        SortedSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> two = new ArrayList<>();
        for(int i: arr) {
            one.add(i);
        }
        System.out.print(isSorted(one));
        for(int i: arr) {
            set.add(i);
        }
        two.addAll(set);
        System.out.print("\n"+isSorted(two));
    }
}
