
public class BuildingBlocksMain {
	
	private String name = "Fluffy";
	{
		System.out.println("Setting field");
	}
	
	public BuildingBlocksMain() {
		name="Tiny";
		System.out.println("setting constructor");
	}
	
	public static void main(String args[]) {
		BuildingBlocksMain chick = new BuildingBlocksMain();
		System.out.println(chick.name);
		
		// Order of output - Instance initializers - Constructor - Main method
		// Setting field
		// setting constructor
		// Tiny

	}

}
