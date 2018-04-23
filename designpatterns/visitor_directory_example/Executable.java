public class Executable extends File implements Visitable{

    String extension = ".exe";

    public Executable(String name) {
        this.name = name;        
    }

    @Override
    public String showInfo() {
        return "Executable : "+this.name+this.extension;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}