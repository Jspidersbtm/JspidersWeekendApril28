package com.rollsroyce.customcar;

public class Car {

	String brand = "Rolls Royce";
	String color;
	int price;

	String variant;

	Car() {
		this.color = "Red";
		this.price = 30000000;
		this.variant = "Petrol";
	}

	Car(String color, String variant) {
		this.color = color;
		this.variant = variant;
		this.price = 15000000;
	}

	Car(String variant, String color, int price) {
		this.variant = variant;
		this.color = color;
		this.price = price;
	}

	void showFeature() {
		System.out.println(this.color + " " + this.price + " " + this.brand + " " + this.variant);
	}

	public static void main(String[] args) {
		Car firstCar = new Car("Black", "Diesel");
		firstCar.showFeature();

		Car secondCar = new Car("Blue", "Jetfuel", 50000000);
		secondCar.showFeature();

		Car thirdCar = new Car("Blue", "Petrol", 10000000);
		thirdCar.showFeature();

		Car forthCar = new Car();
		forthCar.showFeature();
	}
}
