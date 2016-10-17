import java.util.ArrayList;

/**
 * Created by Козак on 02.10.2016.
 */
class Gen<T> {
    T element;
    ArrayList<T> genlist = new ArrayList<T>();
    ArrayList<T> newgen = new ArrayList<T>();
    Gen(T el) {
        element = el;
    }
    Gen() {
    }
    T getElement(int n) {
        element = genlist.get(n);
        return element;
    }
    void add(T element) {
        genlist.add(element);
    }
    ArrayList<T> scretch(int n) {
        for(T x: genlist) {
            for(int i=0; i<n; i++) {
                newgen.add(x);
            }
        }
        return newgen;
    }
}

public class Opgave10 {
    public static void main(String args[]) {
        int[] arr = {18, 7, 3, 8, 11};
        Gen<Integer> genlist = new Gen<>();
        for(int x: arr) {
            genlist.add(x);
        }
        System.out.println(genlist.scretch(2));
    }
}
