public class ArrayQueue<E> {
    private E[] queue;
    private int capacity;
    private static final int CAPACITY = 10; //default capacity is 10 
    private int front,rear;
    private int size;

   public ArrayQueue() { this(CAPACITY); }

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = (E[]) new Object[capacity];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) { return true; }
        return false;
    }

    public boolean isFull() {
        if ((rear+1)%capacity == front) { return true; }
        return false;
    }

    public void enqueue(E s) {
        if (isFull()) throw new ArrayQueueException("Queue is already full");
        else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear+1) % capacity;
        }
        queue[rear] = s;
        size++;
    }

    public E dequeue() {
        E node = null;
        if (isEmpty()) {
            throw new ArrayQueueException("Queue is empty");
        }
        else if (front == rear ) {
            node = queue[front];
            front = rear = -1;
        } else {
            node = queue[front];            
            front = (front+1) % capacity;
        }
        size--;
        return node;
    }

    public E getFront() {
        if (isEmpty()) throw new ArrayQueueException("Queue is empty");
        return queue[front];
    }

    public String toString() {
        String s = "[";
        if(!isEmpty()) {
            for(int i=0;i<size-1;i++) {
                s+=queue[(front+i) % capacity];
                s+=",";
            }
            s+=queue[(front+size-1) % capacity];
        }
        return s+"]";
    }

}