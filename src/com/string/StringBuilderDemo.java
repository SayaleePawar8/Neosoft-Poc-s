package com.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("Java");             //original string is changed to java
        System.out.println(sb);
		sb.insert(1, "Core");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());

		

	}

}