package by.htp.homework2.array1.main;

import java.util.Random;

public class Task08 {
	/*
	 * 8. Дан массив действительных чисел, размерность которого N. Подсчитать,
	 * сколько в нем отрицательных, положительных и нулевых элементов.
	 */
	public static void main(String[] args) {

		System.out.println("task08");

		double[] array = arrayСreation(10000);
		array = arrayFillingRandom(array, 100);
		arrayPrint(array);

		int countNegativeNumber = countNegativeNumber(array);
		int countPositiveNumber = countPositiveNumber(array);
		int countZeroNumber = countZeroNumber(array);

		printInt("Количество отрицательных элементов = ", countNegativeNumber);
		printInt("Количество положительных элементов = ", countPositiveNumber);
		printInt("Количество нулевых элементов = ", countZeroNumber);

	}

	public static int countZeroNumber(double[] args) {

		int count = 0;

		for (int i = 1; i < args.length; i++) {
			if (args[i] == 0) {
				count++;
			}
		}

		return count;

	}

	public static int countPositiveNumber(double[] args) {

		int count = 0;

		for (int i = 1; i < args.length; i++) {
			if (args[i] > 0) {
				count++;
			}
		}

		return count;

	}

	public static int countNegativeNumber(double[] args) {

		int count = 0;

		for (int i = 1; i < args.length; i++) {
			if (args[i] < 0) {
				count++;
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
			if (args[i] == 1.0) {
				args[i] = 0.0;
			}
		}

		return args;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
}
