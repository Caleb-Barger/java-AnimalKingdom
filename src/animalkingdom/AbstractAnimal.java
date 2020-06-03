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

    public int getDiscovered() {
        return discovered;
    }

    public String getName() {
        return name;
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();

    @Override
    public String toString() {
        return String.format("\nSpecies: %s Discovered: %s\n", name, discovered);
    }
}