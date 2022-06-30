package com.qa.oop.zoo;

public class Bat extends Mammal {

	private boolean rabid;

	public Bat() {
		super(2, true, false, true, false, "Blud");

	}

	public Bat(int noOfLegs, boolean canFly, boolean hasScales, boolean hasFur, boolean coldBlooded, String diet,
			boolean rabid) {
		super(noOfLegs, canFly, hasScales, hasFur, coldBlooded, diet);
		this.rabid = rabid;
	}

	@Override
	public void makeNoise() {
		System.out.println("My super sonic sonar radar will help me");
	}

	public void fly() {
		System.out.println("flap flap");
	}

	public boolean isRabid() {
		return this.rabid;
	}

	public void setRabid(boolean rabid) {
		this.rabid = rabid;
	}

}
