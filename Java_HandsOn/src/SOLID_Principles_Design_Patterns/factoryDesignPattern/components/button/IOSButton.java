package SOLID_Principles_Design_Patterns.factoryDesignPattern.components.button;

public class IOSButton implements Button{
    @Override
    public int getSize() {
        return 10;
    }
}
