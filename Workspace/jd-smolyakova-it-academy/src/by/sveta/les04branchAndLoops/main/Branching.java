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
		// ��������� ��������� ��������� ���� ����� 1 � 2.
		// ���� 1 < 2 - ������� �� ����� ����� 7, � ��������� ������ - ����� 8
		
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
		// ��������� ��������� ��������� ���� ����� 1 � 2.
		// ���� 1 < 2 - ������� �� ����� "yes", � ��������� ������ - "no"
		
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
		// ��������� ��������� ��������� ���������� ����� � � ����� 3. 
		// ���� � < 3 - ������� �� ����� "yes", � ��������� ������ - "no"
		
		System.out.print("3: ");
		
		System.out.println("������� �����: ");
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
		// ��������� ���������: ����� �� ��� ����� � � b? 
		
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
		// ��������� ��������� ����������� ����������� �� ���� ����� � � b 
		
		
		System.out.print("5: ");
		
		int a = 3;
		int b = 4;
		
		if (a < b) {
			System.out.println("���������� ����� �� " + a + " � " + b + " - ��� " + a);
		}
		
		else {
			System.out.println("���������� ����� �� " + a + " � " + b + " - ��� " + b);
		}
			
		System.out.println();
		
		
	}
	
	public static void Six() {
		// ��������� ��������� ����������� ����������� �� ���� ����� � � b 
		
		System.out.print("6: ");
		
		int a = 5;
		int b = 8;
		
		if (a > b) {
			System.out.println("���������� ����� �� " + a + " � " + b + " - ��� " + a);
		}
		
		else {
			System.out.println("���������� ����� �� " + a + " � " + b + " - ��� " + b);
		}
		
		System.out.println();
		
	}
	
		
	public static void Seven() {
		// ��������� ��������� ���������� ������ ��������� a*x*x + b*x +c 
		// ��� �������� ��������� a, b, c, x
		
		System.out.print("7: ");
		
		double a = (-5.5);
		double b = 3.0;
		double c = 2.6;
		double x = (-4.0);
		
		double result = a * x * x + b * x + c;
		System.out.println("��������� ��������� " + a + " * " + x + " * " + x + " + " + b + " * " + x + " + " + c + " = " + result);
		
		if (result > 0) {
			result = result;
			System.out.println("������ ��������� = " + result);	
		}
		else {
			result = (- result);
			System.out.println("������ ��������� = " + result);
		}
		
		System.out.println();
		
		
	}
	
	
	public static void Eight() {
		// ��������� ��������� ���������� ����������� �� ��������� ���� ����� a, b
		
		System.out.print("8: ");
		
		int a = 5;
		int aPow = (int) Math.pow (a, 2);
		int b = 4;
		int bPow = (int) Math.pow (b, 2);
	
	if (aPow < bPow) {
		System.out.println("���������� �� ��������� ����� " + a + " � " + b + " - ��� ������� " + a + " = " + aPow);
	}
	
	else {
		System.out.println("���������� �� ��������� ����� " + a + " � " + b + " - ��� ������� " + b + " = " + bPow);
	}
		
	System.out.println();
	}
	
	
	public static void Nine() {
		// ��������� ���������, ������� ��������� �� 3� ��������� ��������,
		// �������� �� ������ ����������� ��������������
		
		
		
		System.out.print("9: ");
		
	}
	
	public static void Ten() {
		// ��������� ���������, ������� ��������� ������� ������ ����� ������
		
		System.out.print("10: ");
		
	}
	
	}
		

	

