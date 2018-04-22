import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;

public class MergeSort {
    private static ArrayList<Integer> mergeSort(ArrayList<Integer> l) {
        if(l.size()<2) return l;

        int mid = Math.floorDiv(l.size(), 2);
        ArrayList<Integer> left = mergeSort(new ArrayList<Integer>(l.subList(0, mid)));
        ArrayList<Integer> right = mergeSort(new ArrayList<Integer>(l.subList(mid,l.size())));

        return merge(left,right);

    }

    private static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        if (left.size() == 0) { return left; }
        else if (right.size() == 0) { return right;}
        
        int i=0,j=0;
        
        ArrayList<Integer> result = new ArrayList<Integer>();

        while(result.size() < left.size()+right.size()) {
            if(left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i+=1;
            } else {
                result.add(right.get(j));
                j+=1;
            }
            if (i==left.size()) {
                result.addAll(new ArrayList<Integer>(right.subList(j, right.size())));
                break;
            } else if (j==right.size()) {
                result.addAll(new ArrayList<Integer>(left.subList(i, left.size())));
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> S = new ArrayList<>();
        for(int i=0;i<10;i++) {
            S.add(i);
        }
        Collections.shuffle(S);
        System.out.println(S);

        ArrayList<Integer> sorted = mergeSort(S);
        System.out.println(sorted);
    }
}