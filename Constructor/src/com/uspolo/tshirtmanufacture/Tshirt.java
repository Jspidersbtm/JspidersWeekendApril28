package com.uspolo.tshirtmanufacture;

public class Tshirt {
	int price;
	String color;
	char size;
	String brand = "US Polo";

	Tshirt(String color, int price, char size) {
		this.color = color;
		this.price = price;
		this.size = size;
	}

	Tshirt(String color, char size) {
		this.color = color;
		this.size = size;
		this.price = 1500;
	}

	Tshirt(int price) {
		this.price = price;
		this.size = 'M';
		this.color = "Black";
	}


	@Override
	public String toString() {
		return "Tshirt [color=" + color + "]";
	}

	public static void main(String[] args) {
		Tshirt t = new Tshirt(2500);
		System.out.println(t);
		
		Tshirt t3 = new Tshirt('X');
	}

}