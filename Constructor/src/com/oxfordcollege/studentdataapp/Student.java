package com.oxfordcollege.studentdataapp;

public class Student {
	String nameOfStudent;
	String collegeName = "Oxford";

	Student(String name) {
		nameOfStudent = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Rick");
		Student s2 = new Student("Mike");
		System.out.println(s1.nameOfStudent); // Rick
		System.out.println(s2.nameOfStudent); // Mike

	}

}
