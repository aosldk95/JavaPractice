package practice.kunsan.ac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PracticeClass {

	public static void practice1() {
		Util.printLabel(1, "Celsius to Fahrenheit");

		double celsius = 31.5;
		double fahrenheit = Util.celsiusToFahrenheit(celsius);

		System.out.printf("Celsius : %.2f%n", celsius);
		System.out.printf("Fahrenheit : %.2f%n", fahrenheit);
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
	
	public static void practice13_2() {
		Calculator<Double> doubleCalculator = new Calculator<Double>();
		double a1 = 1.5;
		double b1 = 3.0;
		double ret1 = doubleCalculator.sum(a1, b1);
		System.out.printf("Sum of %f and %f equals %f%n", a1, b1, ret1);
		
		Calculator<Integer> intCalculator = new Calculator<Integer>();
		int a2 = 5;
		int b2 = 8;
		int ret2 = (int)(intCalculator.multiply(a2, b2));
		System.out.printf("%d multiple %d equals %d%n", a2, b2, ret2);
		
		int a3 = 4;
		int b3 = 8;
		double ret3 = Calculator2.divide(a3, b3);
		System.out.printf("%d divide %d equals %f%n", a3, b3, ret3);
	}
	
	public static void practice17() {
		// 0 : print path where application was initialized
		String workingDirectory = System.getProperty("user.dir");
		System.out.println("[L] Working directory : " + workingDirectory);

		String inputFileName = workingDirectory + "\\score.txt";
		String outFileName = workingDirectory + "\\scoreavg.txt";

		final String delimiters = "\\,";

		try {

			// 1st : check input file exists
			File inputFile = new File(inputFileName);
			if (!inputFile.exists()) {
				System.out.println("[E] File not found");
				return;
			}

			// 2nd : check out file exists. If not, create one.
			File newFile = new File(outFileName);
			if (!newFile.exists())
				newFile.createNewFile();

			// 3rd : create writer and reader instance
			FileWriter fw = new FileWriter(newFile);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.UTF_8));
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(newFile), StandardCharsets.UTF_8));
			String line = br.readLine();

			// 4th : read & parse & write
			while (line != null) {
				int sum = 0;
				String[] numberString = line.split(delimiters);
				for (int i = 1; i < numberString.length; i++) {
					sum += Integer.parseInt(numberString[i]);
				}

				int avg = (int) (sum * 1.0 / (numberString.length - 1));

				char delimiter = ',';
				StringBuilder sb = new StringBuilder();
				sb.append(line);
				sb.append(delimiter);
				sb.append(sum);
				sb.append(delimiter);
				sb.append(avg);
				sb.append("\n");

				bw.append(sb);

				// for loop
				line = br.readLine();
			}

			// 5th : close all stream
			br.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
