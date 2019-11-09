package by.htp.homework2.decomposition.main;

public class Task10 {
	
	/*
	 * 10. Написать метод(методы) для вычисления суммы факториалов всех нечетных
	 * чисел от 1 до 9.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("task10*");
		
		int factorialSum = factorialSum(9);
		print("суммы факториалов всех нечетных чисел от 1 до 9 = ", factorialSum);
		
	}

	public static int factorialSum(int a) {
		
		int factorialSum = 0;
		
		for (int i = 1; i <= a; i++) {
			factorialSum += factorial(i);
			++i;
		}
		
		return factorialSum;
	}

	public static int factorial(int a) {
		
		int factorial = 1;
		
		for (int i = 1; i <= a; i++) {
			factorial = factorial * i;
		}
		
		return factorial;
	}

	public static void print(String s, int a) {
		
		System.out.println(s + a);
		
	}
	
}
