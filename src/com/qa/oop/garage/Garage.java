package com.qa.oop.garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	private int count = 0;

	public void addVehicle(Vehicle v) {
		v.setId(++count);
		this.vehicles.add(v);
	}

	public float calcBill() {
		float bill = 0;
		for (Vehicle v : this.vehicles)
			bill += v.calcBill();
		return bill;
	}

	public float calcBillOld() {
		float bill = 0;
		for (Vehicle v : this.vehicles) {

			if (v instanceof Car) {
				bill += v.getNoOfWheels() * 12;
				bill += ((Car) v).getBootSize() + 5;
			} else if (v instanceof Bike) {
				bill += v.getNoOfWheels() * 12;
				if (((Bike) v).isSideCar()) {
					bill += 55;
				}
			} else if (v instanceof Boat) {
				bill += v.getNoOfWheels() * 12;
				if (((Boat) v).isSails()) {
					bill *= 2;
				}
			}
		}

		return bill;
	}

	public void removeVehicle(Vehicle v) {
		this.vehicles.remove(v);
	}

	public void removeVehicle(int id) {
		for (Vehicle v : this.vehicles) {
			if (v.getId() == id) {
				this.vehicles.remove(v);
				return;
			}
		}
	}

	public void removeVehicle(String type) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : this.vehicles) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(v);
			}
		}
		this.vehicles.removeAll(toRemove);
	}

	public void print() {
		System.out.println(this.vehicles);
	}

	public void empty() {
		this.vehicles.clear();
	}
}
