import java.util.Iterator;

public class GQueue<E extends Comparable<E>> implements Iterable<E> {

    private Node<E> front;
    private Node<E> rear;
    private int size;

    public GQueue() {
        front = rear = null; size = 0;
    }

    public int size() { return size; }
    
    public boolean isEmpty() { return front == null; }

    public Node<E> getFront() { return front; }

    public E peek() throws QueueException {
        if (isEmpty()) throw new QueueException("Peek on an Empty Queue");
        return front.getElement();
    }

    public E dequeue() throws QueueException {
        if (isEmpty()) throw new QueueException("Dequeue on an Empty Queue");
        E result = front.getElement();
        front = front.getNext();
        size--;
        return result;
    }

    public void enqueue(E s) {
        if (front == null ){
            rear = front = new Node<E>(s,null);
        } else {
            rear.setNext(new Node<E>(s,null));
            rear = rear.getNext();
        }
        size++;
    }

    public Iterator<E> iterator() { return new GQueueIterator<E>(this); }

    public String toString() {
        Node<E> cursor = front;
        String s = "(";

        while(cursor!=null) {
            s+= cursor.getElement();
            cursor = cursor.getNext();            
            if (cursor!=null) { s+=","; }
        }
        return s+")";
    }

}