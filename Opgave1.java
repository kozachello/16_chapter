import java.util.LinkedList;

/**
 * Created by KO3AK on 20-09-2016.
 */

public class Opgave1 {
    public static LinkedList set(int index, String value) {
        LinkedList<String> list = new LinkedList<>();
        list.add("alex");
        list.add("david");
        list.add("ahmed");
        list.add(index, value);
        return list;
    }
    public static void main(String args[]) {
        String[] names = {"vasja", "petja", "dusja", "marusja"};
        int i = 0;
            for(String name: names) {
                System.out.println(set(i, name));
                i++;
            }
    }
}
