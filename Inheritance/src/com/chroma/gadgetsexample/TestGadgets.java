package com.chroma.gadgetsexample;

public class TestGadgets {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println("Before changing all the values");
		System.out.print(p.color + " " + p.price + " " + p.brand + " " + p.os + " " + p.shape);
		p.color = "Black";
		p.price = 15000;
		p.brand = "Samsung";
		p.os = "Android";
		p.shape = "Rectangle";

		System.out.println("\nafter changing all the values");
		System.out.print(p.color + " " + p.price + " " + p.brand + " " + p.os + " " + p.shape);
		System.out.println();
		p.call();
		p.sms();
		p.switchOff();
		p.switchOn();

		System.out.println("____________________________________________________________");

		Ipad i = new Ipad();
		System.out.println("Before changing all the values");
		System.out.print(i.color + " " + i.price + " " + i.brand + " " + i.os + " " + i.shape);
		i.color = "White";
		i.price = 25000;
		i.brand = "Apple";
		i.os = "IOS";
		i.shape = "Square";

		System.out.println("\nafter changing all the values");
		System.out.print(i.color + " " + i.price + " " + i.brand + " " + i.os + " " + i.shape);
		System.out.println();
		i.call();
		i.sms();
		i.switchOff();
		i.switchOn();
		i.faceTime();

	}
}
