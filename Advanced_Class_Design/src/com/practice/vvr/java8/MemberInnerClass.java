package com.practice.vvr.java8;

public class MemberInnerClass {
	
	private String greeting="Hi";
	
	protected class InnerClass{
		public void go() {
			// Inner class can access private instance variable of outer class
			System.out.println(greeting);
		}
	}
	
	public void callInner() {
		InnerClass inner = new InnerClass();
		inner.go();
	}
	
	public static void main(String args[]) {
		MemberInnerClass member = new MemberInnerClass();
		member.callInner();
		// Inner inner = member.new Inner();
		// inner.go();
	}

}
