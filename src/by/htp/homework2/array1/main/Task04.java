package by.htp.homework2.array1.main;

import java.util.Random;

public class Task04 {
	/*
	 * 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить,
	 * будет ли она возрастающей.
	 */
	public static void main(String[] args) {

		System.out.println("task04");

		double[] array = arrayСreation(3);
		array = arrayFillingRandom(array, 100);
		arrayPrint(array);

		int count = checkCountIncrease(array);
		checkIncrease(count, array);

	}

	public static void checkIncrease(int count, double[] args) {

		if (count == args.length) {
			System.out.println("Последовательность возрастающая");
		} else {
			System.out.println("Последовательность не возрастающая");
		}

	}

	public static int checkCountIncrease(double[] args) {

		int count = 1;
		double max = args[0];

		for (int i = 1; i < args.length; i++) {
			if (args[i] > max) {
				count++;
				max = args[i];
			}
		}

		return count;

	}

	public static void arrayPrint(double[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

	public static double[] arrayСreation(int i) {

		double[] array = new double[i];

		return array;

	}

	public static double[] arrayFillingRandom(double[] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = Math.pow(-rand.nextDouble() * a, rand.nextInt(4));
		}

		return args;
	}
}
