package lock_cocept_and_coding;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResouces {

	boolean isAvailable = false;

	ReentrantLock lock = new ReentrantLock();
	
	public void producer() {

		try {
			lock.lock();
			System.out.println("Lock aquired by "+Thread.currentThread());
			isAvailable = true;
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			lock.unlock();
		}
	}

}
