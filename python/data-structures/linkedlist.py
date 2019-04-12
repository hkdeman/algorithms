from node import Node

class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

    def add(self,item):
        self.head = Node(item,self.head)
        self.size+=1

    def size(self):
        return self.size

    def get_head(self):
        return self.head

    def is_empty(self):
        return self.size==0

    def is_present(self,string):
        node = self.head
        found = False
        if self.is_empty():
            return found
        while node and not found:
            if node.get_item() == string:
                found = True
            node = node.get_next()
        return found

    def __str__(self):
        node = self.head
        string = ""
        if self.is_empty():
            return string
        for i in range(0,self.size-1):
            string+=node.get_item()+"\n"
            node = node.get_next()
        string+=node.get_item()
        return string
