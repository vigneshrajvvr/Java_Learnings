package concurrency;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {
	
	public void removeLions() {
		System.out.println("Removing lions");
	}
	
	public void cleanPen() {
		System.out.println("Cleaning the pen");
	}
	
	public void addLions() {
		System.out.println("Adding lions");
	}
	
	public void performTask(CyclicBarrier wait1, CyclicBarrier wait2) {
		
		try {
			removeLions();
			wait1.await();
			cleanPen();
			wait2.await();
			addLions();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		ExecutorService executor = null;
		var manager = new CyclicBarrierExample();
		try {
			executor = Executors.newFixedThreadPool(4);
			var wait1 = new CyclicBarrier(4);
			var wait2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));
			for(int i = 0; i < 4; i++) {
				executor.submit(() -> manager.performTask(wait1, wait2));
			}
		} finally {
			if(executor != null) {
				executor.shutdown();
			}
		}
	}

}
