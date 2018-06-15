package com.package2;

public class Rectangle {

	int length = 20;
	int breadth = 30;
	int area;

	public void getArea() {
		area = length * breadth;
		System.out.println("Area of rectangle is :" + area);
	}
}
