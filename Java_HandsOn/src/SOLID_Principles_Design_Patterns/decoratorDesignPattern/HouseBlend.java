package SOLID_Principles_Design_Patterns.decoratorDesignPattern;

public class HouseBlend implements Beverage {
    @Override
    public void getDescription() {
        System.out.println("Added HouseBlend");
    }

    @Override
    public int getCost() {
        return 50;
    }
}
