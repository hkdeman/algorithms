public class Node<E extends Comparable<E>,T> {

    private E key;
    private T value;
    private Node<E,T> next;

    public Node(E key,T value,Node<E,T> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public E getKey() { return key; }
    public T getValue() { return value; }
    public Node<E,T> getNext() { return next; }

    public void setKey(E key) { this.key = key; }
    public void setValue(T value) { this.value = value; }
    public void setNext(Node<E,T> next) { this.next = next; }

    public String toString() {
        return key.toString() + ":"+value.toString();
    }

    public int compareTo(E otherKey) {
        return key.compareTo(otherKey);
    }
}