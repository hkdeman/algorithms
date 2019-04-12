class BTNode:
    def __init__(self,elem=None,left=None,right=None,parent=None):
        self.elem = elem
        self.left = left
        self.right = right
        self.parent = parent
    
    def get_elem(self):
        return self.elem
    
    def get_left(self):
        return self.left
    
    def get_right(self):
        return self.right
    
    def get_parent(self):
        return self.parent
    
    def set_elem(self,elem):
        self.elem = elem
    
    def set_left(self,left):
        self.left = left
    
    def set_right(self,right):
        self.right = right
    
    def set_parent(self,parent):
        self.parent = parent
    
    def degree(self):
        degree = 0 
        if left!=None: degree+=1
        if right!=None: degree+=1
        return degree
    
    def is_root(self):
        return self.parent == None
    
    def is_left(self):
        return self.degree() == 0
    
    def is_internal(self):
        return self.degree() == 2
    
    def is_left_child(self):
        return self.parent.get_left() == self
    
    def is_right_child(self):
        return self.parent.get_right() == self
    
    def has_left(self):
        return self.left!=None
    
    def has_right(self):
        return self.right!=None
    
    def get_min(self):
        node = self
        while node.get_left()!=None:
            node = node.get_left()
        return node
