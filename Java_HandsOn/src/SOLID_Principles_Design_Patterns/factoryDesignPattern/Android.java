package SOLID_Principles_Design_Patterns.factoryDesignPattern;

public class Android extends Platform {
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
