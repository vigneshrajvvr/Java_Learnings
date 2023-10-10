import java.util.concurrent.*;
public class CheckResultsExecutor {
	private static int counter;

	public static void main(String args[]) throws Exception {
		ExecutorService service = null;
		
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(() -> {
				for(int i = 0; i < 500; i++) {
					CheckResultsExecutor.counter++;
				}
			}
			);
			result.get(10, TimeUnit.SECONDS);
			System.out.println("Reached");
		} catch(TimeoutException ex) {
			System.out.println("Not reached in time");
		} finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}
}