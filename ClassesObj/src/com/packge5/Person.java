package com.packge5;

public class Person {

	int age;
	String name;
	String currentcity;

	public Person(int age, String name, String currentcity) {
		this.age = age;
		this.name = name;
		this.currentcity = currentcity;
	}

	public void displayDetails() {
		System.out.println(
				"Name of person is :" + name + " Age of person is " + age + " City of person is :" + currentcity);
	}

}
