package practice_strings;

/*
 * String and some of it's associated functions 
 */
public class StringsPractice {
	
	public static void main(String args[]) {
		
		//length() method
		String a = "Hello  ";
		System.out.println(a);
		System.out.println(a.length());
		
		//substring() method
		String str = "ABCDEFG";
		String extractedString = str.substring(1);
		System.out.println(extractedString);
		System.out.println(str.substring(1, 2));
		
		//equals() and equalsIgnoreCase() methods
		String a1 = "Hello";
		String b1 = "there";
		if(a1 == "Hello") {
			//DON'T DO THIS - ONLY USED FOR OBJECT COMPARISON 
		}
		if(b1.equals("there")) {
			//USE THIS FOR COMPARISON!!!
		}
		if(b1.equals("there")) {
			System.out.println("Printed there");
		}
		if(b1.equalsIgnoreCase("There")) {
			System.out.println("Case insensitive equality");
		}
		
		//charAt() method
		System.out.println(str.charAt(0));
		
		//indexOf() method
		String str1 = "Hello yogi there yogi!!!";
		int a2 = str1.indexOf("there");
		System.out.println(a2);
		a2 = str1.indexOf("There");
		System.out.println(a2);
		
		int a3 = str1.lastIndexOf("yogi");
		System.out.println(a3);
		
	}
	
}
