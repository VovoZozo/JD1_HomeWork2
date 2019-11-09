package by.htp.homework2.array1.main;

import java.util.Random;

public class Task07 {
	/*
	7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
	большие данного Z, этим числом. Подсчитать количество замен.
	*/
	public static void main(String[] args) {
		
		
		System.out.println("task07");

		int[] array = arrayСreation(10);
		array = arrayFillingRandom(array, 100);
		arrayPrint(array);
		
		int z = randomInt(100);
		printInt("Дано число Z = ", z);
		
		
		int numberOfLargeItems = numberOfLargeItems(array, z);
		printInt("Количество элементов последовательности больше заданого Z = ", numberOfLargeItems);
		
		array = arrauChangeToZ(array,  z);
		arrayPrint(array);
		
	}

	public static int[] arrauChangeToZ(int[] args, int z) {

		for (int i = 1; i < args.length; i++) {
			if (args[i] > z) {
				args[i] = z;
			}
		}

		return args;
	}

	public static int numberOfLargeItems(int[] args, int z) {

		int count = 0;

		for (int i = 1; i < args.length; i++) {
			if (args[i] > z) {
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

	public static int[] arrayСreation(int i) {

		int[] array = new int[i];

		return array;

	}
	
	public static int[] arrayFillingRandom(int[] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = (int) Math.pow(-rand.nextInt(a), rand.nextInt(4));
		}

		return args;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
	
	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a);

		return x;
	}

}
