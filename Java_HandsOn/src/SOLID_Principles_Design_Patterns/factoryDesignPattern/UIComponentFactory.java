package SOLID_Principles_Design_Patterns.factoryDesignPattern;

import components.button.Button;
import components.dropdown.Dropdown;
import components.menu.Menu;

public interface UIComponentFactory {
    public Button createButton();
    public Dropdown createDropdown();
    public Menu createMenu();
}
