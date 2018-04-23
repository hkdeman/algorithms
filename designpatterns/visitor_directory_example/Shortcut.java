public class Shortcut extends File {

    public String extension = ".shortcut";

    public Shortcut(String name) {
        this.name = name;
    }
    
    @Override
    public String showInfo() {
        return "Shortcut : "+this.name+this.extension;
    }    

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}