package java_fundamentals;

public class NestedInnerClass2 {
	private int x = 10;
	
	class A {
		private int x = 20;
		
		class B {
			private int x = 30;
			
			public void allTheX() {
				System.out.println(x);         // 30
				System.out.println(this.x);    // 30
				System.out.println(B.this.x);  // 20
				System.out.println(A.this.x);  // 10
			}
		}
	}
	
	public static void main(String args[]) {
		NestedInnerClass2 ni = new NestedInnerClass2();
		NestedInnerClass2.A a = ni.new A();
		NestedInnerClass2.A.B b = a.new B();
		b.allTheX();
	}

}
