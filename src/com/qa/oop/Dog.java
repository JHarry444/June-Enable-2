package com.qa.oop;

public class Dog {

	// instance
	String name;
	int age;
	String breed;
	String colour;

	// default constructor
	public Dog() {
	}

	// constructor overloading
	public Dog(String name, String breed, String colour) {
		this.name = name;
		this.breed = breed;
		this.colour = colour;
	}

	public Dog(String name, int age, String breed, String colour) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.colour = colour;
	}

	public void bark() {
		System.out.println("W00f!");
	}

	public void print() {
		System.out.println(
				"Hello! My name is " + this.name + " and I am a " + age + " years old " + colour + " " + breed);
	}
}
