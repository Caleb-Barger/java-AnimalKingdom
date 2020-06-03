package animalkingdom;

abstract class AbstractAnimal {

    protected static int id;
    protected String name;
    protected int discovered;

    public AbstractAnimal(String name, int discovered) {
        id += 1;
        this.name = name;
        this.discovered = discovered;
    }

    public void eat() {
        System.out.println("Munch...Munch");
    }

    public int getId() {
        return id;
    }

    abstract void move();
    abstract void breath();
    abstract void reproduce();

    @Override
    public String toString() {
        return String.format("Species: %s Discovered: %s", name, discovered);
    }
}