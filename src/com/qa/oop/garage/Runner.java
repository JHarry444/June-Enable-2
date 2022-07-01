package com.qa.oop.garage;

public class Runner {

	public static void main(String[] args) {
		Garage garage = new Garage();

		garage.addVehicle(new Car(false, 30));
		garage.addVehicle(new Bike(5, false, true));
		garage.addVehicle(new Boat(false, true));

		System.out.println("Bill: " + garage.calcBill());

		garage.print();
		garage.removeVehicle(2);
		garage.print();
		garage.removeVehicle("boat");
		garage.print();
	}

}
