package com.threads;

public class RaceConditionDemo {

	private static int sharedCounter=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread incThread = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                sharedCounter++; // Increment shared counter
            }

        });
		
		Thread decThread = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                sharedCounter--; // Decrement shared counter
            }

        });
		
		incThread.start();
		decThread.start();

		try {
			incThread.join();
			decThread.join();
			}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Final Shared Counter Value"+sharedCounter);
		}
	

}