package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task16 {
	
	/*
	 * 16. Два простых числа называются «близнецами», если они отличаются друг от
	 * друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из
	 * отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
	 * задачи использовать декомпозицию.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Task16");
		
		int n = randomInt(50);
		printInt("Дано число n = ", n);
		
		int[][] array = arrayСreation(n);
		array = arrayFilling(array, n);
		arrayPrint(array);
		
	}

	public static int[][] arrayFilling(int[][] args, int n) {
		
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[i].length; j++) {
				args[i][j] = n + i + j * 2;
			}
		}
		
		return args;
	}

	public static int[][] arrayСreation(int n) {
		
		int[][] array = new int[n - 1][2];
		
		return array;
	}

	public static void arrayPrint(int[][] args) {
		
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[i].length; j++) {
				System.out.print(args[i][j] + "\t");
			}
			System.out.println();
		}
		
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
