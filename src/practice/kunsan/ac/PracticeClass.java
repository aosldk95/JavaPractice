package practice.kunsan.ac;

import java.util.Scanner;

public class PracticeClass {

	public static void practice1() {
		Util.printLabel(1, "Celsius to Fahrenheit");

		double celsius = 31.5;
		double fahrenheit = Util.celsiusToFahrenheit(celsius);

		System.out.println(String.format("Celsius : %.2f", celsius));
		System.out.println(String.format("Fahrenheit : %.2f", fahrenheit));
		System.out.println();
	}

	public static void practice2() {
		Util.printLabel(2, "Sum from 1 to 100");

		int m = 1;
		final int MAX_VALUE = 100;
		int sum = 0;

		while (m < MAX_VALUE + 1) {
			sum += m;
			m++;
		}

		String outString = "Sum of numbers : " + sum;
		System.out.println(outString);
		System.out.println();
	}

	public static void practice3() {
		Util.printLabel(3, "Times table");

		final int MIN_FRONT_NUMBER = 2;
		final int MAX_FRONT_NUMBER = 9;
		for (int i = MIN_FRONT_NUMBER; i <= MAX_FRONT_NUMBER; i++) {
			System.out.printf("** %d times table **%n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
		}
	}
	
	public static void practice4() {
		Util.printLabel(4, "Stars");
		System.out.print("Enter line number : ");
		
		// Automatic Resource Management
		try (Scanner sc = new Scanner(System.in)) {
			final int count = sc.nextInt();

			for (int i = 0; i < count; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}
	
	public static void practice5() {
		Util.printLabel(4, "Stars");
		System.out.print("Enter score : ");

		try (Scanner sc = new Scanner(System.in)) {
			final int score = sc.nextInt();
			final char grade;

			if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}

			System.out.printf("The grade in %c.%n", grade);
		}
	}
}
