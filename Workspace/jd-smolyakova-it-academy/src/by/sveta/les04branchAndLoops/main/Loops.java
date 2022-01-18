package by.sveta.les04branchAndLoops.main;

import java.util.Scanner;
import java.math.*;

import org.w3c.dom.ls.LSOutput;

public class Loops {

	public static void main(String[] args) {
		
		
		
		/*First();
		Second();
		Third();
		Fourth();
		Fifth();
		Six();
		Seven();
		Eight();
		Nine();
		Ten(); 
		Eleven();
		Twelve();
		Thirteen();
		Fourteen();
		Fifteen();
		Sixteen(); 
		Seventeen();
		Eighteen();
		Nineteen();
		Twenty(); 
		TwentyOne();
		TwentyTwo(); 
		TwentyThree();
		TwentyFour();
		TwentyFive();
		TwentySix();
		TwentySeven();
		TwentyEight();*/
		TwentyNine();
		/*Thirty();
		ThirtyOne(); 
		ThirtyTwo();
		ThirtyThree();
		ThirtyFour();
		ThirtyFive();
		ThirtySix();
		ThirtySeven();
		ThirtyEight();
		ThirtyNine();
		Fourty(); */

	}
	
	public static void First() {
		// ������� �� ����� ����� �� 1 �� 5
		
		System.out.print("1: ");
		
		for (int i = 1; i < 6; i++ ) {
			System.out.print(i + "  ");
		}

		System.out.println();
		System.out.println();
		
			
	}
		
	public static void Second() {
		// ������� �� ����� ����� �� 5 �� 1
		
		System.out.print("2: ");
		
		for (int i = 5; i > 0; i = i - 1) {
			System.out.print(i + "  ");
		}
		

		System.out.println();
		System.out.println();
		
	}
	
	
	public static void Third() {
		// ������� �� ����� ������� ��������� �� 3
		
		System.out.print("3: ");
		
		
		for (int a = 0; a < 10; a++) {
			int b = 3 * a;
			System.out.println("3 * " + a + " = " + b);
		}
		
		System.out.println();
	}
	
	public static void Fourth() {
		// c ������� while �������� ����� ������ ���� ������ ����� � ���������
		// �� 2 �� 100 ������������
		
		System.out.print("4: ");
		
		int n = 2;
		while (n < 101) {
			System.out.print(n + " ");
			n = n + 2;
		}
		

		System.out.println();
		System.out.println();
				
	}
	
	public static void Fifth() {
		// c ������� while �������� ����� ����������� ����� ���� �������� �����
		// � ��������� �� 1 �� 99 ������������
		
		
		System.out.print("5: ");
		
		int n = 1;
		int sum = 0;
		
		while (n < 100) {
			sum = sum + n ;
			n = n + 2;
				
		}
		
		System.out.println(sum);
		
		System.out.println();
		
	}
	
	public static void Six() {
		// �������� �����, ��� ������������ ������ ����� ����� ������������� �����,
		// � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����
		
		System.out.print("6: ");
		
		System.out.println("������� ����� ������������� �����");
		
		Scanner ForNumber = new Scanner(System.in);
		long number = ForNumber.nextLong();
		
		long n = 1;
		long sum = 0;
		
		while (n <= number ) {
			sum = sum + n;
			n++;
			
		}
		
		System.out.println(sum + " n=" + n);
		System.out.println();
		
	}
	
		
	public static void Seven() {
		// ��������� �������� ������� �� ������� [a, b] � ����� h:
		// y = x, x > 2
		// y = (-x), x <= 2
		
		System.out.print("7: ");
		
		double a = (-5);
		double b = 10;
		
		double h = 0.5;
		
		double y;
		
		
		while (a <= b) {
			if (a <= 2) {
				y = a;
				System.out.print("*" + y + " ");
			}
			else {
				y = (-a);
				System.out.print("/" + y + " ");
			}
			a = a + h;
		}
				
		System.out.println();
		
		
	}
	
	
	public static void Eight() {
		// ��������� �������� ������� �� ������� [a, b] � ����� h:
		// y = (x + c)*2,  x = 2
		// y = (x - c) + 6, x != 15
		
		System.out.print("8: ");
		
		int a = 2;
		int b = 40;
		int c =5;
		
		int h = 3;
		int y;
		
		for (int i = a; i <= b; i = i + h) {
			if (i == 2) {
				y = (i + c) *2;
				System.out.print(y + "  ");
			}
			else if ( i != 15) {
				y = (i - c) + 6;
				System.out.print(y + "  ");
			}
		}
		
	
	System.out.println();
	}
	
	
	public static void Nine() {
		// ����� ����� ��������� ������ ��� �����
		
		
		System.out.print("9: ");
		
		double sum = 0;
		
		for (int i = 1; i < 101; i++) {
			sum = sum + Math.pow(i, 2);
		}
		
		System.out.println(sum);
		
		System.out.println();
			
				
	}
	
	public static void Ten() {
		// ��������� ��������� ���������� ������������ ��������� ������ ������� �����
		
		System.out.print("10: ");
		
		BigInteger sum = BigInteger.valueOf(1);
						
		for (int i = 1; i < 201; i++) {
			
			BigInteger number = BigInteger.valueOf(i);
			
			sum = sum.multiply(number);
		}
		
		System.out.println(sum);
		
		System.out.println();
		
		}
	
		
		
		
	
	
	public static void Eleven() {
		// ��������� ��������� ���������� �������� ����� ������ ������� �����
		
		System.out.print("11: ");
        
		int previousNumber = 0;
		
		for (int i = 1; i < 201; i++) {
		   
		int result = i * i * i - previousNumber;
		
		System.out.println(i + ": " + result);
		
		previousNumber = i * i * i;
		
	   }
		
		System.out.println();

		
		
	}
	
	public static void Twelve() {
		// ������������������ a
		
		System.out.print("12: ");
		// ������������������ An �������� ���: �1 = 1; 
		// �n = 6 + A(n-1), ��� ������� n > 1
		// ��������� ��������� ���������� ������������ ������ 10 ������ ���� ������������������
		
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
		//��������� ������� �������� ������� y = 5 - x^2 / 2 �� ������� [-5; 5] � ����� 0.5
		
		System.out.print("13: ");
		
        double x = (-5.0);
		
		while ( x <= 5) {
			
			double y = 5 - (x * x / 2);
			System.out.println("x = " + x + "; y = " + y);
			
			x = x + 0.5;
			
		}
	
		
		System.out.println();
	
	}
	
	
	public static void Fourteen() {
		// ���� ����������� ����� n, ��������� 1 + 1/2 + 1/3 + ... + 1/n
		
		System.out.print("14: ");
		
		double n = 50;
		
		double result = 1;
		
		for (double i = 2; i <= (n); i++) {
			
			result = result + 1 / i;
			
		}
		
		System.out.println(result);
		
		
		System.out.println();
	
	
	}
	
	public static void Fifteen() {


		// ���������: 1 + 2 + 4 + 8 + ... + 2^10
		
		int result = 1;
		
		for (int i = 1; i < 11; i++) {
			
			result = result + (int) Math.pow(2, i);
		}
		
		System.out.println(result);
		
		
		System.out.print("15: ");
		
	
		
		System.out.println();
	
	
	}
	
	public static void Sixteen() {


		// ��������� (1+2) * (1+2+3) * ... * (1+2+...+10)
		
	     BigInteger b = new BigInteger("1");
	     long a = 1;
		
		 	     
	     for (int i = 2; i < 11; i++) {
	    	 
	    	 a = a + i;
	    	 
	    	b = b.multiply(BigInteger.valueOf(a));
	   	 
	     }
	     
	     System.out.println(b);
		
		System.out.print("16: ");
		
	
	
	System.out.println();
	}
	
	
	public static void Seventeen() {


		// ���� �������������� a � ����������� n. ���������:
		// a (a + 1)...(a + n-1)
		
		System.out.print("17: ");
		
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
	
	public static void Eighteen() {


		//���� �������� ��� � ��������� ����� e. ����� ����� ��� ������ ����,
		// ������ ������� >= ��������� e. ����� ���� ���� ����� ���:
		// An = (-1)^(n-1) / n
		
		
		System.out.print("18: ");
	
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

		//���� �������� ��� � ��������� ����� e. ����� ����� ��� ������ ����,
		// ������ ������� >= ��������� e. ����� ���� ���� ����� ���:
		// An = 1/ (2^n) + 1/ (3^n)
		
		
		System.out.print("19: ");
		
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

		//���� �������� ��� � ��������� ����� e. ����� ����� ��� ������ ����,
		// ������ ������� >= ��������� e. ����� ���� ���� ����� ���:
		// An = 1/ ( (3n -2)(3n + 1) )
		
		
		System.out.print("20: ");
		
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


		// ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [a, b]
		// � ����� h. ��������� ����������� � ���� �������, ������ ������� ������� -
		// �������� ���������, ������ - ��������������� �������� �������
		// F(x) = x - sin (x)
		
		
		System.out.print("21: ");
		
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


		// ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [a, b]
		// � ����� h. ��������� ����������� � ���� �������, ������ ������� ������� -
		// �������� ���������, ������ - ��������������� �������� �������
		// F(x) = sin^2(x)
		
		
		System.out.print("22: ");
		
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

		// ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [a, b]
		// � ����� h. ��������� ����������� � ���� �������, ������ ������� ������� -
		// �������� ���������, ������ - ��������������� �������� �������
		// F(x) = ctg(x/2) + 1/2 sin (x)
		
		
		System.out.print("23: ");
		
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
		// �������� ����������� �����. ���� ����� ������ ����, �������� � ��� ������.
		// ������������� ��� � ��. �����, ����� �������� ����� ��������� � �������� 
		// ������� �� ��������� � ��������� ������.
		
		System.out.print("24: ");
		
		int firstNumber = 1625378;
		
		int lastNumber = 0;
		
		int eachDigit;
		int n = 0;
		
		int forEven;
		int sum = 0;
		
		System.out.println("�������������� ����� = " + firstNumber);
		
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
			
		System.out.println("����� ������ " + sum);	
		System.out.println("����� �������� = " + lastNumber);	
		System.out.println();
	
	}
	
	public static void TwentyFive() {
		
		// ���������� ��������� �����, ���������� �������������
		
				
		System.out.print("25: ");
		
		System.out.println("������� ����� ����������� �����: ");
		
		
		Scanner number = new Scanner (System.in);
		long x = number.nextLong();
		
		
		BigInteger factorial = new BigInteger ("1");
		
		
		do {
			factorial = factorial.multiply(BigInteger.valueOf(x)); 
			x = x - 1;
		}
		while (x > 0);
		
		
		System.out.println("��������� ���������� ����� = " + factorial);
	
		System.out.println();
		
		
	}
	
	
	public static void TwentySix() {
		// ������� �� ����� ������������ ����� ��������� � �� �������������
		// � ������ ���������� (������� ASCII)
		
		System.out.print("26: ");
		
		for (int n = 33; n < 128; n++) {
			
			int number = n;
			char symbol = (char) number;
			
			System.out.println(symbol + " - " + number);
		}
				
		System.out.println();
		
			
	}
	
	public static void TwentySeven() {

		// ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������,
		// ����� ������� � ������ �����. m � n �������� � ����������
		
		System.out.print("27: ");
		
		System.out.println("������� ��������� ����� ��������� (�����������");
		
		Scanner number = new Scanner (System.in);
		
		int m = number.nextInt();
		
		System.out.println("������� �������� ����� ��������� (�����������");
		
		int n = number.nextInt();
		
		int t;
		
		for (; m <= n; m++) {
			
			t = 2;
			
			System.out.println("m = " + m);
			
			while ( t <= m) {
				
			if ( ((m % t) == 0) && (m != t) ) {
				System.out.println(t + " - �������� ����� " + m);
			}
			
			t++;
			
			}
		
	}
		
		System.out.println();
	
	
	}
	
	public static void TwentyEight() {
		/* �������� ���������, � ������� �������� 2 �������� X � Y � ���� �������� (+ - / *)
		 * ��������� ��������� Z � ����������� �� �����. ������������� ������� �� ��������� �������� ����
		 * ��������, � ����� �� ���� Y = 0 ��� �������.
		 * ������������ ����������� ������������ ���������� ��� ������������ ��������� (��������� ����).
		 * � �������� ������� ����������� ���������� ������� 0.
		 */
		
		
		System.out.print("28: ");
		int end;		
        boolean check;
		
		double X = 0;
		
		double Y = 0;
		
		double Z;
		
		
		
		do {
		// ���� ��� ������������ ���������� ��� ����������� ���������	
		
		// ���� � � �������� ������������ �������� ����
		    do {
		    	
		    Scanner dataX = new Scanner(System.in);
		    
			System.out.println("������� �������� X: ");
			  
			  
			 check = dataX.hasNextDouble();
			  
			  if (check) {
			     
				   X = dataX.nextDouble();
				  
		      }
			
			  else {
				 
				  System.out.println("��� �� �����");
		      }
		    }
			
			while (!check);
		    
		//���� � �������� Y
		    
		    do {	
		    			    	
		    	System.out.println("������� �������� Y: ");
		    	
		    	Scanner dataY = new Scanner(System.in);
		    			    	
		    	check = dataY.hasNextDouble();
		    	
		    	if (check) {
		    		
		    		Y = dataY.nextDouble();
		    		}
		    	
		    	else {
		    		System.out.println("��� �� �����");
		    	}
		    }
		    
		    while (!check);
		    
		  // ���� + - / *
		    
		    do {
		    	System.out.println("������� ���� �������� �������� (+, -, /, *): ");
				
		    	Scanner dataSign = new Scanner(System.in);
				String forsign = dataSign.next(); 
				
				int length = forsign.length();
				
				char sign = forsign.charAt(0);
				
							
					switch (sign) {
					
					case ('+'):
						
						Z = X + Y;
						System.out.println("Z = X + Y = " + Z);
						check = true;
					    
					  	break;
					
					case ('-'):
						
						Z = X - Y;
						System.out.println("Z = X - Y = " + Z);
						check = true;
						break;
					
					case ('/'):
						
						if (Y == 0) {
							System.out.println("������� �� 0 ����������, ������� ����� ��������");
						}
						
					
						else {
							
						    Z = X / Y;
						    System.out.println("Z = X / Y = " + Z);
							check = true;
						}
					   
						break;
						
					case ('*'):

						Z = X * Y;
						System.out.println("Z = X * Y = " + Z);
						check = true;
						break;
					
					default:
						check = false;
						
					}
					
		    }
		    
		    while (!check);
		
		//��������� ���������� ��� ����������
		    
		System.out.println("���������� ����������? - 1; ���������� ����������? - 0");    
		Scanner exit = new Scanner(System.in);
		
		end = exit.nextInt();
		if (end == 1) {
			System.out.println("������ �������! ");;
		}
		
		else {
			end = 0;
		}
		
		
		
		}
		
		while (end != 0);
		
				
		System.out.println();
		
	}	
		
		
	
	

	public static void TwentyNine() {
		
		//���� 2 �����. ���������� �����, �������� � ������ ��� �������, ��� � ������� �����
		
		System.out.print("29: ");
		
		int a = 2845907;
		int b;
		
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
			System.out.println("���������� ���");
		}
		
		System.out.println();
		
	}
	
	public static void Thirty() {
		//�������� ���������, ����������� ������� ����� � ��������
		
		System.out.print("30: ");
		
		

		System.out.println();
	
	
	}
	
	public static void ThirtyOne() {
		// ������ ������� A, B �������������� ��������� � ������� x, y �������.
		// ����������, ������� �� ������ ����� ���������.
		
		System.out.print("31: ");
		

		
		System.out.println();
		
	
	
	}
	
	public static void ThirtyTwo() {
		// �������� ���������, ������� �� �������� ���� ������ ����������, �������� �� �����
		// �����-���� ���� �� ��� �������������.
		
		System.out.print("32: ");
		
		
		System.out.println();
	
	
	}
	
	public static void ThirtyThree() {
		// �������� ���������, ������� �� ������ ����� ���������� ������� ������� ���������
		// � ��������� ���������� � ���� ������. ������ � ���� ����� ������ 6 �������, �������� �� 3 ������ �� ������� �������.
		// ��� ����� ��������� ������: 9583, 1747 - �������� ������ ��� A, B, C;
		// 3331, 7922 - �������� ������ ��� B, C
		// 9455, 8997 - �������� ������ ���� �.
		
		System.out.print("33: ");
		

		
		System.out.println();
		
			
	}
	
	
	public static void ThirtyFour() {
		/* ��������� ���������, ����������� ������ ���������� ���������� � ������� ��������.
		 * ��������� ����������� ��������� ����, ����� �����, ��������� �����������; ���� �����
		 * �� ���������, �������� �� ������ "�������"; ���� ����� ������� ������, ��� ����������,
		 * �� �������� "�������� �����" � ��������� ����� �����;
		 * ���� ����� ������������, �� �������� ��������� �� ���� � ��������� ������ ����������� �����. 
		 */
		
		System.out.print("34: ");
		
		
		System.out.println();
		
	
	
	}
	
	public static void ThirtyFive() {
		// ��������� ����� � ����� � ������������ ���� �� ������ ���
		
		System.out.print("35: ");
		
	
		
		System.out.println();
	
	}
	
	public static void ThirtySix() {
		// ��������� �������� �������
		System.out.print("36: ");
		
	
		
		System.out.println();
	
	
	}
	
	public static void ThirtySeven() {
		// ��������� �������� �������
		
		System.out.print("37: ");
		
	
		
		System.out.println();
	
	
	}
	
	public static void ThirtyEight() {
		// ��������� �������� �������
		
		System.out.print("38: ");
		
	
		System.out.println();
	
	
	}
	
	
	public static void ThirtyNine() {
		// ��������� �������� �������
		
		System.out.print("39: ");
		
		
		System.out.println();
	
	
	}
	
	public static void Fourty() {
		// ��������� �������� �������
		
		System.out.print("40: ");
		
		
		
		
		System.out.println();
	
	
	}

}
