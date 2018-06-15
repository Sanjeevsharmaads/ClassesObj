package com.package3;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();
		Product product2 = new Product();
		product1.getId(1);
		product1.getName("Shirt");
		product1.getQuantity(3);
		product2.getName("Jeans");
		product2.getQuantity(4);
		product2.getId(2);
		product1.show();
		product2.show();
	}

}
