package functional_programming;

import java.time.LocalDate;
import java.util.function.Supplier;

public class BuiltInInterfaces {
	
	public static void main(String args[]) {
		
		/*
		 * Supplier Interface
		 */
		
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1); // 2023-03-28
		System.out.println(d2); // 2023-03-28
		
		Supplier<StringBuilder> s3 = StringBuilder::new;
		Supplier<StringBuilder> s4 = () -> new StringBuilder();
		
		System.out.println(s3); // functional_programming.BuiltInInterfaces$$Lambda$3/0x0000000800001800@3ab39c39
		System.out.println(s4); // functional_programming.BuiltInInterfaces$$Lambda$3/0x0000000800001800@3ab39c39
		
		// functional_programming is the interface name
		// BuiltInInterfaces is the class name
		// $$ means class doesn't exist in the class file on the file system
		
	}
	

}
