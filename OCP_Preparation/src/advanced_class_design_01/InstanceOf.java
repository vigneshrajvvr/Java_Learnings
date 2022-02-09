package advanced_class_design_01;

public class InstanceOf {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;          // true
        boolean b2 = hippo instanceof HeavyAnimal;    // true
        boolean b3 = hippo instanceof Elephant;       // false

        Hippo hippo1 = new Hippo();
        /*
        boolean b4 = hippo1 instanceof Elephant;      Throws compilation error as both the classes are unrelated to each other
         */
    }
}

class HeavyAnimal{}
class Hippo extends HeavyAnimal{}
class Elephant extends HeavyAnimal{}
