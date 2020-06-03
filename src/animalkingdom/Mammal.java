package animalkingdom;

public class Mammal extends AbstractAnimal {

    public Mammal(String name, int discovered) {
        super(name, discovered);
    }

    public void move() {
        System.out.println("walk");
    }
    public void breath() {
        System.out.println("lungs");
    }
    public void reproduce() {
        System.out.println("live births");
    }
}