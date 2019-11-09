package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task14 {
	
	/*
	 * 14. Написать метод(методы), определяющий, в каком из данных двух чисел больше
	 * цифр.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Task14");
		
		int a = randomInt(1000000);
		printInt("Дано число a = ", a);
		
		int b = randomInt(10000000);
		printInt("Дано число b = ", b);
		
		int degreeA = findDegree(a);
		int degreeB = findDegree(b);
		
		maxCountOfNumber(degreeA, degreeB);
		
	}

	public static void maxCountOfNumber(int degreeA, int degreeB) {
		
		if (degreeA == degreeB) {
			printInt("Количество цифр в числе a и b одинаково и равно: ", degreeA);
		} else if (degreeA > degreeB) {
			printInt("Количество цифр в числе a больше чем в числе b и равно: ", degreeA);
		} else {
			printInt("Количество цифр в числе b больше чем в числе a и равно: ", degreeB);
		}
		
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
