package com.qa.oop.garage;

/**
 * @author jharry-work
 *
 */
/**
 * @author jharry-work
 *
 */
public class Plane extends Vehicle {

	private boolean fixedWing;

	public Plane() {
		super();
	}

	public Plane(int noOfWheels, boolean electric, boolean fixedWing) {
		super(noOfWheels, electric);
		this.fixedWing = fixedWing;
	}

	@Override
	protected float calcBill() {
		float bill = 0;
		bill += getNoOfWheels() * 12;
		if (this.fixedWing) {
			bill *= 3;
		}
		return bill;
	}

	@Override
	public String toString() {
		return "Plane [fixedWing=" + this.fixedWing + ", getNoOfWheels()=" + this.getNoOfWheels() + ", isElectric()="
				+ this.isElectric() + "]";
	}

}
