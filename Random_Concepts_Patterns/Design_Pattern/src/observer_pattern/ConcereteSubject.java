package observer_pattern;

import java.util.ArrayList;

public class ConcereteSubject implements Subject {

	private ArrayList<Observer> observerList;
	private int value = 0;

	public ConcereteSubject() {
		observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		
		for(Observer tempObserver : observerList) {
			tempObserver.update(value);
		}
		
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}

}
