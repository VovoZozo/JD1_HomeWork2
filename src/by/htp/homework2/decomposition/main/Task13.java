package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task13 {

	/*
	 * 13. Дано натуральное число N. Написать метод(методы) для формирования
	 * массива, элементами которого являются цифры числа N.
	 */

	public static void main(String[] args) {

		System.out.println("Task13");

		int n = randomInt(899999);
		printInt("Дано число N = ", n);

		int arrayLength = findDegree(n);
		printInt("Длинна массива = ", arrayLength);

		int[] array = arrayСreation(arrayLength);
		array = arrayFilling(array, n);
		arrayPrint(array);

	}

	public static int[] arrayСreation(int i) {

		int[] array = new int[i];

		return array;
	}

	public static int[] arrayFilling(int[] args, int n) {

		for (int i = 0; i < args.length; i++) {
			args[i] = n / (int) Math.pow(10, args.length - i - 1) % 10;
		}

		return args;
	}

	public static void arrayPrint(int[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

	public static int findDegree(int a) {

		int degree = 0;

		for (int i = 1; i <= a; i = i * 10) {
			degree++;
		}

		return degree;
	}

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a) + 1000;

		return x;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}

}
