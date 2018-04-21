import sun.net.www.content.text.plain;

public class BSTree<E extends Comparable<E>> {

    private BTNode<E> root;
    private int size;

    public BSTree() { root=null; size=0; }

    public BTNode<E> root() { return root; }
    public boolean isEmpty() { return root==null; }
    public int size() { return size; }

    public void insert(E s) {
        if(isEmpty()) { 
            root=new BTNode(s,null,null,null);
            size=1;
        } else {
            insert(s,root);
        }
    }

    public void insert(E s,BTNode<E> subTree) {
        if(subTree.compareTo(s)>0) {
            if(subTree.hasLeft()) {
                insert(s,subTree.left());
            } else {
                BTNode<E> node = new BTNode<>(s,null,null,null);
                subTree.setLeft(node);
                node.setParent(subTree);
            }
        } else {
            if(subTree.hasRight()) {
                insert(s,subTree.right());
            } else {
                BTNode<E> node = new BTNode<>(s,null,null,null);
                subTree.setRight(node);
                node.setParent(subTree);
            }
        }
    }

    public boolean isPresent(E s) {
        return root!=null && find(s,root)!=null;
    }

    private BTNode<E> find(E s,BTNode<E> node) {
        if(node.compareTo(s)==0) {
            return node;
        } else if (node.compareTo(s)<0 && node.hasRight()) {
            find(s,node.right());
        } else if (node.compareTo(s)>0 && node.hasLeft()) {
            find(s,node.left());
        }
        return null;
    }

    public void delete(E s) {
        BTNode<E> node = find(s,root);
        if (node==null) { return; }
        
        if(node.isRoot() && node.isLeaf()) {
            root = null;
        } else if(node.isRoot() && !node.hasLeft() && node.hasRight()) {
            root = node.right();
        } else if(node.isRoot() && !node.hasRight() && node.hasLeft()) {
            root = node.left();
        } else {
            delete(node);
        }
        size--;
    }

    public void delete(BTNode node) {
        if(node.isInternal()) {
            
        }
    }

}