package java_fundamentals;

public enum Season {
	
	WINTER("Low"){
		public String getHours() {
			return "10am-3pm";
		}
	}, SPRING("Medium"){
		public String getHours() {
			return "9am-5pm";
		}
	}, SUMMER("High"){
		public String getHours() {
			return "9am-7pm";
		}
	}, FALL("Medium"){
		public String getHours() {
			return "9am-5pm";
		}
	};
	private final String expectedVisitors;
	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}

	public abstract String getHours();
}
