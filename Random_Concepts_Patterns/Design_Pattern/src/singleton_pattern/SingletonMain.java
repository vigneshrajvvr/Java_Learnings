package singleton_pattern;

public class SingletonMain {
	
	public static void main(String args[]) {
		SingletonExample obj1 = SingletonExample.getInstance();
		obj1.setValue(10);
		System.out.println(obj1.getValue());
		
		SingletonExample obj2 = SingletonExample.getInstance();
		obj2.setValue(20);
		
		System.out.println(obj1.getValue());
		System.out.println(obj2.getValue());
		
		SingletonModern singleton1 = SingletonModern.UNIQUE_INSTANCE;
		System.out.println(singleton1.getDescription());
		
	}
	
}
