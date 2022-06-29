package com.qa.oop.zoo;

public class Bat extends Mammal {

	public Bat() {
		super(2, true, false, true, false, "Blud");

	}

	public Bat(int noOfLegs, boolean canFly, boolean hasScales, boolean hasFur, boolean coldBlooded, String diet) {
		super(noOfLegs, canFly, hasScales, hasFur, coldBlooded, diet);
	}

	@Override
	public void makeNoise() {
		System.out.println("My super sonic sonar radar will help me");
	}

	public void fly() {
		System.out.println("flap flap");
	}
}
