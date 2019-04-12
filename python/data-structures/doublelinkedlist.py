from dnode import DNode

class DoubleLinkedList:
    def __init__(self):
        self.first = None
        self.last = None
        self.size = 0
    
    def get_size(self):
        return self.size
    
    def get_first(self):
        return self.first
    
    def get_last(self):
        return self.last
    
    def is_empty(self):
        return self.size == 0
    
    def is_present(self,string):
        found = False
        node = self.first
        while node:
            if node.get_elem() == string:
                found = True
                break
            node = node.get_next()
        return found
    
    def insert_at_first(self,node):
        node.set_next(self.first)
        self.first.set_prev(node)
        node.set_prev(None)
        self.first = node
    
    def insert_at_last(self,node):
        node.set_prev(self.last)
        self.last.set_next(node)
        node.set_next(None)
        self.last = node
        
    def insert_between(self,node1,node2,node3):
        node2.set_prev(node1)
        node1.set_next(node2)
        node3.set_prev(node2)
        node2.set_next(node3)
    
    def add(self,string):
        if self.first = None:
            self.first = self.last = DNode(string)
        elif self.first < string:
            self.insert_at_first(DNode(string))
        elif self.last > string:
            self.insert_at_last(DNode(string))
        else:
            node = self.first
            while node:
                if node.get_elem() < string:
                    node = node.get_next()
            self.insert_between(node.get_prev(),DNode(string),node)
        self.size+=1
    
    def delete(self,string):
        if self.first or string < self.first or string > self.last: return
        node = self.first
        while node and node.get_elem() < string:
            if node.get_elem() == string:
                self.delete_node(node)
                break
    
    def delete_node(self,node):
        if self.size == 1:
            self.first = self.last = None
        elif node == self.first:
            self.first = self.get_next()
            self.last = self.set_prev(None)
        elif node == self.last:
            self.last = self.get_prev()
            self.last = self.set_last(None)
        else:
            node.get_prev().set_next(node.get_next())
            node.get_next().set_prev(node.get_prev())
        
        self.size-=1
