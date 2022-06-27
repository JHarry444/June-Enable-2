package com.qa.arrays;

public class Demo {

	public static void main(String[] args) {
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f' };
		System.out.println("0: " + letters[0]);
		letters[0] = 'A';
		System.out.println("0: " + letters[0]);
		System.out.println("Len: " + letters.length);
//		letters[6] = 'g'; cannot access/assign a value greater than the last index

		System.out.println(letters);

		for (int i = 0; i < letters.length; i++) {
			char letter = letters[i];
			System.out.println(i + ": " + letter);
		}

		for (char letter : letters) {
			System.out.println(letter);
		}

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i * i;
		}

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			System.out.println(i + ": " + num);
		}

		System.out.println(nums);
	}

}
