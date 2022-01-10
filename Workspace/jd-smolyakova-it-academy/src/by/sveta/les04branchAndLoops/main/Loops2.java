package by.sveta.les04branchAndLoops.main;

import java.math.*;

public class Loops2 {

	public static void main(String[] args) {
		
		/*Eleven();
		Twelve(); 
		Thirteen();
		Fourteen();
		Fifteen();
		Sixteen();
		Seventeen();*/
		Eightteen();
		
		

	}
	
	public static void Eleven() {
		
		//��������� ��������� ���������� �������� ����� ������ ������� �����
			   
		int previousNumber = 0;
		
		for (int i = 1; i < 201; i++) {
		   
		int result = i * i * i - previousNumber;
		
		System.out.println(i + ": " + result);
		
		previousNumber = i * i * i;
		
	   }
		
		System.out.println();
	}
	
	public static void Twelve() {
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
	     System.out.println();
	}
	
	public static void Seventeen() {
		
		// ���� �������������� a � ����������� n. ���������:
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
		
		
	}

}
