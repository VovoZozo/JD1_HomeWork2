package by.htp.homework2.array1.main;

import java.util.Random;

public class Task16 {
	/*
	 * 16. Даны действительные числа . Найти
	 */
	public static void main(String[] args) {

		System.out.println("task16");

		int[] array = arrayСreation(1000);
		array = arrayFillingRandom(array, 1000);
		arrayPrint(array);

		int[] arrayFillingSum = arrayFillingSum(array);
		arrayPrint(arrayFillingSum);

		int arrayMax = arrayFindMax(arrayFillingSum);
		printInt("Max(a(1)+a(2n),...,a(n)+a(n+1))  =  ", arrayMax);

	}

	public static int arrayFindMax(int[] args) {

		int max = args[0];

		for (int i = 2; i < args.length; i = i + 2) {
			if (args[i] > max) {
				max = args[i];
			}
		}

		return max;
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

	public static int[] arrayFillingSum(int[] args) {
		int[] array = new int[args.length / 2];

		for (int i = 0; i < array.length; i++) {
			array[i] = args[i] + args[args.length - i - 1];
		}

		return array;
	}

	public static int[] arrayFillingRandom(int[] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = rand.nextInt(a);
		}

		return args;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
}
