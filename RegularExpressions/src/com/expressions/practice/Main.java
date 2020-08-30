package com.expressions.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String string = "I am a string. Yes, I am.";
		System.out.println(string);
		String yourString = string.replaceAll("I", "You");
		System.out.println(yourString);
		
		String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
		System.out.println(alphanumeric.replaceAll(".", "Y"));
		
		// ^ to check for start of the string
		System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
		
		String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
		System.out.println(secondString.replaceAll("^abcDeee", "YYY"));
		
		System.out.println(alphanumeric.matches("^hello"));
		
		//In matches method, usage of ^ will check for whole string
		System.out.println(alphanumeric.matches("^abcDeee"));
		System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));
		
		System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));
		System.out.println(alphanumeric.replaceAll("[aei]", "X"));
		System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
		System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
		
		System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
		
		String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
		System.out.println(newAlphanumeric.replaceAll("[^ej]" ,"X"));
		System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
		System.out.println(newAlphanumeric.replaceAll("[a-f3-8]", "X"));
		System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
		System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
		//for unicode - insensitive case replace 
		System.out.println(newAlphanumeric.replaceAll("(?iu)[a-f3-8]", "X"));
		
		//Replace any digit in a string
		System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
		System.out.println(newAlphanumeric.replaceAll("\\d","X"));
		
		//Replace any letter in a string
		System.out.println(newAlphanumeric.replaceAll("(?i)[a-z]", "X"));
		System.out.println(newAlphanumeric.replaceAll("\\D", "X"));
		
		String hasWhitespace = "I have blanks and \ta tab, and also a new line\n";
		System.out.println(hasWhitespace);
		//To replace \t 
		System.out.println(hasWhitespace.replaceAll("\t", "X"));
		//To replace whitespace
		System.out.println(hasWhitespace.replaceAll("\\s", "X"));
		System.out.println(hasWhitespace.replaceAll("\\W", "X"));
		//To replace non whitespace characters
		System.out.println(hasWhitespace.replaceAll("\\S", "X"));
		System.out.println(hasWhitespace.replaceAll("\\w", "X"));
		
		//Start and end of string will be replaced
		System.out.println(hasWhitespace.replaceAll("\\b", "X"));
		
		String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";
		System.out.println(thirdAlphanumericString.replaceAll("^abcDeee", "YYY"));
		
		//Quantifier
		System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));
		//+ symbol specifies - one or more characters
		System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));
		//* symbol specifies - zero or more characters
		System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY"));
		//to match characters which are occuring within a range
		System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}", "YYY"));
		//Excercise: one or more h with zero or more i and one h
		System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));
		
		
		//To match all h2 tags in an html page
		StringBuilder htmlText = new StringBuilder("<h1>My heading</h1>");
		htmlText.append("<h2>Sub-Heading</h2>");
		htmlText.append("<p>This is a paragraph about something.</p>");
		htmlText.append("<p>This is another paragraph about something else.</p>");
		htmlText.append("<h2>Summary</h2>");
		htmlText.append("<p>Here is the summary.</p>");

		//String h2Pattern = ".*<h2>.*";
		// To use find() method
		String h2Pattern = "<h2>";
		Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(htmlText);
		System.out.println(matcher.matches()); //returns true or false
		
		//Matcher has to be reset before using again
		matcher.reset();
		
		//To find number of occurences of matches and where they occur.
		int count = 0;
		while(matcher.find()) {
			count++;
			System.out.println("Occurrence "+ count + " : " + matcher.start() + " to "+ matcher.end());
		}
		
		//Group pattern - greedy quantifiers and reluctant or lazy quantifiers
		// ? makes * quantifier as lazy quantifier
        String h2GroupPattern = "(<h2>.*?</h2>)";
		Pattern groupPattern = Pattern.compile(h2GroupPattern);
		Matcher groupMatcher = groupPattern.matcher(htmlText);
		System.out.println(groupMatcher.matches());
		groupMatcher.reset();
		
		while(groupMatcher.find()) {
			System.out.println("Occurrence : " + groupMatcher.group(1) + " - " + + groupMatcher.start() + " to "+ groupMatcher.end());
		}
		
		System.out.println();
		
		//Multiple groups
		String h2TextGroups = "(<h2>)(.+?)(</h2>)";
		Pattern h2TextPattern = Pattern.compile(h2TextGroups);
		Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);
		
		//h2TextMatcher.reset();
		
		while(h2TextMatcher.find()) {
			System.out.println("Occurrence : " + h2TextMatcher.group(2) + " - " + + h2TextMatcher.start() + " to "+ h2TextMatcher.end());
		}
		
		// "abc" "a" and "b" and "c"
		// [Hh]arry
		System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
		System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));
		
		// [^abc] - characters except a, b and c
		// ! - NOT operator should be used in negative look ahead expression - starts with ? 
		String tvTest = "tstvtkt";
//		String tNotVRegExp = "t[^v]";
		String tNotVRegExp = "t(?!v)";
		Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
		Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);
		
		count = 0;
		while(tNotVMatcher.find()) {
			count++;
			System.out.println("Occurrence : " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
		}
		//t(?=v)
		
		//US mobile number
		//(800) 123 - 4567
		//^([\(]{1}[0-9]{3}[\)]{1})[ ]{1}[0-9]{3}[\-][0-9]{4})$ 
		
		//Indian number
		// +91 12345 67890
		//^([\+]{1}[0-9]{2}[ ][0-9]{5}[ ][0-9]{5})$
		
		String phone1 = "1234567890";
		String phone2 = "(800) 123-4567";
		String phone3 = "+91 12345 67890";
		
		String pattern1 = "^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$";
		String pattern2 = "^([\\+]{1}[0-9]{2}[ ][0-9]{5}[ ][0-9]{5})$";
		
		Pattern numberPattern1 = Pattern.compile(pattern1);
		Matcher numberMatcher1 = numberPattern1.matcher(phone1);
		System.out.println(numberMatcher1.matches());		
		
		Pattern numberPattern2 = Pattern.compile(pattern1);
		Matcher numberMatcher2 = numberPattern2.matcher(phone2);
		System.out.println(numberMatcher2.matches());		
		
		Pattern numberPattern3 = Pattern.compile(pattern2);
		Matcher numberMatcher3 = numberPattern3.matcher(phone1);
		System.out.println(numberMatcher3.matches());		
		
		Pattern numberPattern4 = Pattern.compile(pattern2);
		Matcher numberMatcher4 = numberPattern4.matcher(phone3);
		System.out.println(numberMatcher4.matches());
		
		//Visa number - ^4[0-9]{12}([0-9]{3})?$  -> ? matcher 0 or more occurences of the group
		
		 String visa1 = "4444444444444"; // should match
	     String visa2 = "5444444444444"; // shouldn't match
	     String visa3 = "4444444444444444";  // should match
	     String visa4 = "4444";  // shouldn't match

	     System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3}){0,1}$"));
	     System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3}){0,1}$"));
	     System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3}){0,1}$"));
	     System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3}){0,1}$"));
	}
}
