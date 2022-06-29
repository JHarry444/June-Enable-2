package com.qa.oop.person;

import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> people = new ArrayList<>();

	public Person findByName(String name) {
		for (Person p : this.people) {
			// don't use == with String
			if (p.getName().equals(name)) {
				return p;
			}
		}

		return null;
	}

	public ArrayList<Person> getPeople() {
		return new ArrayList<>(this.people);
	}

	public void addPerson(Person p) {
		this.people.add(p);
	}

	public void removePerson(Person p) {
		this.people.remove(p);
	}

}
