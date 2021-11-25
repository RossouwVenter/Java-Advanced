import garden.vegetable.*;
import nursery.vegetable.*;


public class TestImport {
    public static void main(String[] args) {
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);
        VineVegetable.main(args);
        nursery.vegetable.VineVegetable.main(args);
    }
}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local vine vegetable.");
    }
}

