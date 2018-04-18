public abstract class File {
    
    protected String name;
        
    public void add(File file) {
        throw new UnsupportedOperationException();
    }

    public void remove(File file) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        throw new UnsupportedOperationException();
    }
 }