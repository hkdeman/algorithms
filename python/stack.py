class Stack:
    def __init__(self,capacity=100):
        self.capacity = capacity
        self.stack = []
    
    def size(self):
        return len(self.stack)
    
    def is_empty(self):
        return self.size() == 0
    
    def push(item):
        if (self.size() == self.capacity):
            raise Exception("Stack Overflow")
        self.stack.append(item)
    
    def pop(self):
        if (self.size() == 0):
            raise Exception("Stack Underflow")
        return self.stack.pop()
    
    def top(self):
        if (self.size() == 0):
            raise Exception("Stack empty")
        return self.stack[-1]
    
    def __str__(self):
        return "["+",".join(self.stack)+"]"
