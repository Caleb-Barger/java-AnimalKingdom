package animalkingdom;

public class Fish extends AbstractAnimal {

    public Fish(String name, int discovered) {
        super(name, discovered);
    }

    public String move() {
        return "swim";
    }
    public String breath() {
        return "gills";
    }
    public String reproduce() {
        return "eggs";
    }
}