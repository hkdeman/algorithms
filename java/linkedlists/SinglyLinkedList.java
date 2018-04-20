public class SinglyLinkedList<E extends Comparable> {
    private Node<E> head;
    private long size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public void addFront(E s) {
        head = new Node<E>(s,head);
        size++;
    }

    public long size() { return size; }

    public Node getHead() { return head; }

    public boolean isEmpty() { return head == null; }

    public void removeFirst() throws ListException {
        if (!isEmpty()) {
            head=head.getNext(); 
            size--;
        } else {
            throw new ListException("Attempted remove from an empty list");
        }
    }

    public String toString() {
        Node cursor = head;
        String s = "(";
        while (cursor !=null ){
            s = s+cursor;
            cursor = cursor.getNext();
            if (cursor!=null) s = s + ",";
        }
        return s + ")";
    }

    public boolean isPresent(E s) {
        boolean found = false;
        Node cursor = head;
        while(cursor!=null && !found ) {
            found = cursor.getElement().equals(s);
            cursor = cursor.getNext();
        }
        return found;
    }

    public Node getLast() {
        Node cursor = head;
        while (cursor != null){
            cursor = cursor.getNext();
            if (cursor.getNext()==null) { break; }
        }
        return cursor;
    }

    public void addBack(E s) {
        Node lastNode = getLast();
        if (lastNode != null ){
            lastNode.setNext(new Node<E>(s,null));            
        } else {
            head = new Node<E>(s,head);
        }
        size++;
    }

    public void insert(E s) {
        if (head == null || head.compareTo(s) > 0 ) {
            head = new Node<E>(s,head);
        } else {
            Node<E> cursor = head;
            Node<E> next = cursor.getNext();
            while(next!=null && next.compareTo(s) <= 0) {
                cursor = next;
                next = next.getNext();
            }
            cursor.setNext(new Node<E>(s,next));
        }
        size++;
    }

   public void remove(E s) {
       Node cursor = head;
       Node prev = null;
       while(cursor!=null) {
           if (cursor.compareTo(s) == 0) {
               if(cursor == head) removeFirst();
               else {
                   prev.setNext(cursor.getNext());
                   size--;
               }
           } else prev = cursor;
           cursor = cursor.getNext();
       }
   } 
}