package practice_strings;

public class LoopsPractice1 {

	public static void main(String[] args) {

		// for loop
		for (int i = 0; i < 100; i++) {
			System.out.println("i : " + i);
		}

		String name = "Random String";
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i) + " ");
		}

		System.out.println("Reverse : ");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i) + " ");
		}

		System.out.println("Even numbers :");
		for (int i = 0; i <= 100; i += 2) {
			System.out.print(i + " ");
		}

		int counter = 0;
		for (int i = 0; i >= 0; i -= 5) {
			System.out.println(i);
			int temp = counter + 1;
			counter = temp;
		}

		// nested loops
		for (int idx = 0; idx < 100; idx++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("the value of idx was " + idx + " ------ " + j);
			}
		}

	}

}
