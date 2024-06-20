package SOLID_Principles_Design_Patterns.factoryDesignPattern;

import components.button.AndroidButton;
import components.button.Button;
import components.dropdown.AndroidDropdown;
import components.dropdown.Dropdown;
import components.menu.AndroidMenu;
import components.menu.Menu;

public class AndroidComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
