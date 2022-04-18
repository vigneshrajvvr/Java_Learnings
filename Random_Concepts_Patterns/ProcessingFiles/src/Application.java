import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		for(int i=0;i<3;i++) {
//			System.out.println("Enter some Text: ");
//			String enteredText = input.nextLine();
//			System.out.println(enteredText);
//		}

		try {
			File file = new File("myfile.txt");
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		MyFileUtils myUtil = new MyFileUtils();
		try {
			myUtil.subtract10FromLargerNumber(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
