package com.mcdonalds.coneice;

public class Cone {
	String flavour;
	int price;
	String size;

	public static void main(String[] args) {
		Cone c = new Cone(120);
		System.out.println(c);
	}

	@Override
	public String toString() {
		return "Cone [flavour=" + flavour + ", price=" + price + ", size=" + size + "]";
	}

	Cone(String flavour, int price, String size) {
		this.flavour = flavour;
		this.price = price;
		this.size = size;
	}

	Cone(String flavour, String size) {
		this(flavour, 250, size);
	}

	Cone(int price) {
		this("Chocolate", price, "Medium");
	}

}
