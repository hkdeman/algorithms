public class Test {
    public static void main(String args[]) {
        
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        
        list.addFront("1");
        list.addFront("2");
        list.addBack("3");
        System.out.println(list);

        list.insert("6");
        list.insert("4");        
        System.out.println(list);
        list.remove("3");
        System.out.println(list);

        DoublyLinkedList<String> dlist = new DoublyLinkedList<String>();

        dlist.insert("Hello");
        dlist.insert("Yo");
        dlist.insert("Never");
        System.out.println(dlist);

        dlist.delete("Hello");
        System.out.println(dlist);
    }
}