package com.oop;

class Animal{
	public void makeSound()
	{
		System.out.println("Animals make different Sounds...");
	}
}

class Dog extends Animal{
	public void makeSound()
	{
		System.out.println("BARK!");
	}
	public void walk()
	{ 
		System.out.println("Dog can walk");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("MEOW!");
		}
	public void eat(){
		System.out.println("Cat can eat");
	}
}

public class UpcastDowncastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d= new Dog();
		Animal c= new Cat();
		
		d.makeSound(); 							//Bark-calls overriden method in Dog------Upcasting
		c.makeSound();							//Meow-calls overriden method in Cat-----Upcasting
		
		Dog abc =(Dog) d;						//downcasting- check if instance is of particular subcls type 
		Cat pqr =(Cat) c;
		
		abc.walk();
		pqr.eat();
		
	}

}
