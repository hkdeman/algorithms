class TNode:
    def __init__(self,elem,parent=None):
        self.elem = elem
        self.parent = parent
        self.children = []
    
    def has_children(self):
        return len(self.children) != 0

    def get_elem(self):
        return self.elem
    
    def get_children(self):
        return self.children
    
    def get_parent(self):
        return self.parent
    
    def set_elem(self,elem):
        self.elem = elem
    
    def set_parent(self,parent):
        self.parent = parent  
    
    def add_children(self,child):
        self.children.append(child)
        child.set_parent(self)

    def __str__(self):
        s  = "("+self.elem
        if self.has_children():
            s += self.para_print()
        return s+")"

    def para_print(self):
        pretty_print = []
        for child in self.children:
            s = str(child.get_elem())
            if child.has_children():
                s+=child.para_print()
            pretty_print.append(s)
        return "("+",".join(pretty_print)+")"