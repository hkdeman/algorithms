public class ListBasedMaps<E extends Comparable<E>,T> {
    private Node<E,T> head;
    private Node<E,T> tail;
    private int size;

    public ListBasedMaps() {
        head = tail = null;
        size = 0;
    }

    public Node<E,T> getHead() { return head; }
    public Node<E,T> getTail() { return tail; }
    public int size() { return size; }

    public void setHead(Node<E,T> head) { this.head = head; }
    public void setTail(Node<E,T> tail) { this.tail = tail; }

    public boolean isEmpty() { return size==0; }

    public boolean isPresent(E key) {
        boolean found = false;
        for(Node<E,T> cursor = head; cursor!=null && !found; cursor = cursor.getNext()) {
            if(cursor.getKey().equals(key)) { found = true; }
        }
        return found;
    }

    public void put(E key, T value) {
        if (isPresent(key)) { throw new ListBasedMapsException("Key already exists");}
        else {
            Node<E,T> node = new Node<E,T>(key,value,head);            
            if(isEmpty()) {
                head = tail = node;
            } else {
                head = node;
            }
            size++;
        }
    }

    public void remove(E key) {
        if(!isPresent(key)) { throw new ListBasedMapsException("Key doesn't exist!"); }
        else {      
            //if at the head
            if(head.getKey().equals(key)) {
                head = head.getNext();
                return;
            }
            //else later
            Node<E,T> cursor=head;
            Node<E,T> prev = head;
            while(cursor!=null) {
                if(cursor.getKey().equals(key)) {
                    if(cursor.getNext()!=null) {   
                        //if in middle                    
                        prev.setNext(cursor.getNext());
                    } else {
                        //if at last position
                        prev.setNext(null);
                        tail = prev;
                    }
                }
                prev = cursor;
                cursor=cursor.getNext();
            }
        }
    }
    
    public String toString() {
        String s = "{";
        if(!isEmpty()) {
            Node<E,T> cursor = head;
            while(cursor!=null) {
                s+=cursor;
                if(cursor.getNext()!=null) { s+=","; }
                cursor = cursor.getNext();
            }
        }
        return s+"}";
    }

}