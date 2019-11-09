package by.htp.homework2.array1.main;

import java.util.Random;

public class Task18 {
	/*
	 * 18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в
	 * рад ячеек, в которые надо вставить игральные кубики. Но дверь открывается
	 * только в том случае, когда в любых трех соседних ячейках сумма точек на
	 * передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1
	 * до 6 точек). Напишите программу, которая разгадывает код замка при условии,
	 * что два кубика уже вставлены в ячейки.
	 */
	public static void main(String[] args) {

		System.out.println("task18");

		int[] superCastle = arrayСreation(10);
		superCastle = arrayFillingRandomTwo(superCastle, 5);
		arrayPrint(superCastle);

		int[] controlElements = findControlElement(superCastle);

		int keyElement = findKeyElement(superCastle, controlElements);

		superCastle = arrayKeyFillingLeft(superCastle, controlElements[0]);
		superCastle = arrayKeyFillingLeft(superCastle, controlElements[1]);
		superCastle = arrayKeyFillingRight(superCastle, controlElements[0]);
		superCastle = arrayKeyFillingRight(superCastle, controlElements[1]);
		superCastle = arrayKeyFillingKey(superCastle, keyElement);
		arrayPrint(superCastle);
		
	}

	public static int[] arrayKeyFillingKey(int[] args, int keyElement) {

		for (int i = 0; i < args.length; i++) {
			if (args[i] == 0) {
				args[i] = keyElement;
			}
		}

		return args;
	}

	public static int findKeyElement(int[] args, int[] control) {

		int keyElement = 0;

		keyElement = 10 - (args[control[0]] + args[control[1]]);

		return keyElement;
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

	public static int[] findControlElement(int[] args) {

		int count = 0;
		int[] findControlElement = new int[2];

		for (int i = 0; i < args.length; i++) {
			if (args[i] != 0) {
				findControlElement[count] = i;
				count++;
			}
		}

		return findControlElement;
	}

	public static int[] arrayKeyFillingRight(int[] args, int elementPosition) {

		for (int i = elementPosition; i < args.length; i = i + 3) {
			args[i] = args[elementPosition];
		}

		return args;
	}

	public static int[] arrayKeyFillingLeft(int[] args, int elementPosition) {

		for (int i = elementPosition; i >= 0; i = i - 3) {
			args[i] = args[elementPosition];
		}

		return args;
	}

	public static int[] arrayFillingRandomTwo(int[] args, int a) {

		Random rand = new Random();

		int cellRandom1;
		int cellRandom2;

		do {
			cellRandom1 = rand.nextInt(9);
			cellRandom2 = rand.nextInt(9 - cellRandom1) + cellRandom1 + 1;
		} while ((cellRandom2 - cellRandom1) == 3 || (cellRandom2 - cellRandom1) == 6);

		do {
			args[cellRandom1] = rand.nextInt(a) + 1;
			args[cellRandom2] = rand.nextInt(a) + 1;
		} while ((args[cellRandom1] + args[cellRandom2]) >= 10);

		return args;
	}
}
