import java.util.concurrent.*;
import java.util.*;
public class submitInvokeAll {

	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
		
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("Begin");
			Callable<String> task = () -> "result";
			List<Future<String>> list = service.invokeAll(List.of(task, task, task));
			for(Future<String> future : list) {
				System.out.println(future.get());
			}
			System.out.println("End");
		} finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}

}