package singleton_pattern;

public enum SingletonModern {
	UNIQUE_INSTANCE;
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
