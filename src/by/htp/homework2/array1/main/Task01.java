package by.htp.homework2.array1.main;

import java.util.Random;

public class Task01 {
	/*
	 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
	 * которые кратны данному К.
	 */
	public static void main(String[] args) {

		System.out.println("task01");

		int k = randomInt(100);
		printInt("Дано число K = ", k);

		int[] array = arrayСreation(1000);
		array = arrayFilling(array, 1000);
		arrayPrint(array);

		int sumOfMultiple = sumOfMultiple(array, k);
		printInt("Сумма элементов массива кратных числу K = ", sumOfMultiple);

	}

	public static int sumOfMultiple(int[] args, int b) {

		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			if (multiple(args[i], b)) {
				sum = sum + args[i];
			}
		}

		return sum;
	}

	public static boolean multiple(int a, int b) {

		return a % b == 0;

	}

	public static void arrayPrint(int[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

	public static int[] arrayСreation(int i) {

		int[] array = new int[i];

		return array;

	}

	public static int[] arrayFilling(int[] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = rand.nextInt(a) + 1;
		}

		return args;
	}

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a);

		return x;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
}
