public class FileSystem {
    
    private File allFiles;

    public FileSystem(File file) {
        this.allFiles = file;
    }

    public void ls() {
        allFiles.showInfo();
    }

}