package com.vicky.learningfilereader;

class MyClass implements AutoCloseable {

	@Override
	public void close() throws Exception {
		
		System.out.println("Closing!");
		
	}
	
}

public class Application2 {
	public static void main(String args[]) {
		
		try(MyClass war = new MyClass()){
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Testing");
		}
		
	}
}
