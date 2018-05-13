package com.mcdonals.burgerexample;

import java.util.Scanner;

public class SampleInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.nextLine();
		System.out.println("Enter your age");
		int age = s.nextInt();
		System.out.println("Enter your salary");
		double salary = s.nextDouble();
		System.out.println(name + " " + age + " " + salary);
		s.close();
	}
}
