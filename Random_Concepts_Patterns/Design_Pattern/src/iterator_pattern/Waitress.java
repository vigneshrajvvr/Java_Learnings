package iterator_pattern;

public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerMenuIterator = dinerMenu.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerMenuIterator);

	}

	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.getPrice());
		}
	}

	public void printVegetarianMenu() {
		printVegetarianMenu(pancakeHouseMenu.createIterator());
		printVegetarianMenu(dinerMenu.createIterator());
	}

	public void printVegetarianMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if(menuItem.isVegetarian()) {
				System.out.println(menuItem.getName());
				System.out.println(menuItem.getDescription());
				System.out.println(menuItem.getPrice());
			}
		}
	}
	
	public boolean isVegetarian(String name) {
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		if(isVegetarian(name,breakfastIterator)) {
			return true;
		}
		Iterator dinerIterator = dinerMenu.createIterator();
		if(isVegetarian(name,dinerIterator)) {
			return true;
		}
		return false;
	}
	
	public boolean isVegetarian(String name, Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if(menuItem.getName().equals(name)) {
				if(menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}

}
