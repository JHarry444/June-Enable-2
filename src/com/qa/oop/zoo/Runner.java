package com.qa.oop.zoo;

public class Runner {

	public static void main(String[] args) {

//		Animal a = new Animal();
//		a.makeNoise();

		Mammal m = new Mammal(4, true, true, true, true, "Kittens");
		m.makeNoise();
		m.sweat();

		System.out.println(m);

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

}
