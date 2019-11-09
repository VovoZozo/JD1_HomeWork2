package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task06 {

	/*
	 * 6. Вычислить площадь правильного шестиугольника со стороной а, используя
	 * метод вычисления площади треугольника.
	 */

	public static void main(String[] args) {

		System.out.println("task06");

		int hexagonR = random(100);

		print("Длинна стороны правильного шестиугольника равна: ", hexagonR);

		double triangleArea = triangleArea(hexagonR);
		double hexagonArea = hexagonArea(triangleArea);

		printDouble("Площадь заданного правильного шестиугольника равна: ", hexagonArea);
	}

	public static double hexagonArea(double triangleArea) {

		double hexagonArea = triangleArea * 6;

		return hexagonArea;

	}

	public static double triangleArea(int a) {

		double triangleArea = (Math.pow(a, 2) * Math.sqrt(3)) / 4;

		return triangleArea;

	}

	public static int random(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a);

		return x;

	}

	public static void print(String s, int a) {

		System.out.println(s + a);

	}

	public static void printDouble(String s, double a) {

		System.out.println(s + a);

	}

}
