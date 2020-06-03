package animalkingdom;

public class Mammal extends AbstractAnimal {

    public Mammal(String name, int discovered) {
        super(name, discovered);
    }

    public String move() {
        return "walk";
    }
    public String breath() {
        return "lungs";
    }
    public String reproduce() {
        return "live births";
    }
}