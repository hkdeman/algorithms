public class BTNode<E extends Comparable<E>> {
    private E element;
    private BTNode<E> left;
    private BTNode<E> right;
    private BTNode<E> parent;

    public BTNode() {
        this(null,null,null,null);
    }

    public BTNode(E e, BTNode<E> l, BTNode<E> r,BTNode<E> p) {
        element = e;
        left = l;
        right = r;
        parent = p;
    }

    public String element() { return element; }
    public BTNode<E> left() { return left; }
    public BTNode<E> right() { return right; }
    public BTNode<E> parent() { return parent; }

    public void setElement(E s) { this.element = s; }
    public boolean setLeft(BTNode<E> x) { 
        this.left = x;
        if (x!=null) x.setParent(this); 
        return true; 
    }

    public boolean setRight(BTNode<E> x) { 
        this.right = x; 
        if (x!=null) x.setParent(this); 
        return true; 
    }

    public void setParent(BTNode<E> x) { this.parent = x; }

    private int degree() {
        int degree = 0;
        if(left!=null) degree++;
        if(right!=null) degree++;
        return degree;
    }   

    public boolean isRoot() { return parent==null; }
    public boolean isLeaf() { return degree() == 0; }
    public boolean isInternal() { return deree() == 2; }
    public boolean isLeftChild() { return parent.left() == this; }
    public boolean isRightChild() { return parent.right() == this; }
    public boolean hasLeft() { return left!=null; }
    public boolean hasRight() { return right!=null; }

    private BTNode<E> getMin() {
        BTNode<E> x = this;
        while(x.left() !=null) x = x.left();
        return x;
    }

    public String toString() { return element.toString(); }
    
    public int compareTo(E s) {
        return element.compareTo(s);
    }

}