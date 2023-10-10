import java.util.concurrent.*;

public class ScheduledExecutorServices {

	public static void main(String args[]) throws Exception{
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Runnable task1 = () -> System.out.println("Hello Zoo");
		Callable<String> task2 = () -> {System.out.println("Inside task"); return "Monkey";};
		ScheduledFuture<?> r2 = service.schedule(task2, 5, TimeUnit.SECONDS);
		ScheduledFuture<?> r1 = service.schedule(task1, 5, TimeUnit.SECONDS);
		System.out.println(Runtime.getRuntime().availableProcessors());
		ScheduledFuture<?> r3 = service.scheduleAtFixedRate(task1, 0L, 2L, TimeUnit.SECONDS);
		ScheduledFuture<?> r4 = service.scheduleWithFixedDelay(task1, 0L, 2L, TimeUnit.SECONDS);
		
		if(service != null) {
			service.shutdown();
		}
	}
}