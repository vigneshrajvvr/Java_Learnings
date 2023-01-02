package java_fundamentals;

public interface Walk {
	
	public default int getSpeed() {
		return 5;
	}

}
