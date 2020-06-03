package animalkingdom;

public class Fish extends AbstractAnimal {

    public Fish(String name, int discovered) {
        super(name, discovered);
    }

    public void move() {
        System.out.println("swim");
    }
    public void breath() {
        System.out.println("gills");
    }
    public void reproduce() {
        System.out.println("eggs");
    }
}