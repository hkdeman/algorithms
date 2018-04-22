import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    private static int max(ArrayList<Integer> S, int upb) {
        int largest = S.get(0);
        int indexOfLargest = 0;

        for(int i=1;i<=upb;i++) {
            if(S.get(i) > largest) { 
                largest = S.get(i);
                indexOfLargest = i;
            }
        }
        return indexOfLargest;
    }

    private static void swap(ArrayList<Integer> S,int i,int j) {
        int temp = S.get(i);
        S.set(i, S.get(j));
        S.set(j, temp);
    }

    private static void selectionSort(ArrayList<Integer> S) {
        int n = S.size();
        for(int i=n-1;i>0;i--) {
            swap(S, i, max(S,i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> S = new ArrayList<>();
        for(int i=0;i<10;i++) {
            S.add(i);
        }
        
        Collections.shuffle(S);
        System.out.println(S);

        selectionSort(S);
        System.out.println(S);        
    }
}