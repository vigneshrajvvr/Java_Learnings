import java.util.concurrent.*;

public class AddData {
	public static void main(String[] args) throws Exception{
		ExecutorService service = null;
		
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(() -> 30 + 11);
			System.out.println(result.get());
		} finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}
}