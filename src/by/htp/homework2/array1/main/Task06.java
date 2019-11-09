package by.htp.homework2.array1.main;

import java.util.Random;

public class Task06 {
	/*
	 * 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
	 * числовой оси, содержащую все эти числа.
	 */
	public static void main(String[] args) {

		System.out.println("task06");

		int[] array = arrayСreation(10);
		array = arrayFillingRandom(array, 10);
		arrayPrint(array);

		int arrayMax = arrayFindMax(array);
		int arrayMin = arrayFindMin(array);
		int numericAxisLenght = numericAxisLength(arrayMin, arrayMax);

		printInt("Наименьшая длинна числовой оси  =  ", numericAxisLenght);

	}

	public static int numericAxisLength(int min, int max) {

		int numericAxisLength;

		if (min < 0 && max < 0) {
			numericAxisLength = Math.abs(min + max);
		} else {
			numericAxisLength = max - min;
		}

		return numericAxisLength;
	}

	public static int arrayFindMax(int[] args) {

		int max = args[0];

		for (int i = 1; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
			}
		}

		return max;
	}

	public static int arrayFindMin(int[] args) {

		int min = args[0];

		for (int i = 1; i < args.length; i++) {
			if (args[i] < min) {
				min = args[i];
			}
		}

		return min;
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

}
