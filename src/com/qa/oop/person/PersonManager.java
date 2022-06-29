package com.qa.oop.person;

import java.util.ArrayList;

public class PersonManager {

	public ArrayList<Person> people = new ArrayList<>();

	public Person findByName(String name) {
		for (Person p : this.people) {
			// don't use == with String
			if (p.getName().equals(name)) {
				return p;
			}
		}

		return null;
	}

}
