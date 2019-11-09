package by.htp.homework2.array1.main;

import java.util.Random;

public class Task15 {
	/*
	 * 15. Дана последовательность действительных чисел . Указать те ее элементы,
	 * 
	 * которые принадлежат отрезку [с, d].
	 */
	public static void main(String[] args) {
		
		System.out.println("task15");
		
		double c = randomDouble(10);
		printDouble("Дано число C = ", c);
		double d = randomDouble(100);
		printDouble("Дано число D = ", d);
		
		double[] array = arrayСreation(1000);
		array = arrayFillingRandom(array, 10);
		arrayPrint(array);
		
		checkCD(array,  c,  d);
		
	}
	
	public static void checkCD(double[] array, double c, double d) {

		for (int i = 0; i < array.length; i++) {
			if (array[i]<=d&&array[i]>=c) {
				printDouble(" входит в заданный диапазон ", array[i]);
			}
		}
		
	}

	public static void arrayPrint(double[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}

		System.out.println();
	}

	public static double[] arrayСreation(int i) {

		double[] array = new double[i];

		return array;

	}

	public static double[] arrayFillingRandom(double[] args, int a) {

		Random rand = new Random();

		for (int i = 0; i < args.length; i++) {
			args[i] = Math.pow(-rand.nextDouble() * a, rand.nextInt(4));
			if (args[i] == 1.0) {
				args[i] = 0.0;
			}
		}

		return args;
	}
	
	public static void printDouble(String s, double a) {

		System.out.println(s + a);

	}

	public static double randomDouble(int a) {

		Random rand = new Random();
		double x = Math.pow(-rand.nextDouble() * a, rand.nextInt(4));

		return x;
	}
}
