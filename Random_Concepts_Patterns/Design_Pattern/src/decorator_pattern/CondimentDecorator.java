package decorator_pattern;

public abstract class CondimentDecorator extends Beverage{
	
	Beverage beverage;
	public abstract String getDescription();
	
}
