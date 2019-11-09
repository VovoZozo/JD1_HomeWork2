package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task08 {
	/*
	 * 8. Составить программу, которая в массиве A[N] находит второе по величине
	 * число (вывести на печать число, которое меньше максимального элемента
	 * массива, но больше всех других элементов).
	 */
	public static void main(String[] args) {
		
		System.out.println("task08");
		
		int[] array = arrayСreation(100);
		array = arrayFilling(array, 1000);
		arrayPrint(array);
		
		int SecondByValueWithoutSort = findSecondByValueWithoutSort(array);
		printInt("Второе по величине число в заданном массиве без сортировки: ", SecondByValueWithoutSort);
		
		int[] sortArray = arraySortBubble(array);
		arrayPrint(sortArray);
		
		int SecondByValue = findSecondByValue(sortArray);
		printInt("Второе по величине число в заданном массиве с использованием сортировки: ", SecondByValue);
		
	}

	public static int findSecondByValueWithoutSort(int[] args) {
		
		int max = 0;
		int SecondByValue = 0;
		int temp = 0;
		
		for (int i = 0; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
			}
		}
		
		for (int i = 0; i < args.length; i++) {
			if (args[i] < max && args[i] > temp) {
				temp = args[i];
				SecondByValue = args[i];
			}
		}
		
		return SecondByValue;
	}

	public static int findSecondByValue(int[] args) {
		
		int SecondByValue = args[args.length - 2];
		
		return SecondByValue;
		
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

	public static int[] arraySortBubble(int[] args) {
		
		int n = args.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (args[j] > args[j + 1]) {
					int temp = args[j];
					args[j] = args[j + 1];
					args[j + 1] = temp;
				}
			}
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
