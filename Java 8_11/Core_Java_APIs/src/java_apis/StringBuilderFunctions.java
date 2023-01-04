package java_apis;

public class StringBuilderFunctions {
	
	public static void main(String args[]) {
		// Creation
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animals");
		StringBuilder sb3 = new StringBuilder(10);
		
		// Methods - charAt(), indexOf(), length(), substring() same as string
		String sub = sb2.substring(sb2.indexOf("a"), sb2.indexOf("al"));
		int len = sb2.length();
		char ch = sb2.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
		
		sb1.append(1).append('c').append('-').append(false);
		System.out.println(sb1);
		
		sb2.insert(7,'-').insert(0, '-').insert(4, '-');
		System.out.println(sb2);
		
		StringBuilder sbDelete = new StringBuilder("abcdef");
		sbDelete.delete(1,3);          // sb = adef
		//sbDelete.charAt(5);            // throws an exception
		System.out.println(sbDelete);
		
		StringBuilder sbReplace = new StringBuilder("pigeon dirty");
		sbReplace.replace(3, 6, "sty");
		System.out.println(sbReplace);
		
		StringBuilder sb = new StringBuilder("ABC");
		System.out.println(sb.reverse().toString());
		System.out.println(sb);
	}

}
