package by.htp.homework2.array1.main;

import java.util.Random;

public class Task19 {
	/*
	 * 19. В массиве целых чисел с количеством элементов n найти наиболее часто
	 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
	 * них.
	 */
	public static void main(String[] args) {

		System.out.println("task19");

		int[] array = arrayСreation(100);
		array = arrayFillingRandom(array, 100);
		arrayPrint(array);

		int maxCount = findMaxCount(array);
		int maxElement = findMaxElement(array);
		int minMaxCountEelment = findMinElementMaxCount(array, maxCount, maxElement);

		printInt("Минимальное из наиболее часто встречающихся чисел = ", minMaxCountEelment);
	}

	public static int findMaxElement(int[] args) {

		int max = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
			}
		}

		return max;

	}

	public static int findMinElementMaxCount(int[] args, int maxCount, int maxElement) {

		int minElement = maxElement;
		int count = 0;

		for (int j = 0; j < args.length; j++) {
			for (int i = 0; i < args.length; i++) {
				if (args[i] == args[j]) {
					count++;
				}
			}
			if (maxCount == count) {
				if (args[j] < minElement) {
					minElement = args[j];
				}
			}
			count = 0;
		}

		return minElement;
	}

	public static int findMaxCount(int[] args) {

		int maxCount = 0;
		int count = 0;

		for (int j = 0; j < args.length; j++) {
			for (int i = 0; i < args.length; i++) {
				if (args[i] == args[j]) {
					count++;
				}
			}
			if (count >= maxCount) {
				maxCount = count;
			}
			count = 0;
		}

		return maxCount;
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
