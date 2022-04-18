package observer_pattern;

public class ObserverMain {

	public static void main(String args[]) {
		ConcereteSubject subject = new ConcereteSubject();
		Observer observer1 = new ConcereteObserver(subject);
		Observer observer2 = new ConcereteObserver(subject);
		Observer observer3 = new ConcereteObserver(subject);
		
		//Updating subject value updates the observers and notifies them.
		subject.setValue(5);

	}

}
