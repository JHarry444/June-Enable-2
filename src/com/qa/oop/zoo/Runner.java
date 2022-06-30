package com.qa.oop.zoo;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		print("hello");

		print(new ArrayList<>());

//		Animal a = new Animal();
//		a.makeNoise();

//		Mammal m = new Mammal(4, true, true, true, true, "Kittens");
//		m.makeNoise();
//		m.sweat();

//		System.out.println(m);

		Bat b = new Bat();
		b.makeNoise();
		b.sweat();
		b.fly();
		Whale w = new Whale();
		w.makeNoise();
		w.sweat();
		w.murder();

		Object i = 12;
		Object s = "Hello";

		Zoo zoo = new Zoo();

		zoo.addAnimal(b);
		zoo.addAnimal(w);

		zoo.poke();
	}

	private static void print(String s) {
		System.out.println(s);
	}

	private static void print(ArrayList<String> strings) {
		for (String s : strings) {
			System.out.println(s);
		}
	}

}
