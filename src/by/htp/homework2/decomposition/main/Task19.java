package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task19 {
	
	/*
	 * 19. Написать программу, определяющую сумму n - значных чисел, содержащих
	 * только нечетные цифры. Определить также, сколько четных цифр в найденной
	 * сумме. Для решения задачи использовать декомпозицию.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Task19");

		int n = randomInt(10);
		print("Дано число n = ", n);

		long sumOddnumbers = sumOfOddNumber(n);
		print("Сумма n - значных чисел, содержащих только нечетные цифры = ", sumOddnumbers);

		long countEvenNumber = countEvenNumber(sumOddnumbers);
		print("Количество четных цифр в найденной сумме = ", countEvenNumber);
		
	}

	public static int countEvenNumber(long sumOddnumbers) {
		
		int count = 0;
		long number = 0;
		
		for (long i = 1; i <= sumOddnumbers; i = i * 10) {
			number = (sumOddnumbers / i) % 10;
			if (checkEven( number )) {
				count++;
			}
		}
		
		return count;
	}

	public static long sumOfOddNumber(int n) {
		
		long sum = 0;

		for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
			if (checkOdd(i, n)) {
				sum = sum + i;
			}
		}
		
		return sum;
	}
	
	
	public static boolean checkEven(long k) {
		
		return k % 2 == 0;
		
	}
	

	public static boolean checkOdd(int k, int n) {
		
		int count = 0;

		for (int i = 1; i <= k; i = i * 10) {
			if ((k / i % 10) % 2 != 0) {
				count++;
			}
		}

		return count == n;
	}

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a);
		
		return x;
	}

	public static void print(String s, long a) {

		System.out.println(s + a);
	}
}
