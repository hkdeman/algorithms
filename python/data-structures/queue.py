from node import Node

class Queue:
    def __init__(self):
        self.front = None
        self.rear = None
        self.size = 0
    
    def size(self):
        return self.size

    def is_empty(self):
        return self.size == 0
    
    def peek(self):
        if self.is_empty(): raise Exception("Peek on an empty sequence")
        return self.front.get_item()
    
    def enqueue(self,item):
        if not self.front:
            self.front = self.rear = Node(item)
        else:
            self.rear.set_next(Node(item))
            self.rear = self.rear.get_next()
        self.size+=1
    
    def dequeue(self):
        if self.is_empty(): raise Exception("Dequeue on an empty queue")
        result = self.front.get_item()
        self.front = self.front.get_next()
        self.size-=1
        return result
    
    def __str__(self):
        node = self.front
        s = "("
        while node != None:
            s += node.get_item()
            node = node.get_next()
            if node!=None: s+=","
        return s+")"
    
    def iterator(self):
        return QIterator(self)
    
    def get_front(self):
        return self.front


class QIterator():
    def __init__(self,Q):
        self.Q = Q
        self.cursor = Q.get_front()
    
    def has_next(self):
        return self.cursor != None
    
    def next(self):
        if self.cursor == None: raise Exception("Nout")
        elem = self.cursor.get_item()
        self.cursor = self.cursor.get_next()
        return elem
