package SOLID_Principles_Design_Patterns.liskovSubstitionPrinciple;

public class Square implements Shape {
	
	public int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}

}
