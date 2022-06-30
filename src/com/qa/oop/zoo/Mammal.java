package com.qa.oop.zoo;

public abstract class Mammal extends Animal {
	public Mammal() {
		super(); // Animal Line 5
	}

	public Mammal(int noOfLegs, boolean canFly, boolean hasScales, boolean hasFur, boolean coldBlooded, String diet) {
		super(noOfLegs, canFly, hasScales, hasFur, coldBlooded, diet); // Animal Line 9
	}

	public void sweat() {
		System.out.println("drip");
	}
}
