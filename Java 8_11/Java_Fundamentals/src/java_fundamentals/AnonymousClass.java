package java_fundamentals;

public class AnonymousClass {
	
	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			public int dollarsOff() {
				return 3;
			}
		};
		
		return basePrice - sale.dollarsOff();
	}
	
	public static void main(String args[]) {
		
	}

}
