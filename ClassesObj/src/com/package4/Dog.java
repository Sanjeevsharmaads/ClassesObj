package com.package4;

public class Dog {
	String name;
	String breed;
	String color;

	public Dog(String name, String breed, String color)

	{
		this.name = name;
		this.breed = breed;
		this.color = color;
	}

	public void getDetails() {
		System.out.println("Name of dog is " + name + " Breed of dog is  " + breed + " Color of Dog is " + color);
	}
}
