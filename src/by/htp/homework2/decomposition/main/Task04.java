package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task04 {

	/*
	 * 4. Написать метод(методы) для нахождения наименьшего общего кратного трех
	 * натуральных чисел.
	 */

	public static void main(String[] args) {

		System.out.println("task04");

		int a = randomInt(100);
		printInt("Дано число а = ", a);

		int b = randomInt(100);
		printInt("Дано число b = ", b);

		int c = randomInt(100);
		printInt("Дано число c = ", c);

		int nokABC = findNOK(findNOK(a, b, findNOD(a, b)), c, findNOD(findNOD(a, b), c));
		printInt("NOK a, b, c = ", nokABC);
	}

	static int findNOK(int a, int b, int nod) {

		int findNOK = a / nod * b;
		return findNOK;

	}

	static int findNOD(int a, int b) {

		if (a == 0) {
			return b;
		}

		if (b == 0) {
			return a;
		}

		if (a == b) {
			return a;
		}

		if (a == 1 || b == 1) {
			return 1;
		}

		if ((a & 1) == 0) {
			if ((b & 1) == 0) {
				return findNOD(a >> 1, b >> 1) << 1;
			} else {
				return findNOD(a >> 1, b);
			}
		} else if ((b & 1) == 0) {
			return findNOD(a, b >> 1);
		} else {
			return findNOD(b, a > b ? a - b : b - a);
		}

	}

	public static int randomInt(int a) {

		Random rand = new Random();
		int x = rand.nextInt(a) + 1000;

		return x;

	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);

	}

}
