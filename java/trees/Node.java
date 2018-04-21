import java.util.*;

public class Node<E> {
    private List<Node<E>> children;
    private Node<E> parent = null;
    private E data = null;

    public Node(E data) {
        children = new ArrayList<Node<E>>();
        this.data = data;
    }

    public Node(E data, Node<E> parent) {
        children = new ArrayList<Node<E>>();
        this.data = data;
        this.parent = parent;
    }

    public List<Node<E>> getChildren() { return children; }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public void addChild(E data) {
        Node<E> child = new Node<E>(data);
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(Node<E> child) {
        child.setParent(this);
        this.children.add(child);
    }

    public E getData() { return this.data; }
    public void setData(E data) { this.data = data; }
    public boolean isRoot() { return this.parent == null; }
    public boolean isLeaf() { return this.children.size() == 0; }
    public void removeParent() { this.parent = null; }

} 