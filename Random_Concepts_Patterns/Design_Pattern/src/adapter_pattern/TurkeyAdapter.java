package adapter_pattern;

public class TurkeyAdapter implements Duck {

	Turkey turkey = new WildTurkey();

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

}
