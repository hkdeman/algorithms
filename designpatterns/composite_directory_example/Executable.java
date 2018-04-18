public class Executable extends File {

    String extension = ".exe";

    public Executable(String name) {
        this.name = name;        
    }

    @Override
    public void showInfo() {
        System.out.println("Executable : "+this.name+this.extension);
    }

}