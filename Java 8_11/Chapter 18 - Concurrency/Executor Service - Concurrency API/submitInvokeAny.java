import java.util.concurrent.*;
import java.util.*;
public class submitInvokeAny {

	public static void main(String args[]) throws Exception{
		ExecutorService service = null;
		
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("Begin");
			Callable<String> task1 = () -> "result1";
			Callable<String> task2 = () -> "result2";
			Callable<String> task3 = () -> "result3";
			String data = service.invokeAny(List.of(task2, task1, task3));
			System.out.println(data);
			System.out.println("End");
		} finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}

}