import java.util.ArrayList;

/**
 * Created by Козак on 22.09.2016.
 */
public class Opgave4 {
    public static int lastIndexOf(int value) {
        int index = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            list.add(i);
            list.add(i+1);
            list.add(i+3);
            if(i>5) list.add(i-4);
        }
        System.out.print(list+" total size is: "+list.size());
        index = list.lastIndexOf(value);
        return index;
    }
    public static void main(String args[]) {
        int value = 5;
        System.out.print("\n"+"Last Index Of Value " +value+ " In The List Is " +lastIndexOf(value));
    }
}
