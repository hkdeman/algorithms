from tnode import TNode
class Tree:
    def __init__(self):
        self.root = None
        self.size = 0
    
    def get_root(self):
        return self.root
    
    def size(self):
        return self.size
    
    def set_root(self,node):
        self.root = TNode(node)
        self.size+=1

    def __str__(self):
        return str(self.root)


# Tree test
# t= Tree()
# t.set_root("1")
# root = t.get_root()
# m1 = TNode("2")
# m2 = TNode("3")
# m3 = TNode("4")
# root.add_children(TNode(m1,parent=root))
# root.add_children(TNode(m2,parent=root))
# root.add_children(TNode(m3,parent=root))