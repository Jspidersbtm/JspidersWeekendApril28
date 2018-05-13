package com.zoo.animalexample;

public class Cat extends Animal {
	boolean isHungry;

	Cat() {
		super("Wild", 4, 3.5);
	}

	Cat(boolean isHungry, String type, int noOfLegs, double weight) {
		super(type, noOfLegs, weight);
		this.isHungry = isHungry;
	}

	public static void main(String[] args) {
		Cat c = new Cat();

		Cat c1 = new Cat(true, "Domestic", 4, 5.6);

	}

}
