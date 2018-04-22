import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {
    public static void insertionSort(ArrayList<Integer> l) {
        int n = l.size();
        for(int i=1;i<n;i++) {
            int key = l.get(i);
            int j = i-1;

            while(j>=0 && l.get(j)>key) {
                l.set(j+1, l.get(j));
                j-=1;
            }
            l.set(j+1,key);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<10;i++) {
            l.add(i);
        }

        Collections.shuffle(l);
        System.out.println(l);

        insertionSort(l);
        System.out.println(l);
    }
}