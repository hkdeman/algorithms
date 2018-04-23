public class FindVisitor implements Visitor {
    public void visit(Executable executable) {
        System.out.println(executable.showInfo());
    }
    public void visit(Shortcut shortcut) {
        System.out.println(shortcut.showInfo());        
    }
    public void visit(Directory directory) {
        System.out.println(directory.showInfo());
    }
}