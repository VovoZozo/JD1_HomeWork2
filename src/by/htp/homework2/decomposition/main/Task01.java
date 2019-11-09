package by.htp.homework2.decomposition.main;

import java.util.Random;

public class Task01 {
	
	/*
	1. Треугольник задан координатами своих вершин. Написать метод для вычисления его
	площади.
	*/
	
	public static void main(String[] args) {
		
		System.out.println("task01");
		
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double lengA;
		double lengB;
		double lengC;
		double perimetr;
		double area;
		
		do {
			 x1 = random();
			 y1 = random();
			 x2 = random();
			 y2 = random();
			 x3 = random();
			 y3 = random();
			 lengA = findLeng( x1,  y1,  x2,  y2);
			 lengB = findLeng( x2,  y2, x3,  y3);
			 lengC = findLeng( x1,  y1,  x3,  y3);
		} while (!checkExistence( lengA,  lengB,  lengC));
		
		print("x1: ",x1);
		print("y1: ",y1);
		print("x2: ",x2);
		print("y2: ",y2);
		print("x3: ",x3);
		print("y3: ",y3);
		print("lengA: ", lengA);
		print("lengB: ", lengB);
		print("lengC: ", lengC);
		
		perimetr =  perimetr( lengA,  lengB,  lengC);
		area =  area( lengA,  lengB,  lengC,  perimetr);
		print("Площадь треугольника: ", area);
		
	}
	
	
	public static double findLeng(double x1, double y1, double x2, double y2) {
		
		double leng = Math.abs( Math.sqrt( Math.pow( (x2 - x1), 2)+Math.pow( (y2 - y1), 2) ) );
		return leng;
		
	}
	
	
	public static boolean checkExistence(double a, double b, double c) {
		
		boolean checkExistence = ( ( a + b ) > c ) && ( ( a + c ) > b ) && ( ( b + c ) > a );
		
		return checkExistence;
	
	}
	
	
	public static double perimetr(double a, double b, double c) {
		
		double perimetr = a + b + c;
		
		return perimetr;
	
	}
	
	
	public static double area(double a, double b, double c, double perimetr) { 
		
		double p = perimetr / 2;
		double area = Math.sqrt( p * ( ( p - a ) * ( p - b ) * ( p - c ) ) );
		
		return area;
	}
	
	
	public static double random() {
		
		Random rand = new Random();
		double x = rand.nextDouble() * 100;
		
		return x;
	}
	
	
	public static void print(String s, double a) {
		
		System.out.println(s + a);
	
	}
}
