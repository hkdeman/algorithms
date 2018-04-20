public class DoublyLinkedList<E extends Comparable> {
    private int size  = 0;
    private DNode<E> first,last;

    public DoublyLinkedList() { 
        size=0;
        first=last=null;
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public DNode<E> getFist() { return first; }

    public DNode<E> getLast() { return last; }

    public boolean isPresent(E s) {
        boolean found = false;
        for(DNode<E> cursor=first; cursor != null && !found && cursor.compareTo(s) <= 0 ; cursor.getNext()) {
            found = cursor.compareTo(s) == 0;
        }
        return found;
    }

    public void insert(E s) {
        if (first ==null) {
            first=last= new DNode<E>(s);
        } else if (first.compareTo(s) >=0 ) {
            insertAtFirst(new DNode<E>(s));
        } else if (last.compareTo(s)<=0) {
            insertAtLast(new DNode<E>(s));
        } else {
            DNode<E> cursor = first;
            while (cursor.compareTo(s) < 0 ) cursor = cursor.getNext();
            DNode<E> node = new DNode<E>(s);
            insertBetween(cursor.getPrev(),node,cursor);
        }
        size++;
    }

    private void insertAtFirst(DNode<E> node) {
        first.setPrev(node);
        node.setNext(node);
        node.setPrev(null);        
        first = node;
    }

    private void insertAtLast(DNode<E> node) {
        last.setNext(node);
        node.setPrev(last);
        node.setNext(null);
        last = node;
    }

    private void insertBetween(DNode<E> prev, DNode<E> node, DNode<E> next) {
        prev.setNext(node);
        node.setPrev(prev);
        node.setNext(next);
        next.setPrev(node);
    }

    public void delete(E s) {
        if(first == null || first.compareTo(s) > 0 || last.compareTo(s) < 0) return;
        
        for(DNode<E> cursor = first; cursor!=null && cursor.compareTo(s) <=0;cursor = cursor.getNext()) 
            if (cursor.compareTo(s)==0) {
                delete(cursor); 
                return;
            }
    }

    public void delete(DNode<E> node) {
        if(size==1) { first = last = null; }
        else if (node == first) {
            first = first.getNext();
            first.setPrev(null);
        } else if (node == last) {
            last = last.getPrev();
            last.setNext(null);
        } else {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
        size--;
    }

    public String toString() {
        DNode<E> cursor = first;
        String s = "(";
        while (cursor !=null ){
            s = s+cursor;
            cursor = cursor.getNext();
            if (cursor!=null) s = s + ",";
        }
        return s + ")";
    }

}