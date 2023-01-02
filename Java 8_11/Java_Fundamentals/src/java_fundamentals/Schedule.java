package java_fundamentals;

public interface Schedule {
	
	default void wakeUp() { checkTime(7); };
	default void haveBreakfast() { checkTime(9); };
	default void haveLunch() { checkTime(12); };
	default void workOut() { checkTime(18); };
	
	private void checkTime(int hours) {
		if(hours > 17) {
			System.out.println("You're late");
		} else {
			System.out.println("You have " + (17 - hours) + " hours left to make the appoinment");
		}
	}
}
