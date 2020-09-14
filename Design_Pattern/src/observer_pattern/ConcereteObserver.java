package observer_pattern;

public class ConcereteObserver implements Observer{
	
	private int value = 0;
	private Subject simpleSubject;
	
	public ConcereteObserver(Subject simpleSubject) {
		this.simpleSubject = simpleSubject;
		simpleSubject.registerObserver(this);
	}

	@Override
	public void update(int value) {
		this.value = value;
		display();
	}

	
	public void display() {
		System.out.println("Value : "+value);
	}
}
