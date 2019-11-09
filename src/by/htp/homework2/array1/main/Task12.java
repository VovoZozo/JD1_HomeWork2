package by.htp.homework2.array1.main;

import java.util.Random;

public class Task12 {
	/*
	 * 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
	 * порядковые номера которых являются простыми числами.
	 */
	public static void main(String[] args) {

		System.out.println("task12");

		double[] array = arrayСreation(1000);
		array = arrayFillingRandom(array, 1000);
		arrayPrint(array);

		double sumPrimeNomber = sumPrimeNomber(array);
		printDouble("Сумма чисел порядковые номера которых являются простыми = ", sumPrimeNomber);

	}

	public static double sumPrimeNomber(double[] array) {

		double sum = 0;
		for (int i = 1; i < array.length; i++) {
			if (checkPrimeNomber(i)) {
				sum = sum + array[i];
			}
		}

		return sum;

	}

	public static boolean checkPrimeNomber(int a) {

		boolean prime = true;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				prime = false;
			}
		}

		return prime;
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

	public static void printDouble(String s, double a) {

		System.out.println(s + a);

	}

}
