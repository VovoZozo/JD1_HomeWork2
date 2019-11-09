package by.htp.homework2.array1.main;

import java.util.Random;

public class Task03 {
	/*
	 * 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
	 * встречается раньше - положительное или отрицательное.
	 */
	public static void main(String[] args) {

		System.out.println("task03");

		int[] array = arrayСreation(100);
		array = arrayFillingRandom(array, 100);
		arrayPrint(array);

		checkFirstElement(array);
	}

	public static void checkFirstElement(int[] args) {

		if (args[0] > 0) {
			System.out.println("Первое число положительное");
		} else if (args[0] < 0) {
			System.out.println("Первое число отрицательное");
		} else if (args[0] == 0) {
			System.out.println("Первое число равно нулю");
		}

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
