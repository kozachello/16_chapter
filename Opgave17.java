import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Козак on 04.10.2016.
 */
class Range<T> {
    Range() {}
    int start, end;
    List<T> list = new LinkedList<T>();
    Range(List<T> list) {
        this.list = list;
    }
    public List<T> removeRange(int i, int j) {
        start = i;
        end = j+1;
            if (start <= 0 || end >= list.size() - 1) {
                throw new IllegalArgumentException("Illegal Arguments!");
            } else {
                list.subList(start, end).clear();
            }
        return list;
    }
}
public class Opgave17 {
    public static void main(String args[]) {
        List<Integer> list = new LinkedList<>(Arrays.asList(2,34,6,75,3,1,76,9,0,8));
        Range range = new Range(list);
        System.out.println(range.removeRange(2,7));
        System.out.println(range.removeRange(0,7));
    }
}
