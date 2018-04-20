public class ArrayStack<E> {
    private int capacity; //stack capacity
    private static final int CAPACITY = 100; //default stack capacity
    private E[] S; // E array used to implement the stack
    private int tos = -1; // index of the top of stack

    public ArrayStack() {this(CAPACITY);};

    public ArrayStack(int cap) {
        capacity = cap;
        S = (E[]) new Object [capacity];
    }

    public int size() { return tos+1; }

    public boolean isEmpty() { return tos == -1; }

    public void push(E element) throws StackException {
        if (size() == capacity) throw new StackException("Stack Overflow");
        tos++;
        S[tos] = element;
    }

    public E top() throws StackException {
        if (isEmpty()) throw new StackException("Stack Empty");
        return S[tos];
    }

    public E pop() throws StackException {
        if (isEmpty()) throw new StackException("Stack Underflow");
        E element = S[tos];
        S[tos]=null;
        tos--;
        return element;
    }

    public String toString() {
        String s= "[";
        if (tos >=0) s= s+ S[0]; 
        for(int i=1;i<=tos;i++) {
            s+=","+S[i];
        }
        return s + "]";
    }
    
}