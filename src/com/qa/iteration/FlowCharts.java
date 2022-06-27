package com.qa.iteration;

public class FlowCharts {

	public static void main(String[] args) {
//		flowchart1();
//		flowchart2();
		oneToTen();
	}

	public static void flowchart1() {
		for (int A = 100; A <= 200; A++)
			System.out.println("A");

	}

	public static void flowchart2() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}

	public static void oneToTen() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.println(i);
			}
		}
	}

	public static void oneToTen2() {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
	}
}
