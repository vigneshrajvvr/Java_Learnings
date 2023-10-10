import java.util.concurrent.*;

public class ZooInfo {

	public static void main(String args[]) {
		ExecutorService service = null;
		
		Runnable task1 = () -> {
			System.out.println("Printing Zoo Inventory");
		};
		
		Runnable task2 = () -> {
			for(int i = 0; i < 3; i++) {
				System.out.println("Printing record: " + i);
			}
		};
		
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("Begin");
			service.execute(task1);
			service.execute(task2);
			service.execute(task1);
			System.out.println("End");
		} finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}

}