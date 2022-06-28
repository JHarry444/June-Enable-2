package com.qa.arrays;

public class Numbers {

	public static void main(String[] args) {
//		System.out.println(addDigits(74));
//		System.out.println(addDigits(49));
//		System.out.println(addDigits(82));
		for (int i = 1; i < 1_000; i++) {
			System.out.println(numberToWords(i));
		}
	}
// 74

	public static String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	public static String[] tens = { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	public static String numberToWords(int num) {
		String output = "";

		if (num > 99) {
			int hundreds = num / 100;
			output += units[hundreds] + " hundred";
			num %= 100;
			if (num > 0) {
				output += " and ";
			}
		}

		if (num < 20) {
			output += units[num];
		} else {
			int firstDigit = num / 10;
			int secondDigit = num % 10;
			output += tens[firstDigit];
			if (secondDigit > 0) {
				output += "-";
				output += units[secondDigit];
			}
		}

		return output;
	}

	public static int addDigits(int num) {
		int firstDigit = num / 10;
		int secondDigit = num % 10;

		return firstDigit + secondDigit;
	}

}
