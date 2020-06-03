package animalkingdom;

public class Main {
    public static void main(String[] args) {
        Mammal panda = new Mammal("Panda", 1869);
        System.out.println(panda.toString());
        System.out.println(panda.getId());
    }
}