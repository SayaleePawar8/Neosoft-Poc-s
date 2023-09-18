package com.executorframework;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService =  Executors.newSingleThreadExecutor(); //ExecutorService is an i/f will return a utility class
		Runnable task1 = new Runnable() {                                         //creating a runnable task
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			System.out.println("My task1...");
		}
	};
		Runnable task2=()->{
			System.out.println(Thread.currentThread().getName());             // creating task2 
			System.out.println("My task2...");
		};
		
		MyNewTask task3= new MyNewTask();
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);

		executorService.shutdown();												//release resources 
	
		
	}	
	}
