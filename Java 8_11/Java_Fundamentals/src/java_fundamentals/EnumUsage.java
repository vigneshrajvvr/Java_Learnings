package java_fundamentals;

public class EnumUsage {
	
	public static void main(String args[]) {
		Season s = Season.WINTER;
		System.out.println(s);
		System.out.println(Season.SUMMER);
		System.out.println(s == Season.WINTER);
		
		for(Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}
		
		Season seasons = Season.valueOf("SUMMER");
		switch(seasons) {
			case WINTER:
				System.out.println("Get out the sled!");
				break;
			case SUMMER:
				System.out.println("Time for the pool!");
				break;
			default:
				System.out.println("Is it summer yet?");
		}
		
		seasons.printExpectedVisitors();
	}

}
