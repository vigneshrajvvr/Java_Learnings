package SOLID_Principles_Design_Patterns.dependencyInversionPrinciple;

//Common interface for classes formatting Message object
public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
