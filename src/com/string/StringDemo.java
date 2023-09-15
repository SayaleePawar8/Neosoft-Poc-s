package com.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="World";
		String result=s1.concat(s2);
		System.out.println(result);
		String result1=s2.concat(s1);
		System.out.println(result);
		
		if(s1.equals(s2))
			System.out.println("Strings are Equal");
		else 
			System.out.println("Strings are Not Equal");


	}

}