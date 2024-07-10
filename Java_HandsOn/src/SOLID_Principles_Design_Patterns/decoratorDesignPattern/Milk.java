package SOLID_Principles_Design_Patterns.decoratorDesignPattern;

public class Milk implements Addon{
    Beverage b;

    public Milk(Beverage b) {
        this.b = b;
    }
    @Override
    public void getDescription() {
        b.getDescription();
        System.out.println("Added milk");
    }

    @Override
    public int getCost() {
        return 2 + b.getCost();
    }
}
