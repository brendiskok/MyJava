package by.klimash.part01.main;

import java.math.BigInteger;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		First();
		Second();
		Third();
		Fourth();
		Fifth();
		Six();
		Seven();
		Eight();

	}
	
	public static void First() {
		
		// Написать программу, где пользователь вводит любое целое положительное число,
		// а программа суммирует все числа от 1 до введенного пользователем числа
		
				
		System.out.println("1: Введите целое положительное число");
		
		Scanner ForNumber = new Scanner(System.in);
		
		long number = ForNumber.nextLong();
		
		long sum = 0;
		
		for (int n = 1; n <= number; n++) {
			
			sum = sum + n;
			
		}
		
				
		System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
		System.out.println();
	}
	
	
	public static void Second() {
		
		// вычислить значения функции на отрезке [a, b] с шагом h:
		// y = x, x > 2
		// y = (-x), x <= 2
		
				
		double a = (-5);
		double b = 10;
		
		double h = 0.5;
		
		double y;
		
		System.out.println("2: вычислить значения функции на отрезке [" + a + ", " + b + "] с шагом " + h + ": ");
		System.out.println("y = x, если x > 2");
		System.out.println("y = (-x), если x <= 2");
		
		
		while (a <= b) {
			if (a <= 2) {
				y = (-a);
				System.out.print(y + " ");
			}
			else {
				y = a;
				System.out.print(y + " ");
			}
			a = a + h;
		}
				
		System.out.println();
		
	}
	
	public static void Third() {
		
		// найти сумму квадратов первых ста чисел
		
		
		System.out.println("3: найти сумму квадратов первых ста чисел ");
		
		long sum = 0;
		
		for (int i = 1; i < 101; i++) {
			sum = sum + (long)Math.pow(i, 2);
		}
		
		System.out.println("Ответ: " + sum);
		
		System.out.println();
			
	}
	
	public static void Fourth() {
		
		// Составить программу нахождения произведения квадратов первых двухсот чисел
		
		System.out.println("4: cоставить программу нахождения произведения квадратов первых двухсот чисел");
		
		BigInteger result = BigInteger.valueOf(1);
						
		for (int i = 1; i < 201; i++) {
			
			BigInteger number = BigInteger.valueOf(i*i);
			
			result = result.multiply(number);
		}
		
		System.out.println("Ответ: " + result);
		
		System.out.println();		
	}
	

	public static void Fifth() {
		
		//Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
		// модуль которых >= заданному e. Общий член ряда имеет вид:
		// An = 1/ (2^n) + 1/ (3^n)
		
		
		System.out.println("5: даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых");
		System.out.println("больше или равно заданному e. Общий член ряда имеет вид:");
		System.out.println("An = 1/ (2^n) + 1/ (3^n)");
		
		double e = 0.1;
		
		System.out.println("e = " + e);
		
		double result = 0;
		double a;
		int n = 1;
		
		do {
			
			a = Math.abs( 1 / Math.pow(2, n) + 1 / Math.pow(3, n));
			n++;
			
			if (a >= e) {
			result = result + a;
			}	
		}
		
		while (a >= e);
		
		System.out.println("Ответ: " + result);
		
		System.out.println();
			
	}
	
	public static void Six() {
		
		// Вывести на экран соответствие между символами и их обозначениями
		// в памяти компьютера. 
		
		System.out.println("6: вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера ");
		
		for (int n = 32; n < 128; n++) {
			
			int number = n;
			char symbol = (char) number;
			
			System.out.println(symbol + " - " + number);
		}
				
		System.out.println();		
	}
	
	
	public static void Seven() {
		
		// Для каждого натурального числа в промежутке от m до n вывести все делители,
		// кроме единицы и самого числа. m и n вводятся с клавиатуры
		
		System.out.println("7:  Для каждого натурального числа в промежутке от m до n вывести все делители,");
		System.out.println("кроме единицы и самого числа. m и n вводятся с клавиатуры.");
		
		
		System.out.println("Введите начальное число диапазона (натуральное число)");
		
		
		Scanner number = new Scanner (System.in);
						
		int m = number.nextInt();
		
			
		System.out.println("Введите конечное число диапазона (натуральное число)");
		
		int n = number.nextInt();
		
		
		int divider;
		
		for (; m <= n; m++) {
			
			divider = 2;
			
			System.out.println("число " + m);
			
			
			while (divider < m) {
				
			if ( (m % divider) == 0)  {
				System.out.println(divider + " - делитель числа " + m);
			}
			
			divider++;
			
			}
		}
		
		number.close();
				
		System.out.println();		
	}
	

	public static void Eight() {
		
		//Даны 2 числа. Определить цифры, входящие в запись как первого, так и второго чисел
		
		System.out.println("8: Даны 2 числа. Определить цифры, входящие в запись как первого, так и второго чисел.");
		
		int a = 2845907;
		int b = 517296;
		
		System.out.println("число 1: " + a + " число 2: " + b);
		
		boolean noMatch = true;
		
		int aNext;
		int bNext;
		
		while (a > 0) {
			
			aNext = a % 10;
					
			b = 517296;
		
			while (b > 0) {
				
				bNext = b % 10;
				
				if (aNext == bNext) {
					System.out.println(aNext + "   " );
					noMatch = false;
				}
				
				b = b / 10;
			}
			
			a = a / 10;
		}
		
		if (noMatch) {
			System.out.println("Совпадений нет");
		}
						
	}
		
}
