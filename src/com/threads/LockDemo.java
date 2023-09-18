package com.threads;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class SharedResource{
	private int count =0;
	private Lock lock=new ReentrantLock();          //an instance of ReentrantLock lock is created to synchro. access to count var
	
	public void increment() {                       // method to incr the lock
		lock.lock();								//lock() to acquire the lock.it blocks if another thread currently holds the lock, ensuring mutual exclusion
		try {
			count++;
			System.out.println("Incremented:"+count);
			}
		finally {
			lock.unlock();							//release the lock so that other threads can acquire it 
		}
	}
}

class IncThread extends Thread{						//class to incr the sharedresource 
	private SharedResource res;
	
	public IncThread(SharedResource res) {
		this.res=res;
	}
		
		@Override
		public void run() {
			for(int i=0;i<5;i++)
			{
				res.increment();
			}
		}
}


public class LockDemo {

	public static void main(String[] args) {
		SharedResource sharedResource =new SharedResource();
		IncThread t1= new IncThread(sharedResource);
		IncThread t2= new IncThread(sharedResource);

		t1.start();
		t2.start();
		
	}

}
