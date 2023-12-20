
// Interface walkable has an abstract method and a default method
interface Walkable {
    void walk();

    default float getGait() {
        return 3.5f;
    }
}

interface Strollable {
    void stroll();

    default float getGait() {
        return 2.5f;
    }
}

// ConfusedClass implements both interfaces that both have the same
// default method defined
public class Confused implements Walkable, Strollable {
    @Override
    public void walk() {
        System.out.println("When walking, gait is " +
                Walkable.super.getGait());
    }

    @Override
    public void stroll() {
        System.out.println("When strolling, gait is " +
                Strollable.super.getGait());
    }

    public float getGait() {
        // Overrides both methods and implements it's own custom code
        return 5.2f;
    }
}
