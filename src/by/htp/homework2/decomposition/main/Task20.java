package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task20 {
	
	/*
	 * 20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму
	 * его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
	 * Для решения задачи использовать декомпозицию.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Task20");

		int n = randomInt(1000000000);
		print("Дано число n = ", n);

		int sumOfNumber = sumOfNumber(n);
		int countToZero = countToZero(n, sumOfNumber);
		
		print("Сколько таких действий (из заданного числа вычли сумму его цифр, "
				+ "из результата вновь вычли сумму его цифр и т.д.) " + "надо произвести, чтобы получился нуль? ---- ",
				countToZero);
		
	}

	public static int countToZero(int n, int sumOfNumber) {
		
		int count;
		count = (n - sumOfNumber) / 9 + 1;
		
		return count;
	}

	public static int sumOfNumber(int n) {
		
		int sum = 0;

		for (int i = 1; i <= n; i = i * 10) {
			sum = sum + n / i % 10;
		}
		
		return sum;
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
