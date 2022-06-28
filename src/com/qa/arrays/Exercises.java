package com.qa.arrays;

public class Exercises {

	public static void main(String[] args) {
//		exOne();
		exTwo();
	}

	public static void exOne() {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = 5 * i;
		}

		for (int num : nums) {
			System.out.println(num);
		}
	}

	public static void exTwo() {
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = 5 * i;
			System.out.println(nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
//			nums[i] = nums[i] * 10;
			nums[i] *= 10;
			System.out.println(nums[i]);
		}
	}

}
