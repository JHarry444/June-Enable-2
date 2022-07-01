package com.qa.oop.person;

public class Person {

	public static String latinName = "Home Sapien";

	private String name;
	private int age;
	private String jobTitle;

	private boolean muppet;

	public Person() {

	}

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.setAge(age);
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age >= 0 && age < 111) {
			this.age = age;
		} else {
			System.out.println("Invalid age: " + age);
		}
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public boolean isMuppet() {
		return this.muppet;
	}

}
