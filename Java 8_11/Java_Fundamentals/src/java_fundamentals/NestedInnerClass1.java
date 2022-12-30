package java_fundamentals;

public class NestedInnerClass1 {
	private String greeting = "Hi";
	
	protected class Inner {
		public int repeat = 3;
		public void go() {
			for(int i = 0; i < repeat; i++) {
				System.out.println(greeting);
			}
		}
	}
	
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}
	
	public static void main(String args[]) {
		NestedInnerClass1 nestedInner = new NestedInnerClass1();
		Inner inner = nestedInner.new Inner();
		inner.go();
		nestedInner.callInner();
	}
}
