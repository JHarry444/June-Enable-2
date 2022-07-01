package com.qa.oop.garage;

public class Bike extends Vehicle {

	private boolean sideCar;

	public Bike() {
		super();
	}

	public Bike(int noOfWheels, boolean electric, boolean sideCar) {
		super(noOfWheels, electric);
		this.sideCar = sideCar;
	}

	public boolean isSideCar() {
		return this.sideCar;
	}

	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}

	@Override
	protected float calcBill() {
		float bill = 0;
		bill += this.getNoOfWheels() * 12;
		if (this.isSideCar()) {
			bill += 55;
		}
		return bill;
	}

	@Override
	public String toString() {
		return "Bike [sideCar=" + this.sideCar + ", getNoOfWheels()=" + this.getNoOfWheels() + ", isElectric()="
				+ this.isElectric() + "]";
	}

}
