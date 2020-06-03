package animalkingdom;

public class Bird extends AbstractAnimal {

    public Bird(String name, int discovered) {
        super(name, discovered);
    }

    public void move() {
        System.out.println("fly");
    }
    public void breath() {
        System.out.println("lungs");
    }
    public void reproduce() {
        System.out.println("eggs");
    }
}