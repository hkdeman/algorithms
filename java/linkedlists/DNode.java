public class DNode<E extends Comparable> {
    private E element;
    private DNode<E> next,prev;

    public DNode(E s, DNode<E> prev, DNode<E> next) {
        element = s;
        this.prev = prev;
        this.next = next;
    }

    public DNode(E s) {
        element = s;
        next=prev=null;
    }

    public E getElement() { return element; }

    public DNode<E> getPrev() { return prev; }

    public DNode<E> getNext() { return next; }

    public void setElement(E s) { element = s; }

    public void setPrev(DNode<E> prev) { this.prev = prev; }

    public void setNext(DNode<E> next) { this.next = next; }

    public String toString() { return element.toString(); }

    public int compareTo(E s) { return element.compareTo(s); }

}