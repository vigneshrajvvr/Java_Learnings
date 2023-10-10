import java.util.concurrent.*;
public class AwaitTasks {
	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(() -> 30 + 11);
		} finally {
			if(service != null) {
				service.shutdown();
			}
		}
		
		if(service != null) {
			service.awaitTermination(1, TimeUnit.MINUTES);
			if(service.isTerminated()) {
				System.out.println("Finished!");
			} else {
				System.out.println("At least one task is still running");
			}
		}
	}
}