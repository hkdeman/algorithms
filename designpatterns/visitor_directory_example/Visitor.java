public interface Visitor {
    public void visit(Executable executable);
    public void visit(Shortcut shortcut);
    public void visit(Directory directory);
}