package com.qa.oop.zoo;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Animal> animals = new ArrayList<>();

	public void addAnimal(Animal a) {
		this.animals.add(a);
	}

	public void removeAnimal(Animal a) {
		this.animals.remove(a);
	}

	public void poke() {
		for (Animal a : animals) {
			a.makeNoise();

			((Bat) a).fly(); // breaks

			if (a instanceof Bat) { // checks if a is a Bat
				((Bat) a).fly(); // treats a as a Bat for THIS LINE ONLY
			} else if (a instanceof Whale) { // checks if a is a Whale
				((Whale) a).murder(); // treats a as a Whale for THIS LINE ONLY
			}

		}
	}
}
