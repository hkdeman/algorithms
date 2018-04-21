public class Hashtable {
    private int capacity;
    private Object[] S;
    private int a;
    private int scalingFactor;
    private int shift;
    private int size;

    public HashTable(int capacity,int a,int scalingFactor,int shift) {
        this.capacity = capacity;
        this.a = a;
        this.scalingFactor = scalingFactor;
        this.shift = shift;
        s = new Object[capacity];
        for (int i=0;i<capacity;i++) S[i] = new ArrayList<String>();
        size = 0;
    }

    public HashTable() {
        capacity = 1;
        a = 1;
        scalingFactor = 1;
        shift = 0;
        S = new Object[capacity];
        for (int i=0;i<capacity;i++) S[i] = new ArrayList<String>();
        size =0;
    }

    public int size() { return size; }

    public boolean isEmpty() { return size > 0; }

    private long hashCode(String s) {
        long h =7;
        for (int i=0;i<s.length();i++) h=a*h + s.charAt(i);
        return h;
    }

    private int hash(String s) {
        return (int) (Math.abs(scalingFactor*hashCode(s)+shift) % capacity);
    }

    public void put(String s) {
        int i = hash(s);
        ArrayList<String> bucket = (ArrayList<String>)S[i];
        if(!bucket.contains(s)) { bucket.add(s);size++;}
    }

    public boolean get(String s) {
        int i = hash(s);
        ArrayList<String> bucket = (ArrayList<String>)S[i];
        return bucket.contains(s);
    }

    

}