package com.reliancefresh.vegetableshopping;

public class TestVegetable {
	public static void main(String[] args) {
		Onion o = new Onion();
		o.preparePaste();
		System.out.println(o.color + " " + o.price + " " + o.type + " " + o.noOfLayers);
		// o.prepareFingerFries();
		// o.prepareSauce();
		Potato p = new Potato();
	}
}
