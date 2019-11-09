package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task12 {
	/*
	 * 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать
	 * метод(методы) вычисления его площади, если угол между сторонами длиной X и Y—
	 * прямой.
	 */
	public static void main(String[] args) {
		
		System.out.println("task11");

		double a = randomDouble(100);
		printDouble("Сторона a: ", a);
		
		double b = randomDouble(100);
		printDouble("Сторона b: ", b);

		double rightTriangleC = rightTriangleC(a, b);
		
		double c = 0;
		double d = 0;

		do {
			c = randomDouble(100);
			d = randomDouble(100);
		} while (!((c + d) > rightTriangleC && (rightTriangleC + d) > c && (rightTriangleC + c) > d ));
		
		printDouble("Сторона c: ", c);
		printDouble("Сторона d: ", d);

		double areaRightTriangleC = areaRightTriangleC(a, b);
		double areaTriangle = areaTriangle(c, d, rightTriangleC);
		double areaQuadrangle = areaQuadrangle(areaRightTriangleC, areaTriangle);
		
		printDouble("Площадь прямоугольника образованного этими сторонами равна: ", areaQuadrangle);
		
	}

	public static double areaQuadrangle(double areaTriangle, double areaRightTriangle) {
		
		double area = areaTriangle + areaRightTriangle;
		
		return area;
	}

	public static double areaTriangle(double a, double b, double c) {
		
		double p = (a + b + c) / 2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		return area;
	}

	public static double areaRightTriangleC(double a, double b) {
		
		double area = a * b / 2;
		
		return area;
	}

	public static double rightTriangleC(double a, double b) {
		
		double c = Math.sqrt(a * a + b * b);
		
		return c;
	}

	public static double randomDouble(int a) {
		
		Random rand = new Random();
		double x = rand.nextDouble() * a;
		
		return x;
	}

	public static void printDouble(String s, double a) {
		
		System.out.println(s + a);
		
	}
	
}
