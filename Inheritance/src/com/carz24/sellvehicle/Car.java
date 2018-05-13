package com.carz24.sellvehicle;

public class Car extends Vehicle {
	boolean isAcPresent;

	Car(String color, String variant, boolean isAcPresent) {
		super(color, variant);
		this.isAcPresent = isAcPresent;
	}

	void cruiseControl() {
		System.out.println("Cruize control");
	}

	public static void main(String[] args) {

		Car c = new Car("Blue", "Petrol", true);

		Car c2 = new Car("Red", "Diesel", false);
	}
}
