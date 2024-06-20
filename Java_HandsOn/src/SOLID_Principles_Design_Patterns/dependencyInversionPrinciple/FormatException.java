package SOLID_Principles_Design_Patterns.dependencyInversionPrinciple;

import java.io.IOException;

//Thrown by formatter
public class FormatException extends IOException {
	
	public FormatException(Exception cause) {
		super(cause);
	}
}
