package singleton_pattern;

//Classic way of implementing singleton pattern
public class SingletonExample {
	
	public static SingletonExample example;
	private int value = 0;
	
	private SingletonExample() {
		
	}
	
	public static synchronized SingletonExample getInstance() {
		if(example == null) {
			example = new SingletonExample();
		}
		return example;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
