package com.jspiders.idgenerator;

public class IdCard {
	String name;
	long phoneNo;

	IdCard(String name, long phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public static void main(String[] args) {
		IdCard i1 = new IdCard("Charlie", 123456);
		System.out.println(i1.name + " " + i1.phoneNo); // Charlie 123456

		IdCard i2 = new IdCard("Mahesh", 9876543210L);
		System.out.println(i2.name + " " + i2.phoneNo);// Mahesh 9876543210
	}
}
