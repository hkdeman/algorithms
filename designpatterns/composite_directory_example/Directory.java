import java.util.ArrayList;

public class Directory extends File {
    
    String extension = "/";
    ArrayList<File> filesIncluded;

    public Directory(String name) {
        this.name = name;
        filesIncluded = new ArrayList<File>();
    }

    @Override
    public void add(File file) {
        this.filesIncluded.add(file);
    }

    @Override
    public void remove(File file) {
        this.filesIncluded.remove(this.filesIncluded.indexOf(file));
    }

    @Override
    public void showInfo() {
        System.out.println(name+extension);
        this.filesIncluded.stream().forEach(file -> System.out.println("\t"+file.getName()));
    }

}