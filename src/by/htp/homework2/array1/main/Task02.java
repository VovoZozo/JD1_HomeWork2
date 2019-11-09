package by.htp.homework2.array1.main;

import java.util.Random;

public class Task02 {
	/*
	 * 2. В целочисленной последовательности есть нулевые элементы. Создать массив
	 * из номеров этих элементов.
	 */
	public static void main(String[] args) {

		System.out.println("task02");

		int[] array = arrayСreation(100);
		array = arrayFillingRandom(array, 10);
		arrayPrint(array);

		int arrayFillingZeroLength = arrayFillingZeroLength(array);
		int[] arrayZero = arrayFillingZero(array, arrayFillingZeroLength);
		arrayPrint(arrayZero);

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

	public static int[] arrayFillingZero(int[] args, int arrayFillingZeroLength) {

		int[] array = new int[arrayFillingZeroLength];
		int count = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] == 0) {
				array[count] = i;
				count++;
			}
		}

		return array;
	}

	public static int arrayFillingZeroLength(int[] args) {

		int arrayFillingZeroLength = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] == 0) {
				arrayFillingZeroLength++;
			}
		}

		return arrayFillingZeroLength;
	}

	public static int[] arrayFillingRandom(int[] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = rand.nextInt(a);
		}

		return args;
	}
}
