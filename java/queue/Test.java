import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        GQueue<String> queue = new GQueue<String>();
        queue.enqueue("Hello");
        queue.enqueue("Hola");
        queue.enqueue("Holaaasss");

        System.out.println(queue);

        System.out.println(queue.getFront());

        Iterator iterator = queue.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayQueue<String> aqueue = new ArrayQueue<String>();
       
        System.out.println(aqueue);
       
        for(int i=0;i<10;i++) {
            aqueue.enqueue("Index"+i);
            System.out.println(aqueue);
        }

        System.out.println(aqueue.getFront());
        System.out.println(aqueue.dequeue());    
        System.out.println(aqueue);
        aqueue.enqueue("yo");        
        System.out.println(aqueue);        
    }
}