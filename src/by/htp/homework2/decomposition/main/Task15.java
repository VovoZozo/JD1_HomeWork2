package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task15 {

	/*
	 * 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива
	 * А, элементами которого являются числа, сумма цифр которых равна К и которые
	 * не большее N.
	 */

	public static void main(String[] args) {

		System.out.println("Task15");

		int k = randomInt(50);
		printInt("Дано число K = ", k);

		int n = randomInt(100000);
		printInt("Дано число N = ", n);

		int arrayLength = arrayLength(k, n);
		int[] arrayOfnumbers = sumOfAllNumbers(k, n, arrayLength);
		arrayPrint(arrayOfnumbers);

	}

	public static int[] sumOfAllNumbers(int k, int n, int arrayLength) {

		int sum;
		int count = 0;
		int[] array = new int[arrayLength];

		for (int i = 0; i <= n; i++) {
			sum = sumOfNumber(i);
			if (sum == k) {
				array[count] = i;
				count++;
			}
		}

		return array;
	}

	public static int arrayLength(int k, int n) {

		int count = 0;
		int sum;

		for (int i = 0; i <= n; i++) {
			sum = sumOfNumber(i);
			if (sum == k) {
				count++;
			}
		}

		return count;
	}

	public static int sumOfNumber(int a) {

		int sum = 0;

		for (int i = 1; i <= a; i = i * 10) {
			sum += a / i % 10;
		}

		return sum;
	}

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a);

		return x;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}

	public static void arrayPrint(int[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

}
