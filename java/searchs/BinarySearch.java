import java.util.ArrayList;

public class BinarySearch {
    public static int binarySearch(ArrayList<String> A, String s) {
        return binarySearch(A,0, A.size()-1,s);
    }

    public static int binarySearch(ArrayList<String> A, int lwb, int upb, String s) {
        if(lwb > upb) return -1;
        int mid = (lwb + upb) / 2;
        int comparison = s.compareTo(A.get(mid));
        if (comparison == 0) return mid;
        if (comparison < 0 ) return binarySearch(A,lwb,mid-1,s);
        else return binarySearch(A, mid+1, upb, s);
    }


    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        for (int i=1;i<=10;i++) {
            array.add("s"+i);
        }

        Collections.shuffle(array);
        System.out.println(array);
        System.out.println(binarySearch(array,"s5"));
    }
}