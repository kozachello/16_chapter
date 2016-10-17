import java.util.ArrayList;

/**
 * Created by Козак on 02.10.2016.
 */
public class Opgave9 {
    public static ArrayList<Integer> slutter(ArrayList<Integer> list) {
        ArrayList<Integer> newlist = new ArrayList<>();
        for(int x: list) {
            newlist.add(x);
            newlist.add(x);
        }
        return newlist;
    }
    public static void main(String args[]) {
        int[] arr = {1, 8, 23, 77, 4};
        ArrayList<Integer> list = new ArrayList<>();
        for(int x: arr) {
            list.add(x);
        }
        System.out.println(slutter(list));
    }
}
