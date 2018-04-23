import java.util.ArrayList;

public class Directory extends File {
    
    String extension = "/";
    ArrayList<File> filesIncluded;

    public Directory(String name) {
        this.name = name;
        filesIncluded = new ArrayList<File>();
    }

    public ArrayList<File> getFilesIncluded() {
        return filesIncluded;
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
    public String showInfo() {
        String s = name+extension+"\n";
        for(File file : this.filesIncluded) {
            s+="\t"+file.getName()+"\n";
        }
        return s;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}