public class Test {
    public static void main(String args[]) {

        Directory root = new Directory("root");

        Directory usr = new Directory("usr");
        Directory home = new Directory("home");
        Directory etc = new Directory("etc");

        root.add(usr);
        root.add(home);
        root.add(etc);

        Executable python = new Executable("python");

        etc.add(python);
        
        FindVisitor findVisitor = new FindVisitor();
        for(File file:root.getFilesIncluded()) {
            findVisitor.visit((Directory)file);
        }
    }
}