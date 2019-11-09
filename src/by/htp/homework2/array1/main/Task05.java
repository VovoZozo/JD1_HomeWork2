package by.htp.homework2.array1.main;

import java.util.Random;

public class Task05 {
	/*
	 * 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив
	 * из четных чисел этой последовательности. Если таких чисел нет, то вывести
	 * сообщение об этом факте.
	 */
	public static void main(String[] args) {

		System.out.println("task05");

		int[] array = arrayСreation(100);
		array = arrayFillingRandom(array, 10);
		arrayPrint(array);

		arrayCheckEven(array);

		int arrayFillingEvenLength = arrayFillingEvenLength(array);
		int[] arrayFillingEven = arrayFillingEven(array, arrayFillingEvenLength);
		arrayPrint(arrayFillingEven);

	}

	public static int[] arrayFillingEven(int[] args, int arrayFillingEvenLength) {

		int[] array = new int[arrayFillingEvenLength];
		int count = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] % 2 == 0) {
				array[count] = args[i];
				count++;
			}
		}

		return array;
	}

	public static void arrayCheckEven(int[] args) {

		boolean checkEven = false;

		for (int i = 0; i < args.length; i++) {
			if (args[i] % 2 == 0) {
				checkEven = true;
				break;
			}
		}

		if (!checkEven) {
			System.out.println("В данной последовательности нет четных чисел");
		}

	}

	public static int arrayFillingEvenLength(int[] args) {

		int arrayFillingEvenLength = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] % 2 == 0) {
				arrayFillingEvenLength++;
			}
		}

		return arrayFillingEvenLength;
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
			args[i] = rand.nextInt(a);
		}

		return args;
	}

}
