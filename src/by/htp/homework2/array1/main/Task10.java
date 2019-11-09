package by.htp.homework2.array1.main;

import java.util.Random;

public class Task10 {
	/*
	 * 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
	 * которых аi > i.
	 */
	public static void main(String[] args) {

		System.out.println("task10");

		int[] array = arrayСreation(100);
		array = arrayFillingRandom(array, 100);
		arrayPrint(array);

		int arrayChangeLength = arrayChangeLength(array);

		int[] arrayChangeNew = arrayChangeNew(array, arrayChangeLength);
		arrayPrint(arrayChangeNew);

	}

	public static int[] arrayChangeNew(int[] args, int arrayChangeLength) {
		int[] array = new int[arrayChangeLength];
		int count = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] > i) {
				array[count] = args[i];
				count++;
			}
		}

		return array;
	}

	public static int arrayChangeLength(int[] args) {

		int arrayChangeLength = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] > i) {
				arrayChangeLength++;
			}
		}

		return arrayChangeLength;
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

	public static int[] arrayFillingRandom(int[] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = (int) Math.pow(-rand.nextInt(a), rand.nextInt(4));
		}

		return args;
	}

}
