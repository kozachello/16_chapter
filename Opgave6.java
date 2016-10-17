import java.util.ArrayList;

/**
 * Created by Козак on 22.09.2016.
 */
public class Opgave6 {
    public static boolean hasTwoConsecutive(ArrayList<Integer> list) {
        boolean check = false;
        int value;
        for(int i=0; i<list.size(); i++) {
            value = list.get(i);
            if(i+1<list.size()) {
                if(value-(list.get(i+1))==1 || (list.get(i+1)-value==1)) {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }
    public static void main(String args[]) {
        int[] arr1 = {1, 18, 2, 7, 8, 39, 18, 40};
        int[] arr2 = {1, 18, 2, 7, 5, 39, 18, 40};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i: arr1) {
            list1.add(i);
        }
        System.out.print(hasTwoConsecutive(list1));
        for(int i: arr2) {
            list2.add(i);
        }
        System.out.print("\n"+hasTwoConsecutive(list2));
    }
}
