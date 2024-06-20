package SOLID_Principles_Design_Patterns.factoryDesignPattern;

import components.button.Button;
import components.dropdown.Dropdown;
import components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        UIComponentFactory factory = p.createUIComponentFactory();

        Button button =  factory.createButton();
        Dropdown dropdown = factory.createDropdown();
        Menu menu = factory.createMenu();
    }
}
