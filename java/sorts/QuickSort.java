import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {
    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> more = new ArrayList<>();
        
        if (arr.size()>1) {
            int pivot = arr.get(0);
            for(int elem : arr) {
                if (elem < pivot) {
                    less.add(elem);
                } else if (elem == pivot) {
                    equal.add(elem);
                } else {
                    more.add(elem);
                }
            }
            ArrayList<Integer> sortedLess = quickSort(less);
            ArrayList<Integer> sortedMore = quickSort(more); 
            
            equal.addAll(sortedMore);
            sortedLess.addAll(equal);
            
            return sortedLess;
        } else {
            return arr;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> S = new ArrayList<>();
        for (int i=0;i<10;i++) {
            S.add(i);
        }

        Collections.shuffle(S);
        System.out.println(S);

        ArrayList<Integer> sorted = quickSort(S);
        System.out.println(sorted);
    }
}