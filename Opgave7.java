import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/**
 * Created by Козак on 22.09.2016.
 */
public class Opgave7 {
    public static int deleteBack(ArrayDeque<Integer> list) {
        int result = -1;
        NoSuchElementException e1 = new NoSuchElementException("No Elements !!!");
        if (list.size() > 0) {
            try {
                result = list.pollLast();
                return result;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Wrong Index !!!");
            } catch (NullPointerException e) {
                System.out.println("What The Point ???");
            }
        } else {
            System.out.print(e1+" in the list "+list);
        }
        return result;
    }
    public static void main(String args[]) {
        ArrayDeque<Integer> first = new ArrayDeque<>();
        ArrayDeque<Integer> second = new ArrayDeque<>();
        int[] arr = {1,5,7,6,5,3,4,8,0};
        for(int x: arr) {
            first.push(x);
        }
        System.out.println(deleteBack(first));
        System.out.println(deleteBack(second));
    }
}