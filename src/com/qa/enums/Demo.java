package com.qa.enums;

import java.time.LocalDate;
import java.time.Month;

public class Demo {

	public static void main(String[] args) {

		LocalDate.of(1994, Month.APRIL, 4);

		for (int i = 0; i < 30; i++) {
			System.out.println(flipCoin(Flip.HEADS));
		}
	}

	private static boolean flipCoin(Flip called) {
		double rand = Math.random();

		Flip result = null;
		if (rand < 0.01) {
			result = Flip.EDGE;
		} else if (rand <= 0.5) {
			result = Flip.TAILS;
		} else {
			result = Flip.HEADS;
		}

		System.out.println("Result: " + result);

		return called == result;
	}
}
