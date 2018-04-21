import java.util.*;

public class Tree<E> {
    private Node<E> root;
    private int size;

    public Tree() { root=null; size=0; }
    
    public Tree(E s) {
        root = new Node<E>(s);
        size=1;
    }

    public boolean isEmpty() { return root==null;}

    public void setRoot(Node<E> root) {
        this.root = root;
    }

    public Node<E> getRoot() { return root; }

    public int size() {
        this.size = 0;
        if(!isEmpty()) { 
            this.size+=getChildrenSize(root);
        }
        return this.size;
    }

    private int getChildrenSize(Node<E> node) {
        List<Node<E>> children = new ArrayList<Node<E>>();
        children = node.getChildren();
        if (children.size()!=0) {
            for (Node<E> child : children) {
                this.size+=getChildrenSize(child);
            }
        }
        return 1;
    }
}