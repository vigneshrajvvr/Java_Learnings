package coreAdvanced.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Excercises {
	
	public static void main(String args[]) {
		//To match the below string
 		System.out.println("Challenge 1 : ");
		String challenge1 = "I want a bike.";
		System.out.println(challenge1.matches("I want a bike."));
		
		//To match below strings
		System.out.println("Challenge 2 : ");
		String challenge2 = "I want a bike.";
		System.out.println(challenge2.matches("I want a \\w+."));
		String challenge21 = "I want a ball.";
		System.out.println(challenge21.matches("I want a \\w+."));
		//or
		System.out.println(challenge2.matches("I want a (bike|ball)."));
		System.out.println(challenge21.matches("I want a (bike|ball)."));
		
		//Usage of Matcher.matches()
		System.out.println("Challenge 3 : ");
		String regex2 = "I want a (bike|ball).";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(challenge2);
		System.out.println(matcher2.matches());
		Matcher matcher21 = pattern2.matcher(challenge21);//We can reuse matcher2
		System.out.println(matcher21.matches());
		//To replace all blanks with underscores
		//W - match other than characters
		String challenge3 = "Replace all blanks with underscores.";
		//System.out.println(challenge3.replaceAll("\\W", "_"));
		System.out.println(challenge3.replaceAll(" ", "_"));
		System.out.println(challenge3.replaceAll("\\s", "_"));
		
		//To match below String with any number of characters contains it
		System.out.println("Challenge 4 : ");
		String challenge4 = "aaabccccccccdddefffg";
		System.out.println(challenge4.matches("[abcdefg]+"));
		System.out.println(challenge4.matches("[a-g]+"));
		
		//To match exactly same number of characters of challenge4 string
		System.out.println(challenge4.matches("^a{3}bc{8}d{3}ef{3}g$"));
		System.out.println(challenge4.replaceAll("^a{3}bc{8}d{3}ef{3}g$","REPLACED"));
		
		//To match series of digits, . and series of letters
		System.out.println("Challenge 5 : ");
		String challenge5 = "abcd.135";
		System.out.println(challenge5.matches("\\w+.\\d+"));
		System.out.println(challenge5.matches("^[A-Za-z]+.[0-9]+$"));
		
		//To use group for above challenge
		System.out.println("Challege 6 : ");
		String challenge6 = "abcd.135uvqz.7tzik.999";
		//Pattern challenge6Pattern = Pattern.compile("([a-zA-Z]+)(.)([0-9]+)");
		Pattern challenge6Pattern = Pattern.compile("(\\w+)(.)(\\d+)");
		Matcher challenge6Matcher = challenge6Pattern.matcher(challenge6);
		
		while(challenge6Matcher.find()) {
			System.out.println("Occurence : "+challenge6Matcher.group(3));
		}
		
		//To extract numbers from a string
		System.out.println("Challenge 7 : ");
		String challenge7 = "abcd.135\tuvqz.7\ttzik.999\n";
		Pattern challenge7Pattern = Pattern.compile("(\\w+)(.)(\\d+)\\s");
		Matcher challenge7Matcher = challenge7Pattern.matcher(challenge7);
		
		while(challenge7Matcher.find()) {
			System.out.println("Occurence : "+challenge7Matcher.group(3));
		}
		
		//To extract contents within curly braces
		System.out.println("Challenge 8 : ");
		String challenge8 = "{0,2},{0,5},{1,3},{2,4}";
		Pattern challenge8Pattern = Pattern.compile("\\{(.+?)\\}");
		Matcher challenge8Matcher = challenge8Pattern.matcher(challenge8);
		
		while(challenge8Matcher.find()) {
			System.out.println(challenge8Matcher.group());
		}
		
		//To extract contents within curly braces
		System.out.println("Challenge 9 : ");
		String challenge9 = "{0,2},{0,5},{1,3},{2,4},{x,y},{6,4},{11,12}";
		Pattern challenge9Pattern = Pattern.compile("\\{(\\d+,\\d+)\\}");
		Matcher challenge9Matcher = challenge9Pattern.matcher(challenge9);
				
		while(challenge9Matcher.find()) {
			System.out.println(challenge9Matcher.group());
		}
		
		//To match 5 digit zip code
		System.out.println("Challenge 10 : ");
		String challenge10 = "11111";
		Pattern challenge10Pattern = Pattern.compile("^\\d{5}$");
		Matcher challenge10Matcher = challenge10Pattern.matcher(challenge10);
		
		while(challenge10Matcher.find()) {
			System.out.println(challenge10Matcher.group());
		}
		
		//To match zip code with dash
		System.out.println("Challenge 11 : ");
		String challenge11 = "11111-1111";
		Pattern challenge11Pattern = Pattern.compile("^\\d{5}-\\d{4}$");
		Matcher challenge11Matcher = challenge11Pattern.matcher(challenge11);
		
		while(challenge11Matcher.find()) {
			System.out.println(challenge11Matcher.group(0));
		}
		
		//To match zip code with dash and additional 4 digits
		System.out.println("Challenge 12 : ");
		String challenge12 = "11111-1111";
		Pattern challenge12Pattern = Pattern.compile("^\\d{5}-\\d{0,4}$");
		//Pattern challenge12Pattern = Pattern.compile("^\\d{5}-(\\d{4})?$"); - ? indicates 0 or 1 occurrence of group
		Matcher challenge12Matcher = challenge12Pattern.matcher(challenge12);
		
		while(challenge12Matcher.find()) {
			System.out.println(challenge12Matcher.group());
		}
		
	}
}
