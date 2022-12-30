package java_fundamentals;

public class LocalNestedClass {
	private int length = 5;
	
	public void calculate() {
		final int width = 20;
		class MyLocalClass {
			public void multiply() {
				System.out.println(length * width);
			}
		}
		
		MyLocalClass local = new MyLocalClass();
		local.multiply();
	}
	
	public static void main(String args[]) {
		LocalNestedClass outer = new LocalNestedClass();
		outer.calculate();
	}

}
