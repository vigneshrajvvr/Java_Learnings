package SOLID_Principles_Design_Patterns.factoryDesignPattern;

public class IOS {
    public UIComponentFactory createUIComponentFactory() {
        return new IOSComponentFactory();
    }
}
