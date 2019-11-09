package by.htp.homework2.array1.main;

import java.util.Random;

public class Task09 {
	/*
	 * 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
	 * наименьший элементы.
	 */
	public static void main(String[] args) {

		System.out.println("task09");

		double[] array = arrayСreation(10);
		array = arrayFillingRandom(array, 100);
		arrayPrint(array);

		double arrayMax = arrayFindMax(array);
		double arrayMin = arrayFindMin(array);
		printDouble("Наименьший элемент ", arrayMin);
		printDouble("Наибольший элемент ", arrayMax);

		array = checkMinMax(arrayMin, arrayMax, array);
		arrayPrint(array);
	}

	public static double[] checkMinMax(double min, double max, double[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == min) {
				array[i] = max;
			} else if (array[i] == max) {
				array[i] = min;
			}
		}

		return array;
	}

	public static double arrayFindMax(double[] args) {

		double max = args[0];

		for (int i = 1; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
			}
		}

		return max;
	}

	public static double arrayFindMin(double[] args) {

		double min = args[0];

		for (int i = 1; i < args.length; i++) {
			if (args[i] < min) {
				min = args[i];
			}
		}

		return min;
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

	public static void printDouble(String s, double a) {

		System.out.println(s + a);

	}
}
