package com.package3;

public class Product {

	String name;
	int id;
	int quantity;

	public void getName(String name) {
		this.name = name;
	}

	public void getId(int id) {
		this.id = id;
	}

	public void getQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void show() {
		System.out.println(
				"Name of Product is : " + name + " Id of product is  " + id + " Quantity of product is : " + quantity);
	}

}
