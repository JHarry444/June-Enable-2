package com.qa.list;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		int i = 12;
		Integer I = 24;

		List<Integer> immutableList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(immutableList);

		ArrayList<Integer> mutableList = new ArrayList<>(immutableList);
		mutableList.add(27);
		System.out.println(mutableList);

		ArrayList<Integer> nums = new ArrayList<>();

		for (int j = 0; j < 10; j++) {
			nums.add(j * j);
		}

		System.out.println(nums);

		for (int j = 0; j < nums.size(); j++) {
			System.out.println(nums.get(j));
		}

		nums.add(null);

		for (Integer j : nums) {
			System.out.println(j);
		}
	}

}
