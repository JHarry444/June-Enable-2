package com.qa.iteration;

public class Coins {

	public static void makeChange(int cost, int amount) {
		int change = amount - cost;

		int fiftyPounds = 0;
		int twentyPounds = 0;
		int tenPounds = 0;
		int fivePounds = 0;
		int twoPounds = 0;
		int onePounds = 0;
		int fiftyPences = 0;
		int twentyPences = 0;
		int tenPences = 0;
		int fivePences = 0;
		int twoPences = 0;
		int onePences = 0;

		while (change > 0) {
			if (change >= 5_000) {
				fiftyPounds++;
				change -= 5_000;
			} else if (change >= 2_000) {
				twentyPounds++;
				change -= 2_000;
			} else if (change >= 1_000) {
				tenPounds++;
				change -= 1_000;
			} else if (change >= 500) {
				fivePounds++;
				change -= 500;
			} else if (change >= 1_000) {
				tenPounds++;
				change -= 1_000;
			} else if (change >= 500) {
				fivePounds++;
				change -= 500;
			} else if (change >= 200) {
				twoPounds++;
				change -= 200;
			} else if (change >= 100) {
				onePounds++;
				change -= 100;
			} else if (change >= 50) {
				fiftyPences++;
				change -= 50;
			} else if (change >= 20) {
				twentyPences++;
				change -= 20;
			} else if (change >= 10) {
				tenPences++;
				change -= 10;
			} else if (change >= 5) {
				fivePences++;
				change -= 5;
			} else if (change >= 2) {
				twoPences++;
				change -= 2;
			} else if (change >= 1) {
				onePences++;
				change -= 1;
			}
		}
		System.out.println();

	}

}
