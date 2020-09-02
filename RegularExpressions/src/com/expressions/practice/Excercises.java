package com.expressions.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Excercises {
	
	public static void main(String args[]) {
		//To match the below string
		String challenge1 = "I want a bike.";
		System.out.println(challenge1.matches("I want a bike."));
		
		//To match below strings
		String challenge2 = "I want a bike.";
		System.out.println(challenge2.matches("I want a \\w+."));
		String challenge21 = "I want a ball.";
		System.out.println(challenge21.matches("I want a \\w+."));
		//or
		System.out.println(challenge2.matches("I want a (bike|ball)."));
		System.out.println(challenge21.matches("I want a (bike|ball)."));
		
		//Usage of Matcher.matches()
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
		String challenge4 = "aaabccccccccdddefffg";
		System.out.println(challenge4.matches("[abcdefg]+"));
		System.out.println(challenge4.matches("[a-g]+"));
		
		//To match exactly same number of characters of challenge4 string
		System.out.println(challenge4.matches("^a{3}bc{8}d{3}ef{3}g$"));
		System.out.println(challenge4.replaceAll("^a{3}bc{8}d{3}ef{3}g$","REPLACED"));
		
		//To match series of digits, . and series of letters
		String challenge5 = "abcd.135";
		System.out.println(challenge5.matches("\\w+.\\d+"));
		System.out.println(challenge5.matches("^[A-Za-z]+.[0-9]+$"));
	
	}
}
