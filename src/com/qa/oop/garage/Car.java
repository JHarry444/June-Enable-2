package com.qa.oop.garage;

public class Car extends Vehicle {

	private int bootSize;

	public Car() {
		super();
	}

	public Car(boolean electric, int bootSize) {
		super(4, electric);
		this.bootSize = bootSize;
	}

	public int getBootSize() {
		return this.bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

	@Override
	protected float calcBill() {
		float bill = 0;
		bill += this.getNoOfWheels() * 12;
		bill += this.getBootSize() + 5;
		return bill;
	}

	@Override
	public String toString() {
		return "Car [bootSize=" + this.bootSize + ", getId()=" + this.getId() + ", getNoOfWheels()="
				+ this.getNoOfWheels() + ", isElectric()=" + this.isElectric() + "]";
	}

}
