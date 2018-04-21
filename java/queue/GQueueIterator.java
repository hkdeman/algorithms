import java.util.Iterator;
import java.util.NoSuchElementException;

public class GQueueIterator<E extends Comparable<E>> implements Iterator<E> {

    private Node<E> cursor;
    private GQueue<E> Q;

    public GQueueIterator(GQueue<E> Q) {
        cursor = Q.getFront();
        this.Q = Q;
    }

    public boolean hasNext() { return cursor!=null; }

    public E next() throws NoSuchElementException {
        if (cursor == null ) throw new NoSuchElementException("Come on Man...");
        E element = cursor.getElement();
        cursor = cursor.getNext();
        return element;
    }

}