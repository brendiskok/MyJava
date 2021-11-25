package by.sveta.les01.main;

import org.w3c.dom.ls.LSOutput;

public class ThirtySeven {
        // TODO Составить линейную программу, печатающую значение true, если высказывание истинно,
		// false - в противном случае
	
	public static void main (String[] args) {
		
		System.out.println("Составить линейную программу, печатающую значение true, если высказывание истинно, false - в противном случае");
		ThirtySevenA();
		ThirtySevenB();
		ThirtySevenC();
		ThirtySevenD();
		ThirtySevenE();
		ThirtySevenF();
		ThirtySevenG();
		ThirtySevenH();
		ThirtySevenI();
	}
	
	
	public static void ThirtySevenA () {
	
		int N = -10;
		
		System.out.println("Целое число " + N + " является четным двузначным числом");
		
		N = Math.abs(N);
		
		boolean x = (N % 2 == 0 && N > 9 && N < 100);
		
			System.out.println(x);
	}	
	
	
	public static void ThirtySevenB() {
		
		int M = 1203;	
		
		System.out.println("Сумма двух первых цифр четырехзначного числа " + M + " = сумме двух его последних цифр");
		int four = M % 10;
		
		int three = ( M / 10) % 10;
		
		int two = (M / 100) % 10;
		
		int one = M / 1000;
		
		boolean y = ((one + two) == (three + four));
		
		System.out.println(y);
	}
	
	
	public static void ThirtySevenC() {
		
		int N = -123;
		
		System.out.println("Сумма цифр данного трехзначного числа " + N + " является четным числом");
		
		int three = Math.abs(N % 10);
		
		int two = Math.abs((N / 10) % 10);
		
		int one = Math.abs((N / 100) % 10);
		
		boolean x = (((one + two + three) % 2) == 0);
		System.out.println(x);
		
		}	
	
	public static void ThirtySevenD() {
		
		int m = 2;
		
		int n = 5;
		
		int x = 3;
		
		int y = 4;
		
		System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит части плоскости, лежащей между" +
				" прямыми x = " + m + " и x = " + n);
		
		boolean z = (x < n && x > m);
		
		System.out.println(z);
		
	}
	
	public static void ThirtySevenE() {
		
		int N = 234;
		
		System.out.println("Квадрат трехзначного числа " + N + " равен кубу суммы цифр этого числа");
		
		double powN2 = Math.pow(N, 2);
		
		int three = Math.abs(N % 10);
		
		int two = Math.abs((N / 10) % 10);
		
		int one = Math.abs((N / 100) % 10);
		
		double powN3 = Math.pow((one + two + three), 3);
		
		boolean x = (powN2 == powN3);
		
		System.out.println(x);
			
	}
	
	public static void ThirtySevenF() {
		
		int a = 6;
		int b = 6;
		int c = 6;
		
		System.out.println("Треугольник со сторонами " + a + " см. " + b + " см. " + c + " см. является равнобедренным");
		
		boolean x = (a == b && a == c);
		System.out.println(x);
	}
	
	public static void ThirtySevenG() {
		
		int N = -321;
		
		System.out.println("Сумма двух последних цифр натурального числа " + N + " равна первой цифре");
		int three = Math.abs(N % 10);
		
		int two = Math.abs((N / 10) % 10);
		
		int one = Math.abs(N / 100);
		
		boolean x = ((three + two) == one);
		System.out.println(x);
	}
	
	public static void ThirtySevenH() {
		
		int N = 9;
				
		double a = -3;
		
		
		System.out.println("Заданное число " + N + " является степенью числа " + a +" (0 < показатель степени < 4)" );
		
		boolean y = false;
	
		for (int pow = 1; pow < 4; pow++) {
			double b = Math.pow(a, pow);
			boolean x = (b == N);
			if (x)
				y = true;
		}
		System.out.println(y);
	}
	
	public static void ThirtySevenI() {
		
		int a = -4;
		int b = 2;
		int c = 8;
		int m = 2;
		int n = -4;
		
		System.out.println("График функции у = " + a + "x2 + " + b + "x + " + c + " проходит чере точку с координатами (" + m + ", " + n + ")");
		
		double y = a * Math.pow(m, 2) + b * m + c;
		boolean Y = (n == y);
		
		System.out.println(Y);
		
		
	}
	
	}
	


