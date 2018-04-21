import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class BubbleSort {
    
    public static void bubbleSort(ArrayList<Integer> array) {
        int n = array.size();
        int temp = 0;

        for (int i=0;i<n;i++) {
            for (int j=1;j<(n-i);j++) {
                if(array.get(j-1) > array.get(j)) {
                    temp = array.get(j-1);
                    array.set(j-1, array.get(j));
                    array.set(j, temp);
                }
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=1;i<=10;i++) {
            array.add(i);
        }

        Collections.shuffle(array);

        System.out.println(array);
        bubbleSort(array);
        System.out.println(array);        
    }


}