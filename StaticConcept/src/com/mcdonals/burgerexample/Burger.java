package com.mcdonals.burgerexample;

import java.util.Scanner;

public class Burger {
	static String brand = "McDonalds";
	String type;
	int price;

	Burger(String type, int price) {
		int x;
		this.type = type;
		this.price = price;
	}

	static void display() {
		System.out.println("Display method");
		Burger b = new Burger("Non-veg", 450);
		b.show();
	}

	void show() {
		Burger.display();
		System.out.println("Show method");
	}

	public static void main(String[] args) {
		System.out.println(Burger.brand);// McDonalds
		Burger.display();

	}
}
