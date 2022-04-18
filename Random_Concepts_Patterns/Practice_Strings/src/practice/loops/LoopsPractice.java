package practice.loops;

public class LoopsPractice {
	
	public static void main(String args[]) {
		
//		int count = 1;
//		
		// while loop and break statement
//		while(count <= 100) {
//			System.out.println("Hello : " +count);
//			count++;
//			if(count == 30) {
//				break;
//			}
//		}

		//Excercise
		String str = "We have large inventory of things in our warehouse falling in "
				   + "the category:apperal and the slightly "
				   + "more in demand category:makeup along with the category:furniture and ...";
		
		printCategories(str);
		
	}
	
	/*
	 * Excercise : Extract all categories from the string argument
	 */
	public static void printCategories(String str) {
		
		int start = 0;
		
		while(true) {
			if(str.indexOf(":", start) == -1) {
				break;
			}
			int tempPos = str.indexOf(":", start) + 1;
			int varLength = 0;
			while(str.charAt(tempPos) != ' ') {
				varLength++;
				tempPos++;
			}
			System.out.println(str.substring(str.indexOf(":", start) + 1, str.indexOf(":", start) + 1 + varLength));
			start = str.indexOf(":", start) + 1;
		}
		
	}
	
}
