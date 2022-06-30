package com.qa.oop.zoo;

public abstract class Animal extends Object {

	private int noOfLegs;
	private boolean canFly;
	private boolean hasScales;
	private boolean hasFur;
	private boolean coldBlooded;
	private String diet;

	public Animal() {
		super();
	}

	public Animal(int noOfLegs, boolean canFly, boolean hasScales, boolean hasFur, boolean coldBlooded, String diet) {
		super();
		this.noOfLegs = noOfLegs;
		this.canFly = canFly;
		this.hasScales = hasScales;
		this.hasFur = hasFur;
		this.coldBlooded = coldBlooded;
		this.diet = diet;
	}

	public abstract void makeNoise(); // every animal can make a noise

	@Override
	public String toString() {
		return "Animal [noOfLegs=" + this.noOfLegs + ", canFly=" + this.canFly + ", hasScales=" + this.hasScales
				+ ", hasFur=" + this.hasFur + ", coldBlooded=" + this.coldBlooded + ", diet=" + this.diet + "]";
	}

	public int getNoOfLegs() {
		return this.noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public boolean isCanFly() {
		return this.canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean isHasScales() {
		return this.hasScales;
	}

	public void setHasScales(boolean hasScales) {
		this.hasScales = hasScales;
	}

	public boolean isHasFur() {
		return this.hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	public boolean isColdBlooded() {
		return this.coldBlooded;
	}

	public void setColdBlooded(boolean coldBlooded) {
		this.coldBlooded = coldBlooded;
	}

	public String getDiet() {
		return this.diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

}
