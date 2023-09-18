package com.oop;

public class SingletonDemo {

	public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Are both references pointing to the same instance? " + (s1 == s2));
    }
}