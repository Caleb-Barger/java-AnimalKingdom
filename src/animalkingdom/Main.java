package animalkingdom;

import java.util.*;

public class Main {

    private static final String LUNGS = "lungs";
    private static final String GILLS = "gills";
    private static final String EGGS = "eggs";

    private static List<AbstractAnimal> filteredList = new ArrayList<>();

    private static void filterBreath(List<AbstractAnimal> animals,  CheckBreath tester) {
        filteredList.clear();   
        for(AbstractAnimal a : animals) {
            if(tester.test(a)) {
                filteredList.add(a);
            }
        }

    }
        

    
    public static void main(String[] args) {

        // Mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // ok now I need to make an ArrayList made of the type AbstractAnimal & add them to the list
        List<AbstractAnimal> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);
        
        // STEP 1: 
            // list all the animals in descending order by year named (greatest to least)
            animals.sort((a1, a2) -> Integer.compare(a2.getDiscovered() , a1.getDiscovered()));
            System.out.println("\n\n*** Animals by year in descending order ***");
            System.out.println(animals);
        
        // STEP 2: 
            // list animals alphebeticly
            System.out.println("\n\n*** Animals by name in alphebetical order ***");
            animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
            System.out.println(animals);
        
        // STEP 3:
            // list by how they move
            System.out.println("\n\n*** How does each animal move? ***"); 
            animals.forEach((a) -> System.out.printf("%s %ss\n", a.getName(), a.move()));
        
        // STEP 4:
            // list only animals that breath with their lungs
            System.out.println("\n\n*** Animals that breath with lungs ***");
            filterBreath(animals, a -> a.breath() == LUNGS);
            filteredList.forEach(a -> System.out.println(a));

        // STEP 5:
            // list only animals that breath with their lungs & named in 1758
            System.out.println("\n\n*** Animals that breath with lungs & named in 1758 ***");
            filterBreath(animals, a -> (a.breath() == LUNGS) && (a.getDiscovered() == 1758));
            filteredList.forEach(a -> System.out.println(a));
        
        // STEP 6:
            // List only those animals that lay eggs and breath with lungs
            System.out.println("\n\n*** Animals that breath with lungs & lay eggs ***");
            filterBreath(animals, a -> (a.breath() == LUNGS) && (a.reproduce() == EGGS));
            filteredList.forEach(a -> System.out.println(a));
        
        // STEP 7:
            // List alphabetically only those animals that were named in 1758
            System.out.println("\n\n*** Animals that breath with lungs & named in 1758 ***");
            filterBreath(animals, a -> a.getDiscovered() == 1758);
            filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
            filteredList.forEach(a -> System.out.println(a));
    }
}