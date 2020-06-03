package animalkingdom;

public class Bird extends AbstractAnimal {

    public Bird(String name, int discovered) {
        super(name, discovered);
    }

    public String move() {
        return "fly";
    }
    public String breath() {
        return "lungs";
    }
    public String reproduce() {
        return "eggs";
    }
}