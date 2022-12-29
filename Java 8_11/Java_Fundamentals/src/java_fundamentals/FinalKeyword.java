package java_fundamentals;

public class FinalKeyword {
	
	private final int age = 10;
	private final int fishEaten;
	private final String name;
	
	{
		fishEaten = 10;
	}
	
	public FinalKeyword() {
		this.name = "Robert";
	}
	
	private void printZooInfo(boolean isWeekend) {
		final int giraffe = 5;
		final long lemur;
		if(isWeekend) {
			lemur = 5;
		} else {
			lemur = 10;
		}
		
		System.out.println(giraffe + " " + lemur);
	}
	
	public static void main(String args[]) {
		
	}

}

class Hippo {
	
	public final void chew() {}; // Cannot be overridden by subclasses 
	
}

// Class cannot be extended
final class HippoFinal {
		
}
