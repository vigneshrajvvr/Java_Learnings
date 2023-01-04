package java_apis;

public class StringFunctions {
	
	public static void main(String args[]) {
		String s1 = "Test";
		String s2 = new String("Test");
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.indexOf('s', 3));
		System.out.println(s1.indexOf("es"));
		System.out.println(s1.indexOf("es", 1));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1,3));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals("Test"));
		System.out.println(s1.equalsIgnoreCase("test"));
		System.out.println(s1.startsWith("Te"));
		System.out.println(s1.endsWith("st"));
		System.out.println(s1.replace('e', 'a'));
		System.out.println(s1.replace("es", "at"));
		System.out.println(s1.contains("Te"));
		String s3 = "  Test  ";
		System.out.println(s3.trim());
		String s4 = " Test\u2000 ";  // \u2000 unicode character for space
		System.out.println(s4.strip());
		System.out.println(s3.stripLeading());
		System.out.println(s4.stripTrailing());
		String result = "AnimaL    ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
		String name = "Hello World";
		String name1 = new String(" Hello World").trim().intern();
		System.out.println(name == name1);

	}

}
