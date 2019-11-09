package by.htp.homework2.array1.main;

import java.util.Random;

public class Task13 {
	/*
	 * 13. Определить количество элементов последовательности натуральных чисел,
	 * кратных числу М и заключенных в промежутке от L до N.
	 */
	public static void main(String[] args) {

		System.out.println("task13");

		int m = randomInt(10);
		printInt("Дано число M = ", m);
		int n = randomInt(1000);
		printInt("Дано число N = ", n);
		int l = randomInt(n);
		printInt("Дано число L = ", l);

		int[] array = arrayСreation(10);
		array = arrayFillingRandom(array, l, n);
		arrayPrint(array);

		int countDelimite = countDelimite(array, m);
		printInt("количество элементов последовательности кратных числу М = ", countDelimite);

	}

	public static int countDelimite(int[] args, int m) {

		int count = 0;

		for (int i = 0; i < args.length; i++) {
			if (args[i] % m == 0) {
				count++;
			}
		}

		return count;
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

	public static int[] arrayFillingRandom(int[] args, int l, int n) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = rand.nextInt(n);
			do {
				args[i] = rand.nextInt(n);
			} while (args[i] >= n || args[i] <= l);

		}
		return args;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a) + 1;

		return x;
	}
}
