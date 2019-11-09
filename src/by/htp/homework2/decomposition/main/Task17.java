package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task17 {
	
	/*
	 * 17. Натуральное число, в записи которого n цифр, называется числом
	 * Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
	 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать
	 * декомпозицию.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Task17");

		int k = randomInt(10000);
		printInt("Дано число k = ", k);

		int arrayLength = arrayLength(k);

		int[] arrayArmstrong = arrayFillingArmstrong(k, arrayLength);

		arrayPrint(arrayArmstrong);

	}

	public static int[] arrayFillingArmstrong(int k, int arrayLength) {
		
		int armstrongNumber;
		int count = 0;
		int[] array = new int[arrayLength];

		for (int i = 1; i <= k; i++) {
			armstrongNumber = armstrongNumber(i);
			if (armstrongNumber == i) {
				array[count] = i;
				count++;
			}
		}
		
		return array;
	}

	public static int armstrongNumber(int k) {
		
		int sum = 0;
		int n = findDegree(k);

		for (int i = 1; i <= k; i = i * 10) {
			sum += k / i % 10;
		}
		
		return (int) Math.pow(sum, n);
	}

	public static int findDegree(int k) {
		
		int degree = 0;

		for (int i = 1; i <= k; i = i * 10) {
			degree++;
		}
		
		return degree;
	}

	public static int arrayLength(int k) {
		
		int count = 0;
		int sum;

		for (int i = 0; i <= k; i++) {
			sum = armstrongNumber(i);
			if (sum == i) {
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

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a);
		
		return x;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
		
	}
}
