package com.qa.oop.garage;

public class Boat extends Vehicle {

	private boolean sails;

	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boat(boolean electric, boolean sails) {
		super(0, electric);
		this.sails = sails;
	}

	public boolean isSails() {
		return this.sails;
	}

	public void setSails(boolean sails) {
		this.sails = sails;
	}

	@Override
	protected float calcBill() {
		float bill = 0;
		bill += this.getNoOfWheels() * 12;
		if (this.isSails()) {
			bill *= 2;
		}
		return bill;
	}

	@Override
	public String toString() {
		return "Boat [sails=" + this.sails + ", getId()=" + this.getId() + ", getNoOfWheels()=" + this.getNoOfWheels()
				+ ", isElectric()=" + this.isElectric() + "]";
	}

}
