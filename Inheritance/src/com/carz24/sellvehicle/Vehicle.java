package com.carz24.sellvehicle;

public class Vehicle {
	String color;
	String variant;

	Vehicle(String color, String variant) {
		// super();
		this.color = color;
		this.variant = variant;
	}

	void start() {
		System.out.println("Start the vehicle");
	}
}
