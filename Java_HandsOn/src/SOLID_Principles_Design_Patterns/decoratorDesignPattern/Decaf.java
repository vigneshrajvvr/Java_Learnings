package SOLID_Principles_Design_Patterns.decoratorDesignPattern;

public class Decaf implements Beverage{
    @Override
    public void getDescription() {
        System.out.println("Added Decaf");
    }

    @Override
    public int getCost() {
        return 100;
    }
}
