package SOLID_Principles_Design_Patterns.dependencyInversionPrinciple;

import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	// Writes message to a file
	public void writeMessage(Message msg, PrintWriter writer, Formatter formatter) throws IOException {
		writer.println(formatter.format(msg)); // formats and writes message
		writer.flush();
	}
}
