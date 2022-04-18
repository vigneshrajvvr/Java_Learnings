package factory_pattern;

/*
 * This pattern provides us the loose coupled way to create
 * object which are not know until runtime.
 */
public class ZooKeeper {
	
	public static void main(String args[]) {
		final Food food = AnimalFactory.getFood("polar bear");
		food.consumed();
	}

}
