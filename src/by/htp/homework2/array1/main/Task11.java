package by.htp.homework2.array1.main;

import java.util.Random;

public class Task11 {
	/*
	 * 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых
	 * остаток от деления на М равен L (0 < L < М-1).
	 */
	public static void main(String[] args) {

		System.out.println("task11");

		int m = randomInt(1000);
		printInt("Дано число M = ", m);
		int l = randomInt(m);
		printInt("Дано число L = ", l);

		int[] array = arrayСreation(1000);
		array = arrayFillingRandom(array, 1000);
		arrayPrint(array);

		remainderOfDivision(array, m, l);

	}

	public static void remainderOfDivision(int[] args, int m, int l) {

		for (int i = 0; i < args.length; i++) {
			if (args[i] % m == l) {
				System.out.println(args[i] + " ");
			}
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

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a) + 1;

		return x;
	}
}
