import components.button.AndroidButton;
import components.button.Button;
import components.button.IOSButton;
import components.dropdown.Dropdown;
import components.dropdown.IOSDropdown;
import components.menu.IOSMenu;
import components.menu.Menu;

public class IOSComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
