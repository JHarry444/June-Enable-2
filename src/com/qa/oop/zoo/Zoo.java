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
		}
	}
}
