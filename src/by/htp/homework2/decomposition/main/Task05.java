package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task05 {
	
	/*
	 5. Написать метод(методы) для нахождения суммы большего и меньшего из трех
	 чисел.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("task05");
		
		int a = random(100);
		int b = random(100);
		int c = random(100);
		
		int sum = sum(findmin(a, b, c), findmax(a, b, c));
		
		print("Число а -- ", a);
		print("Число b -- ", b);
		print("Число c -- ", c);
		print("Cумма большего и меньшего -- ", sum);
		
	}

	public static int findmin(int a, int b, int c) {
		
		int min = 0;
		
		if (a < b) {
			if (a < c) {
				min = a;
			} else {
				min = c;
			}
		} else if (b < c) {
			min = b;
		} else {
			min = c;
		}
		
		return min;
	}

	public static int findmax(int a, int b, int c) {
		
		int max = 0;
		
		if (a > b) {
			if (a > c) {
				max = a;
			} else {
				max = c;
			}
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}
		
		return max;
	}

	public static int sum(int min, int max) {
		
		return max + min;
		
	}

	public static int random(int a) {
		
		Random rand = new Random();
		int x = rand.nextInt(a);
		
		return x;
	}

	public static void print(String s, int a) {
		
		System.out.println(s + a);
		
	}
	
}
