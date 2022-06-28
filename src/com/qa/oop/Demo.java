package com.qa.oop;

public class Demo {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.print();
		d.name = "Rex";
		d.age = 12;
		d.colour = "Brown";
		d.breed = "German Shepherd";
		d.print();

		Dog d2 = new Dog();
		d2.print();
		d2.name = "Puggsley";
		d2.age = 8;
		d2.colour = "Grey";
		d2.breed = "Pug";
		d2.print();

		Dog d3 = new Dog("Woofy", 13, "Alsation", "Blonde");
		d3.print();
		d3.bark();
	}

}
