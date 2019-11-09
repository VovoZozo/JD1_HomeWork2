package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task07 {

	/*
	 * 7. На плоскости заданы своими координатами n точек. Написать метод(методы),
	 * определяющие, между какими из пар точек самое большое расстояние. Указание.
	 * Координаты точек занести в массив.
	 */

	public static void main(String[] args) {

		System.out.println("task07");

		double[][] arrayXY = arrayСreation(1000);

		arrayXY = arrayFilling(arrayXY, 100);
		arrayPrint(arrayXY);

		double[] dis = maxDistanceBetweenPoints(arrayXY);
		printPoints(dis);

	}

	public static double[] maxDistanceBetweenPoints(double[][] args) {

		double[] maxDistanceBetweenPoints = new double[7];
		double distanceBetweenPoints = 1;

		for (int j = 0; j < args[0].length; j++) {
			for (int k = j + 1; k < args[0].length; k++) {
				distanceBetweenPoints = distanceBetweenPoints(args[0][j], args[0][k], args[1][j], args[1][k]);
				if (distanceBetweenPoints > maxDistanceBetweenPoints[0]) {
					maxDistanceBetweenPoints[0] = distanceBetweenPoints;
					maxDistanceBetweenPoints[1] = args[0][j];
					maxDistanceBetweenPoints[2] = args[0][k];
					maxDistanceBetweenPoints[3] = args[1][j];
					maxDistanceBetweenPoints[4] = args[1][k];
					maxDistanceBetweenPoints[5] = j + 1;
					maxDistanceBetweenPoints[6] = k + 1;
				}
			}
		}
		return maxDistanceBetweenPoints;
	}

	public static void printPoints(double[] args) {
		
		System.out.println("\nСамое большое расстояние равное " + args[0] + " между точками: ");
		System.out.println("Номер " + (int) args[5] + ":");
		System.out.println("X: " + args[1]);
		System.out.println("Y: " + args[3]);
		System.out.println("Номер " + (int) args[6] + ":");
		System.out.println("X: " + args[2]);
		System.out.println("Y: " + args[4]);
		
	}

	public static double distanceBetweenPoints(double x1, double x2, double y1, double y2) {
		
		double distanceBetweenPoints = Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
		
		return distanceBetweenPoints;
	}

	public static double[][] arrayСreation(int j) {
		
		double[][] array = new double[2][j];
		
		return array;
	}

	public static double[][] arrayFilling(double[][] args, int a) {
		
		Random rand = new Random();
		
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[i].length; j++) {
				args[i][j] = rand.nextDouble() * a;
			}
		}
		
		return args;
	}

	public static void arrayPrint(double[][] args) {
		
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[i].length; j++) {
				System.out.print(args[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
