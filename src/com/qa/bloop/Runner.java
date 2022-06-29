package com.qa.bloop;

import com.qa.oop.person.Person;
import com.qa.oop.person.PersonManager;

public class Runner {

	public static void main(String[] args) {
		Person p = new Person("Jordan", 28, "Trainer");
		System.out.println(p.getAge());
		p.setAge(Integer.MIN_VALUE);
		System.out.println(p.getAge());
		p.setAge(Integer.MAX_VALUE);
		System.out.println(p.getAge());
		p.setAge(29);
		System.out.println(p.getAge());
		Person p2 = new Person("Andrew", 24, "Trainer");

		PersonManager manager = new PersonManager();

		manager.addPerson(p);
		manager.addPerson(p2);

		manager.getPeople().clear();
		Person found = manager.findByName("Jordan");
		System.out.println(found.getName() + " " + found.getAge() + " " + found.getJobTitle());

		System.out.println(new Person("Jordan", 28, "Trainer") == new Person("Jordan", 28, "Trainer"));
	}

}
