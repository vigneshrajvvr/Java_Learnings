package SOLID_Principles_Design_Patterns.factoryDesignPattern;

public class Platform {

    public void setTheme() {
        System.out.println("Set a theme");
    }

    public void setRefreshRate() {
        System.out.println("Set refresh");
    }

    public UIComponentFactory createUIComponentFactory() {
        return null;
    }
}
