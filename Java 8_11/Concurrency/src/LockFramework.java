import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockFramework {
	
	public static void main(String args[]) {
		
		Lock lock = new ReentrantLock();
		new Thread(() -> printMessage(lock)).start();
		
//		if(lock.tryLock()) {
		try {
			if(lock.tryLock(10, TimeUnit.SECONDS)) {
				try {
					System.out.println("Lock obtained, entering protected code");
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("Unable to acquire lock, doing something else");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void printMessage(Lock lock) {
		try {
			lock.lock();
		} finally {
			lock.unlock();
		}
	}

}
