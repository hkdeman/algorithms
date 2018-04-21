public class Test {
    public static void main(String[] args) {
        Tree<String> tree = new Tree<String>("Parent");
        tree.getRoot().addChild("Child1");
        tree.getRoot().addChild("Child2");
        tree.getRoot().addChild("Child3");    
        tree.getRoot().getChildren().get(2).addChild("Child4");    
        
        System.out.println(tree.size());
    }
}