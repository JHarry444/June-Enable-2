package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println("Length:" + s.length());

		int i = 12;

		System.out.println(i++);
		// i = 13
		System.out.println(++i);

		if (i < 20 & i % 2 == 0) {

		}

		System.out.println("Increment by 2:");
		// j = j + 2
		for (int j = 0; j < 20; j += 2) {
			if (j == 14)
				break;
			System.out.println(j);
		}

		System.out.println("STOP");

//		for (int j = 19; j >= 0; j--) {
//			System.out.println(j);
//		}
//		
//		for (int j = 5; j > 4; j++) {
//			
//		}

		int j = 0;
		while (j < 20) {
			System.out.println(j);
			j++;
		}
	}

}
