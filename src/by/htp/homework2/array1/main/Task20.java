package by.htp.homework2.array1.main;

import java.util.Random;

public class Task20 {
	/*
	 * 20. Дан целочисленный массив с количеством элементов п. Сжать массив,
	 * выбросив из него каждый второй элемент (освободившиеся элементы заполнить
	 * нулями). Примечание. Дополнительный массив не использовать.
	 */
	public static void main(String[] args) {

		System.out.println("task20");

		int[] array = arrayСreation(100);
		array = arrayFillingRandom(array, 100);
		arrayPrint(array);

		array = arraySqueeze(array);
		arrayPrint(array);
	}

	public static int[] arraySqueeze(int[] args) {

		for (int i = 1; i < args.length; i = i + 2) {
			args[i] = 0;
		}

		return args;
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
			args[i] = rand.nextInt(a);
		}

		return args;
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}
}
