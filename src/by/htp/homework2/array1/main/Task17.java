package by.htp.homework2.array1.main;

import java.util.Random;

public class Task17 {
	/*
	 * 17. Дана последовательность целых чисел
	 * 
	 * a a an , , , 1 2  . Образовать новую
	 * 
	 * последовательность, выбросив из исходной те члены, которые равны
	 * 
	 * min( , , , ) a1 a2  an
	 */
	public static void main(String[] args) {

		System.out.println("task17");

		int[] array = arrayСreation(1000);
		array = arrayFillingRandom(array, 1000);
		arrayPrint(array);

		int arrayMin = arrayFindMin(array);
		printInt("Min = ", arrayMin);

		int arrayMinLength = arrayMinLength(array, arrayMin);
		printInt("arrayMinLength = ", arrayMinLength);

		int[] arrayWithoutMin = arrayСreation(arrayMinLength);
		arrayWithoutMin = arrayFillingWithoutMin(array, arrayWithoutMin, arrayMin);
		arrayPrint(arrayWithoutMin);

	}

	public static int arrayMinLength(int[] args, int min) {

		int arrayMinLength = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] != min) {
				arrayMinLength++;
			}
		}

		return arrayMinLength;
	}

	public static int[] arrayFillingWithoutMin(int[] args, int[] array, int min) {

		int count = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] != min) {
				array[count] = args[i];
				count++;
			}
		}

		return array;
	}

	public static int arrayFindMin(int[] args) {

		int min = args[0];

		for (int i = 1; i < args.length; i = i + 2) {
			if (args[i] < min) {
				min = args[i];
			}
		}

		return min;
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

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
}
