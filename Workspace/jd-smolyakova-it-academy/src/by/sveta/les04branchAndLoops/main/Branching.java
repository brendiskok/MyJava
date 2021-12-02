package by.sveta.les04branchAndLoops.main;
import java.lang.*;
import java.util.*;


public class Branching {

	public static void main(String[] args) {
		
		First();
		Second();
		//Third();
		Fourth();
		Fifth();
		Six();
		Seven();
		Eight();
		Nine();
		Ten();
		
		
		
	
		}
	
	public static void First() {
		// составить программу сравнения двух чисел 1 и 2.
		// если 1 < 2 - вывести на экран цифру 7, в противном случае - цифру 8
		
		System.out.print("1: ");
		
		int a = 1;
		int b = 2;
		
		if (a < b) {
			System.out.println("7");
		}
		
		else {
			System.out.println("8");
		}
		
		System.out.println();
		
			
	}
		
	public static void Second() {
		// составить программу сравнения двух чисел 1 и 2.
		// если 1 < 2 - вывести на экран "yes", в противном случае - "no"
		
		System.out.print("2: ");
		
		int a = 1;
		int b = 2;
		
		if (a < b) {
			System.out.println("yes");
		}
		
		else {
			System.out.println("no");
		}
		
		System.out.println();
		
	}
	
	
	public static void Third() {
		// составить программу сравнения введенного числа а и цифры 3. 
		// если а < 3 - вывести на экран "yes", в противном случае - "no"
		
		System.out.print("3: ");
		
		System.out.println("Введите число: ");
		Scanner scan = new Scanner (System.in);
		
		double a = scan.nextDouble();
		
		
		if (a < 3) {
			System.out.println("yes");
		}
		
		else {
			System.out.println("no");
		}
		
		System.out.println();
	}
	
	public static void Fourth() {
		// составить программу: равны ли два числа а и b? 
		
		System.out.print("4: ");
		
		int a = 1;
		int b = 2;
		
		if (a == b) {
			System.out.println("yes");
		}
		
		else {
			System.out.println("no");
		}
		
		System.out.println();
		
		
	}
	
	public static void Fifth() {
		// составить программу определения наименьшего из двух чисел а и b 
		
		
		System.out.print("5: ");
		
		int a = 3;
		int b = 4;
		
		if (a < b) {
			System.out.println("наименьшее число из " + a + " и " + b + " - это " + a);
		}
		
		else {
			System.out.println("наименьшее число из " + a + " и " + b + " - это " + b);
		}
			
		System.out.println();
		
		
	}
	
	public static void Six() {
		// составить программу определения наибольшего из двух чисел а и b 
		
		System.out.print("6: ");
		
		int a = 5;
		int b = 8;
		
		if (a > b) {
			System.out.println("наибольшее число из " + a + " и " + b + " - это " + a);
		}
		
		else {
			System.out.println("наибольшее число из " + a + " и " + b + " - это " + b);
		}
		
		System.out.println();
		
	}
	
		
	public static void Seven() {
		// составить программу нахождения модуля выражения a*x*x + b*x +c 
		// при заданных значениях a, b, c, x
		
		System.out.print("7: ");
		
		double a = (-5.5);
		double b = 3.0;
		double c = 2.6;
		double x = (-4.0);
		
		double result = a * x * x + b * x + c;
		System.out.println("Результат выражения " + a + " * " + x + " * " + x + " + " + b + " * " + x + " + " + c + " = " + result);
		
		if (result > 0) {
			result = result;
			System.out.println("модуль выражения = " + result);	
		}
		else {
			result = (- result);
			System.out.println("модуль выражения = " + result);
		}
		
		System.out.println();
		
		
	}
	
	
	public static void Eight() {
		// составить программу нахождения наименьшего из квадратов двух чисел a, b
		
		System.out.print("8: ");
		
		int a = 5;
		int aPow = (int) Math.pow (a, 2);
		int b = 4;
		int bPow = (int) Math.pow (b, 2);
	
	if (aPow < bPow) {
		System.out.println("наименьшее из квадратов чисел " + a + " и " + b + " - это квадрат " + a + " = " + aPow);
	}
	
	else {
		System.out.println("наименьшее из квадратов чисел " + a + " и " + b + " - это квадрат " + b + " = " + bPow);
	}
		
	System.out.println();
	}
	
	
	public static void Nine() {
		// составить программу, которая определит по 3м введенным сторонам,
		// является ли данный треугольник равносторонним
		
		
		
		System.out.print("9: ");
		
	}
	
	public static void Ten() {
		// составить программу, которая определит площадь какого круга меньше
		
		System.out.print("10: ");
		
	}
	
	}
		

	

