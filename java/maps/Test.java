public class Test {
    public static void main(String[] args) {
        ListBasedMaps<Integer,String> map = new ListBasedMaps<Integer,String>();
        map.put(1,"Hello");
        map.put(3,"Hello");
        map.put(4,"Hello");
        System.out.println(map);
        map.remove(4);
        System.out.println(map);        
    }
}