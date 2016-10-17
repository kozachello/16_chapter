import java.util.ArrayList;

/**
 * Created by Козак on 22.09.2016.
 */
public class Opgave5 {
    public static int countDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> newlist = new ArrayList<>();
        int count = 0;
        for(int j: list) {
            if(!newlist.contains(j)) {
                newlist.add(j);
            } else count++;
        }

        return count;
    }
    public static void main(String args[]) {
        int[] arr = {1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr) {
            list.add(i);
        }
        System.out.print(countDuplicates(list));
    }
}
