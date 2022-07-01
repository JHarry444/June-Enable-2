package com.qa.oop.garage;

public abstract class Vehicle {

	private int noOfWheels;
	private boolean electric;
	private int id;

	// static count
	public Vehicle() {
		super();
		// set id equal to count then increment
	}

	public Vehicle(int noOfWheels, boolean electric) {
		super();
		this.noOfWheels = noOfWheels;
		this.electric = electric;
		// set id equal to count then increment
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfWheels() {
		return this.noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public boolean isElectric() {
		return this.electric;
	}

	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	protected abstract float calcBill();

	@Override
	public String toString() {
		return "Vehicle [noOfWheels=" + this.noOfWheels + ", electric=" + this.electric + ", id=" + this.id + "]";
	}

}
