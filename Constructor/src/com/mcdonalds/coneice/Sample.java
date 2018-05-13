package com.mcdonalds.coneice;

public class Sample {
	Sample() {
		this(45);
		System.out.println("Zero param");
	}

	Sample(int x) {
		this(10, 20);
		System.out.println("One param int");
	}

	Sample(int x, int y) {
		System.out.println("2 param int, int");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
	}

}
