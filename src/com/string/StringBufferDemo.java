package com.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("Hello ");
		sb.append("java");
		System.out.println(sb);
		System.out.println(sb.capacity());//default 16 	
		sb.reverse();
		System.out.println(sb);

	}

}