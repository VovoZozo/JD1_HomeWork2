package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task18 {
	
	/*
	 * 18. Найти все натуральные n-значные числа, цифры в которых образуют строго
	 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
	 * использовать декомпозицию.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Task18");

		int n = randomInt(10);
		printInt("Дано число n = ", n);

		int arrayLength = arrayLength(n);

		int[] array = arrayFillingUp(n, arrayLength);

		arrayPrint(array);
	}

	public static int[] arrayFillingUp(int n, int arrayLength) {
		
		int count = 0;
		int[] array = new int[arrayLength];

		for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
			if (checkUp(i, n)) {
				array[count] = i;
				count++;
			}
		}
		
		return array;
	}

	public static int arrayLength(int n) {
		
		int count = 0;

		for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
			if (checkUp(i, n)) {
				count++;
			}
		}
		
		return count;
	}

	public static boolean checkUp(int k, int n) {
		
		int max = k % 10;
		int count = 1;

		for (int i = 10; i <= k; i = i * 10) {
			if (k / i % 10 < max) {
				max = k / i % 10;
				count++;
			}
		}

		return count == n;
	}

	public static void arrayPrint(int[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
	}

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a);
		
		return x;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
		
	}
	
}
