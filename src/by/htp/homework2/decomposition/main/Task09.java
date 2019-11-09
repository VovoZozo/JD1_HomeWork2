package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task09 {
	
	/*
	 * 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно
	 * простыми.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("task09*");
		
		int a = randomInt(1000);
		printInt("Дано число а = ", a);
		
		int b = randomInt(1000);
		printInt("Дано число b = ", b);
		
		int c = randomInt(1000);
		printInt("Дано число c = ", c);
		
		int nodAB = findNOD(a, b);
		int nodBC = findNOD(b, c);
		int nodAC = findNOD(a, c);
		
		mutuallyPrimeNumbers(nodAB, nodBC, nodAC);
		
	}

	static void mutuallyPrimeNumbers(int nodAB, int nodBC, int nodAC) {
		
		if (nodAB == 1 && nodBC == 1 && nodAC == 1) {
			System.out.println("Числа a, b, c -- взаимнопростые");
		} else {
			System.out.println("Числа a, b, c -- не являются взаимнопростыми");
		}
		
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
	    		return findNOD (a >> 1, b >> 1) << 1;
	    	} else {
	    		return findNOD (a >> 1, b);
	    	}
	    } else if ((b & 1) == 0) {
	    	return findNOD (a, b >> 1);
	    } else {
	    	return findNOD (b, a > b ? a - b : b - a);
	    }

	}

	public static int randomInt(int a) {
		
		Random rand = new Random();
		int x = rand.nextInt(a);
		
		return x;
		
	}

	public static void printInt(String s, int a) {
		
		System.out.println(s + a);
		
	}
	
}
