public class Node<E extends Comparable> {
    private E element;
    private Node next;

    public Node() {
        this(null,null);
    }

    public Node(E s, Node n) {
        element = s;
        next = n;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setElement(E s) {
        element = s;
    }

    public void setNext(Node node) {
        next = node;
    }

    public String toString() {
        return element.toString();
    }

    public int compareTo(E s) {
        return element.compareTo(s);
    }

}