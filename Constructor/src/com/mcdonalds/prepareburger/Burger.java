package com.mcdonalds.prepareburger;

public class Burger {
	String type;
	int price;
	String brand = "McDonalds";
	boolean isCheeseRequired;
	String size;

	Burger(String type, String size, boolean isCheeseRequired) {
		// this(type,150,isCheeseRequired,size);
		this.type = type;
		this.size = size;
		this.isCheeseRequired = isCheeseRequired;
		this.price = 150;
	}

	Burger(String type, int price, boolean isCheeseRequired, String size) {
		this.type = type;
		this.price = price;
		this.isCheeseRequired = isCheeseRequired;
		this.size = size;
	}

	Burger(String type) {
		// this(type,250,true,"Small");
		this.type = type;
		this.size = "Small";
		this.price = 250;
		this.isCheeseRequired = true;
	}

	@Override
	public String toString() {
		return "Burger [type=" + type + ", price=" + price + ", brand=" + brand + ", isCheeseRequired="
				+ isCheeseRequired + ", size=" + size + "]";
	}

	public static void main(String[] args) {
		Burger b1 = new Burger("Non_veg");
		System.out.println(b1);

		Burger b2 = new Burger("Veg", "large", true);
		System.out.println(b2);

		Burger b3 = new Burger("Veg", 500, false, "Extra large");
		System.out.println(b3);

		Burger b4 = new Burger("Veg", "Medium", false);
		System.out.println(b4);

		Burger b5 = new Burger("Non-veg", 500, true, "LArge");
		System.out.println(b5);
	}
}
