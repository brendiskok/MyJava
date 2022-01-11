package by.sveta.les04branchAndLoops.main;

import java.math.*;
import java.util.*;

public class Loops2 {

	public static void main(String[] args) {
		
		/*Eleven();
		Twelve(); 
		Thirteen();
		Fourteen();
		Fifteen();
		Sixteen();
		Seventeen();
		Eightteen();
		Nineteen();
		Twenty();
		TwentyOne();
		TwentyTwo();
		TwentyFour();
		TwentyFive();
		TwentySix();*/
		TwentySeven();
		
		
		
		
		

	}
	
	public static void Eleven() {
		
		//Составить программу нахождения разности кубов первых двухста чисел
			   
		int previousNumber = 0;
		
		for (int i = 1; i < 201; i++) {
		   
		int result = i * i * i - previousNumber;
		
		System.out.println(i + ": " + result);
		
		previousNumber = i * i * i;
		
	   }
		
		System.out.println();
	}
	
	public static void Twelve() {
		// Последовательность An строится так: А1 = 1; 
		// Аn = 6 + A(n-1), для каждого n > 1
		// Составьте программу нахождения произведения первых 10 членов этой последовательности
		
		long a = 1;
		long result = 1; 
		
		for ( int i = 2; i < 11; i++) {
			
			a = 6 + a;
			
			result = result * a; 
		}
		
		System.out.println(result);
		System.out.println();
	}
	
	public static void Thirteen() {
		
		//Составить таблицу значений функции y = 5 - x^2 / 2 на отрезке [-5; 5] с шагом 0.5
		
		double x = (-5.0);
		
		while ( x <= 5) {
			
			double y = 5 - (x * x / 2);
			System.out.println("x = " + x + "; y = " + y);
			
			x = x + 0.5;
			
		}
		
		System.out.println();
		
	}
	
	public static void Fourteen() {
		
		// Дано натуральное число n, вычислить 1 + 1/2 + 1/3 + ... + 1/n
		
		double n = 50;
		
		double result = 1;
		
		for (double i = 2; i <= (n); i++) {
			
			result = result + 1 / i;
			
		}
		
		System.out.println(result);
		System.out.println();
	}
	
	public static void Fifteen() {
		
		// Вычислить: 1 + 2 + 4 + 8 + ... + 2^10
		
		int result = 1;
		
		for (int i = 1; i < 11; i++) {
			
			result = result + (int) Math.pow(2, i);
		}
		
		System.out.println(result);
		System.out.println();
	}
	
	public static void Sixteen() {
		
		// Вычислить (1+2) * (1+2+3) * ... * (1+2+...+10)
		
	    
	     BigInteger b = new BigInteger("1");
	     long a = 1;
		
		 	     
	     for (int i = 2; i < 11; i++) {
	    	 
	    	 a = a + i;
	    	 
	    	b = b.multiply(BigInteger.valueOf(a));
	   	 
	     }
	     
	     System.out.println(b);
	     System.out.println();
	}
	
	public static void Seventeen() {
		
		// Даны действительное a и натуральное n. Вычислить:
		// a (a + 1)...(a + n-1)
		
		double a = 0.5;
		long n = 50;
		
		BigDecimal b = new BigDecimal ("1");
		
		for (int i = 1; i < n; i++) {
			
			b = b.multiply(BigDecimal.valueOf(a));
			
			a = a + i;
			
					
		}
		
		System.out.println(b);
		System.out.println();
		
	}
	
	public static void Eightteen() {
	//Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
	// модуль которых >= заданному e. Общий член ряда имеет вид:
	// An = (-1)^(n-1) / n
		
		double e = 0.1;
		double sum = 0;
		double a;
		
		for (double n = 1; n < 11; n++) {
			
			a = Math.abs((Math.pow((-1), (n-1))) / n);
			
			
			if (a >= e) {
				
				sum = sum + a;
			}
		
		}
		
		System.out.println(" sum: " + sum);
		System.out.println();
	}
	
	public static void Nineteen() {
		
		//Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
		// модуль которых >= заданному e. Общий член ряда имеет вид:
		// An = 1/ (2^n) + 1/ (3^n)
		
		double e = 0.1;
		double sum = 0;
		double a;
		
		for (double n = 1; n < 11; n++) {
			
			a = Math.abs( 1 / Math.pow(2, n) + 1 / Math.pow(3, n));
			
			
			if (a >= e) {
				
				sum = sum + a;
			}
		
		}
		
		System.out.println(" sum: " + sum);
		System.out.println();

}
	
	public static void Twenty() {
		
		//Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
		// модуль которых >= заданному e. Общий член ряда имеет вид:
		// An = 1/ ( (3n -2)(3n + 1) )
		
		
		double e = 0.1;
		double sum = 0;
		double a;
		
		for (double n = 1; n < 11; n++) {
			
			a = Math.abs( 1 / ((3 * n - 2) * ( 3 * n + 1)));
			
			
			if (a >= e) {
				
				sum = sum + a;
			}
		
		}
		
		System.out.println(" sum: " + sum);
		System.out.println();
		
		
	}
	
	public static void TwentyOne() {
		
		// Составить программу для вычисления значения функции F(x) на отрезке [a, b]
		// с шагом h. Результат представить в виде таблицы, первый столбец которой -
		// значения аргумента, второй - соответствующие значения функции
		// F(x) = x - sin (x)
		
		double a = (-5);
		double b = 5;
		double h = 0.5;
		double x = a;
		double F;
		
		
		do {
			F = x - Math.sin(x);
			x = x + h;
			
			System.out.println("x = " + x + "; F(x) = " + F);
		}
		
		while (x <= b);
		
		System.out.println();
		
	}
	
	public static void TwentyTwo() {
		
		
		// Составить программу для вычисления значения функции F(x) на отрезке [a, b]
		// с шагом h. Результат представить в виде таблицы, первый столбец которой -
		// значения аргумента, второй - соответствующие значения функции
		// F(x) = sin^2(x)
		
		double a = (-5);
		double b = 5;
		double h = 0.5;
		double x = a;
		double F;
		
		
		do {
			F = (1 - Math.cos(2 * x)) / 2;
			x = x + h;
			
			System.out.println("x = " + x + "; F(x) = " + F);
		}
		
		while (x <= b);
		
		System.out.println();
	}
	
	public static void TwentyThree() {
		
		// Составить программу для вычисления значения функции F(x) на отрезке [a, b]
		// с шагом h. Результат представить в виде таблицы, первый столбец которой -
		// значения аргумента, второй - соответствующие значения функции
		// F(x) = ctg(x/2) + 1/2 sin (x)
		
		double a = (-5);
		double b = 5;
		double h = 0.5;
		double x = a;
		double F;
		
		
		do {
			F = (Math.cos (x / 2) / Math.sin(x / 2)) + 0.5 * Math.sin(x);
			x = x + h;
			
			System.out.println("x = " + x + "; F(x) = " + F);
		}
		
		while (x <= b);
		
		System.out.println();
	}
	
	public static void TwentyFour() {
		
		// Вводится натуральное число. Нати сумму четных цифр, входящих в его состав.
		// Преобразовать его в др. число, цифры которого будут следовать в обратном 
		// порядке по сравнению с введенным числом.
		
		int firstNumber = 1625378;
		
		int lastNumber = 0;
		
		int eachDigit;
		int n = 0;
		
		int forEven;
		int sum = 0;
		
		System.out.println("Первоначальное число = " + firstNumber);
		
		do {
			eachDigit = (firstNumber % (int) Math.pow(10, (n+1))) / (int) Math.pow(10, n);
			
			
			forEven = eachDigit % 2;
			
			if (forEven == 0) {
				
				sum = sum + eachDigit;
			
			}
			
			
			firstNumber = firstNumber - eachDigit * (int) Math.pow(10, n);
			
			lastNumber = lastNumber * 10 + eachDigit;
			
			n++;
		}
		
		while (firstNumber > 0);
			
		System.out.println("сумма четных " + sum);	
		System.out.println("число наоборот = " + lastNumber);	
						
		}
	
	public static void TwentyFive() {
		
		// Определить факториал числа, введенного пользователем
		
		
		System.out.println("Введите любое натуральное число: ");
		
		
		Scanner number = new Scanner (System.in);
		long x = number.nextLong();
		
		
		BigInteger factorial = new BigInteger ("1");
		
		
		do {
			factorial = factorial.multiply(BigInteger.valueOf(x)); 
			x = x - 1;
		}
		while (x > 0);
		
		
		System.out.println("факториал введенного числа = " + factorial);
		System.out.println();
		
				
	}
	
	public static void TwentySix() {
		
		// Вывести на экран соответствия между символами и их обозначениями
		// в памяти компьютера (таблицу ASCII)
		
		
		for (int n = 33; n < 128; n++) {
			
			int number = n;
			char symbol = (char) number;
			
			System.out.println(symbol + " - " + number);
		}
		
		System.out.println();
		
	}
	
	public static void TwentySeven() {
		
		// Для каждого натурального числа в промежутке от m до n вывести все делители,
		// кроме единицы и самого числа. m и n вводятся с клавиатуры
		
		System.out.println("Введите начальное число диапазона (натуральное");
		
		Scanner number = new Scanner (System.in);
		
		int m = number.nextInt();
		
		System.out.println("Введите конечное число диапазона (натуральное");
		
		int n = number.nextInt();
		
	}
	
	
	}

