package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task11 {
	
	/*
	 * 11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] +
	 * D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для
	 * вычисления суммы трех последовательно расположенных элементов массива с
	 * номерами от k до m.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("task11");
		
		int[] array = arrayСreation(6);
		array = arrayFilling(array, 1000);
		arrayPrint(array);
		
		int sum0to2 = arraySumFromKtoM(array, 0, 2);
		printInt("Сумма элементов массива от 0 до 2 равна:", sum0to2);
		
		int sum2to4 = arraySumFromKtoM(array, 2, 4);
		printInt("Сумма элементов массива от 2 до 4 равна:", sum2to4);
		
		int sum3to5 = arraySumFromKtoM(array, 3, 5);
		printInt("Сумма элементов массива от 3 до 5 равна:", sum3to5);
		
	}

	public static int arraySumFromKtoM(int[] array, int k, int m) {
		
		int sum = 0;
		
		for (int i = k; i <= m; i++) {
			sum += array[i];
		}
		
		return sum;
	}

	public static int[] arrayСreation(int i) {
		
		int[] array = new int[i];
		
		return array;
	}

	public static int[] arrayFilling(int[] args, int a) {
		
		Random rand = new Random();
		
		for (int i = 0; i < args.length; i++) {
			args[i] = rand.nextInt(a);
		}
		
		return args;
	}

	public static void arrayPrint(int[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
		
	}

	public static void printInt(String s, int a) {
		
		System.out.println(s + a);
		
	}
	
}
