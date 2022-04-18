package adapter_pattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		System.out.println("Mallard duck : ");
		Duck duck = new MallardDuck();
		duck.fly();
		duck.quack();
		testDuck(duck);
		
		System.out.println();
		
		System.out.println("Turkey : ");
		Turkey turkey = new WildTurkey();
		Duck duck1 = new TurkeyAdapter(turkey);
		testDuck(duck1);
		
	}
	
	static void testDuck(Duck duck) {
		duck.fly();
		duck.quack();
	}

}
