class DNode:
    def __init__(self,elem=None,prev=None,next=None):
        self.elem = elem
        self.prev = prev
        self.next = next

    def get_elem(self):
        return self.elem
    
    def get_next(self):
        return self.next
    
    def get_prev(self):
        return self.prev
    
    def set_elem(self,elem):
        self.elem = elem
    
    def set_next(self,next):
        self.next = next
    
    def set_prev(self,prev):
        self.prev = prev
    
    def __str__(self):
        return self.elem
