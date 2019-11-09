package by.htp.homework2.array1.main;

import java.util.Random;

public class Task14 {
	/*
	 * 14. Дан одномерный массив A[N]. Найти:
	 * 
	 * max( , , , ) + min( , , , )
	 */
	public static void main(String[] args) {

		System.out.println("task14");

		int[] array = arrayСreation(1000);
		array = arrayFillingRandom(array, 1000);
		arrayPrint(array);

		int arrayMax = arrayFindMax(array);
		int arrayMin = arrayFindMin(array);

		int sumMaxMin = sumMaxMin(arrayMax, arrayMin);
		printInt("Сумма по заданному условию = ", sumMaxMin);

	}

	public static int sumMaxMin(int max, int min) {
		int sum;
		sum = max + min;
		return sum;
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
