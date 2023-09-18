package com.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFixedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService= Executors.newFixedThreadPool(3);
		Runnable task1=new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task1 Started...");
				
				try {
				TimeUnit.SECONDS.sleep(2);                                        // to check time in seconds for thread and sleep() needs to be written under try catch block as it can throw a InterruptException
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
				
				System.out.println("Task1 Ended...");
				}
		};
		
		Runnable task2 =()->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Task2 Started...");
			
			try {
			TimeUnit.SECONDS.sleep(2);                                         
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
			System.out.println("Task2 Ended...");
			};
			
			Runnable task3 =()->{
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task2 Started...");
				
				try {
				TimeUnit.SECONDS.sleep(2);                                        
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
				
				System.out.println("Task3 Ended...");
				};
				
			Runnable task4=()->{
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task4 started...");
				try {
					TimeUnit.SECONDS.sleep(3);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
				System.out.println("Task4 Ended...");
				};
				
		  executorService.submit(task1);
		  executorService.submit(task2);
		  executorService.submit(task3);

		  executorService.shutdown();
		  
		}

}
