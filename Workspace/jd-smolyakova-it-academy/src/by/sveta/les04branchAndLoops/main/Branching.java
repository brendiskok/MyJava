package by.sveta.les04branchAndLoops.main;
import java.lang.*;
import java.util.*;


public class Branching {

	public static void main(String[] args) {
		
		First();
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
		Eightteen();
		Nineteen();
		Twenty(); 
		TwentyOne();
		TwentyTwo(); 
		TwentyThree();
		TwentyFour();
		TwentyFive();
		TwentySix();
		TwentySeven();
		TwentyEight();
		TwentyNine();
		Thirty();
		ThirtyOne(); 
		ThirtyTwo();
		ThirtyThree();
		ThirtyFour();
		ThirtyFive();
		ThirtySix();
		ThirtySeven();
		ThirtyEight();
		ThirtyNine();
		Fourty();
		
			
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
		
		int a = 5;
		int b = 5;
		int c = 5;
		
		boolean result =  (a == b && a == c);
		
		System.out.println(result);
		System.out.println();
			
				
	}
	
	public static void Ten() {
		// ��������� ���������, ������� ��������� ������� ������ ����� ������
		
		System.out.print("10: ");
		
		double R1 = 4.0;
		double R2 = 3.0;
		
		double S1 = Math.PI * Math.pow(R1, 2);
		double S2 = Math.PI * Math.pow(R2, 2);
		
		if (S1 > S2) {
			System.out.println("S1 > S2");
		}
		
		else if (S1 == S2) {
			System.out.println( "S1 = S2");
		}
		
		else {
			System.out.println( "S1 < S2");
		}
		
		System.out.println();
		
	}
	
	public static void Eleven() {
		// ��������� ���������, ������� ��������� ������� ������ ������������ ������
		
		System.out.print("11: ");
		
		double h1 = 3.0;
		double a1 = 2.5;
		
		double S1 = (h1 * a1) / 2;
		
		
		double h2 = 3.4;
		double a2 = 2.5;
		
		double S2 = (h2 * a2) / 2;
		
		
		if (S1 > S2) {
			System.out.println("������� ������� ������������ > ������� �������");
		}
		
		else if (S1 == S2) {
			System.out.println("������� ������� ������������ = ������� �������");
		}
		else {
			System.out.println("������� ������� ������������ < ������� �������");
		}
		
		System.out.println();
		
	
	
	}
	
	public static void Twelve() {
		// ���� 3 �������������� �����. �������� � ������� �� �� ���, �������� ������� ��������������,
	    // � � ��������� ������� - �������������
		
		System.out.print("12: ");
		
		double a = 2.0;
		double b = 1.0;
		double c = (-3);
		
		
		
		if (a >= 0) {
			a = a * a;
			System.out.print(a);
		}
		else  {
			a = Math.pow(a, 4);
			System.out.print(a);
		}
		
		
		
		if (b >= 0) {
			b = b * b;
			System.out.print("\t" + b);
		}
		else  {
			b = Math.pow(b, 4);
			System.out.print("\t" + b);
		}
		
		
		
		if (c >= 0) {
			c = c * c;
			System.out.print("\t"+ c);
		}
		else  {
			c = Math.pow(c, 4);
			System.out.println("\t"+ c);
		}
		
		System.out.println();
	
	
	}
	
	
	public static void Thirteen() {
		// ���� 2 ����� A (x1, y1) � B (x2, y2). ��������� ��������, ������������, ������� ��
		// ����� ��������� ����� � ������ ���������
		
		System.out.print("13: ");
		
		double x1 = 3.1;
		double y1 = 2.0;
		
		double s1 = Math.sqrt((Math.pow(x1, 2) + Math.pow(y1, 2)));
		
		
		double x2 = 1.9;
		double y2 = 3.0;
		
		double s2 = Math.sqrt((Math.pow(x2, 2) + Math.pow(y2, 2)));
		
		
		if (s1 < s2) {
			System.out.println("����� � (" + x1 + ", " + y1 + ") ����� � ������ ���������, ��� ����� B (" + x2 + ", " + y2 + ")");
		}
		else if (s1 == s2) {
			System.out.println("����� � (" + x1 + ", " + y1 + ") � ����� B (" + x2 + ", " + y2 + ") ������������ �� ������ ���������");
		}
		else {
			System.out.println("����� B (" + x2 + ", " + y2 + ") ����� � ������ ���������, ��� ����� A (" + x1 + ", " + y1 + ")");
		}
		
		System.out.println();
	
	}
	
	
	public static void Fourteen() {
		// ���� 2 ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��,
		// �� ����� �� �� �������������
		
		System.out.print("14: ");
		
		int a = 30;
		int b = 90;
		int c = 180 - (a + b);
		
		
		
		if (c > 0) {
			if (a == 90 || b == 90 || c == 90) {
				System.out.println("����������� ����������, �� �������������");
			}
			else {
				System.out.println("����������� ����������, �� �� �������������");
			}
		}
		
		else {
			System.out.println("��� �� �����������");
		}
		
		System.out.println();
	
	
	}
	
	public static void Fifteen() {
		// ���� �������������� ����� x � y, �� ������ ���� ������. ������� �� ���� ���� ����� �������� ��������� �� �����,
		// � ������� - �� ��������� �������������
		
		
		System.out.print("15: ");
		
		double x = 4.5;
		double y = 5.5;
		
		if (x < y) {
			x = (x + y) / 2;
			y = 2 * x * y;
			System.out.println("x < y, ����: x = " + x + ", y = " + y);
		}
		
		else {
			y = (x + y) / 2;
			x = 2 * x * y;
			System.out.println("x > y, ����: x = " + x + ", y = " + y);
		}
		
		System.out.println();
	
	
	}
	
	public static void Sixteen() {
		// �� ��������� XOY ������ ������ ������������ ����� �. �������, ��� ��� �����������
		// (�� ����� ��� ��� � ����� ������������ ����)
		
		System.out.print("16: ");
		
		double x = -9.0;
		double y = 1.0;
		
		if ((x == 0) && (y == 0)) {
			System.out.println("����� � ����������� � ������ ���������");
		}
		
		
		else if ((y == 0) && (x < 0 || x > 0)) {
			System.out.println("����� � ����������� �� ��� �������");
		}
		
		
		else if ((x == 0) && (y < 0 || y > 0)) {
			System.out.println("����� � ����������� �� ��� �������");
		}
		
		
		else if ((x > 0) && (y > 0)) {
			System.out.println("����� � ����������� � 1 ��������");
		}
		
		
		else if ((x < 0) && (y > 0)) {
			System.out.println("����� � ����������� � 2 ��������");
		}
		
		
		else if ((x < 0) && (y < 0)) {
			System.out.println("����� � ����������� � 3 ��������");
		}
		
		
		else if ((x > 0) && (y < 0)) {
			System.out.println("����� � ����������� � 4 ��������");
		}
	
	System.out.println();
	}
	
	
	public static void Seventeen() {
		// ���� ����� ����� m, n. ���� ����� �� �����, �� �������� ������ �� ��� ����� � ��� �� ������,
		// ������ �������� �� ��������, � ���� �����, �� �������� ����� ������.
		
		System.out.print("17: ");
		
		int m = 7;
		int n = 4;
		
		if (m == n) {
			m = 0;
			n = 0;
			System.out.println("m = n; " + m + ", " + n);
		}
		
		else {
			if (m > n) {
				n = m;
				System.out.println("m > n; " + m + ", " + n);
			}
			else {
				m = n;
				System.out.println("m < n; " + m + ", " + n);
			}
		}
		
		
		System.out.println();
	
	
	}
	
	public static void Eightteen() {
		// ���������� ���������� ������������� ����� ����� a, b, c
		
		System.out.print("18: ");
		
		int a = 2;
		int b = (-9);
		int c = (-8);
		
		int result = 0;
		
		if (a < 0) {
			result++;
		}
		if (b < 0) {
			result++;
		}
		if (c < 0 ) {
			result++;
		}
		
		System.out.println(result);
		
		System.out.println();
		
	
	
	}
	
	
	public static void Nineteen() {
		// ���������� ���������� ������������� ����� ����� a, b, c
		
		System.out.print("19: ");
		
		int a = 2;
		int b = (-9);
		int c = (-8);
		
		int result = 0;
		
		if (a > 0) {
			result++;
		}
		if (b > 0) {
			result++;
		}
		if (c > 0 ) {
			result++;
		}
		
		System.out.println(result);
		
		System.out.println();
	
	
	}
	
	
	public static void Twenty() {
		// ����������, ��������� ����� ����� a, b, c �������� ����� k.
		
		System.out.print("20: ");
		
		int a = 10;
		int b = 3;
		int c = 22;
		
		int k = 2;
		
		if ((a % k) == 0) {
			System.out.println(k + " �������� ��������� ��� " + a);
		}
		
		if ((b % k) == 0) {
			System.out.println(k + " �������� ��������� ��� " + b);
		}
		
		if ((c % k) == 0) {
			System.out.println(k + " �������� ��������� ��� " + c);
		}
		
		System.out.println();	
	
	
	}
	
	public static void TwentyOne() {
		// ��������� - ������. �� ������ ������������� ������: "��� ��: ������� ��� �������? ����� � ��� �".
		// � ����������� �� ������ �� ������ ������ �������� ����� "��� �������� �������!" ��� "��� �������� ��������!"
		
		System.out.print("21: ");
		
		
		boolean x = true;
		
		do {
			
		System.out.println("��� ��: ������� ��� �������? ����� � ��� �");
		
		Scanner question = new Scanner (System.in);
		String gender = question.next();
		
		gender = gender.toUpperCase();
		
		switch (gender) {
		case ("�"): 
			System.out.println("��� �������� ��������");
			x = true;
			break;
		case "�":
			System.out.println("��� �������� �������");
			 x = true;
			break;
		default:
			x = false;
			System.out.println("�� - �� ���, �������� ��� ���");
		}
		}
		while (x == false);
		
		System.out.println();
		
		
		}
	
	
	public static void TwentyTwo() {
		// ���������������� �������� ���������� x � y ���, ����� � � ��������� ������� �� ���� ��������, � � y - �������.
		
		System.out.print("22: ");
		
		int x = 2;
		int y = 7;
		
		if (x > y) {
			System.out.println("x = " + x + ", y = " + y);
		}
		else {
			int x1 = y;
			y = x;
			System.out.println("x = " + x1 + ", y = " + y);
		}
		
		System.out.println();
	
	
	}
	
	public static void TwentyThree() {
		// ���������� ������������ ����, ��������� � ���������� (����� - �� 1 �� 31, ����� - �� 1 �� 12).
		// ���� ������� ������������ ������, �� �������� �� ����.
		
		System.out.print("23: ");
		
		
		boolean z = true;
		int month;
		do {
			System.out.println("������� ���������� ����� ������ (����������� ����� �� 1 �� 12");
			
			Scanner dateMonth = new Scanner(System.in);
			
			month = dateMonth.nextInt();
			
			if ((month <1) || (month > 12)) {
				System.out.println("����� ������ - ����������� ����� �� 1 �� 12, ���������� ��� ���");
				z = false;
			}
			else {
				z = true;
		}
		}
		while (z == false);
		
		
		
		int day;
		do {
            System.out.println("������� ���������� ����� ��� (����������� �����)");
			
			Scanner dateDay = new Scanner(System.in);
			
			day = dateDay.nextInt();
			
			if (day <= 0) {
				System.out.println("���������� ����� ��� - ����������� �����, ���������� ��� ���");
				z = false;
				continue;
			}
			
			if ((month == 2) && (day < 28)) {
				System.out.println("��������� ����: " + day + ". " + month);
				z = true;
				}
			else if ((month == 2) && (day > 28)) {
				System.out.println("� ������� 28 ����, ��������� ������");
				z = false;
			}
			
			
			
			if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day < 30)) {
				System.out.println("��������� ����: " + day + ". " + month);
				z = true;
				}
			else if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day > 30)) {
				System.out.println("� ���� ������ 30 ����, ��������� ������");
				z = false;
			}
			
			
			if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12) && (day < 31)) {
				System.out.println("��������� ����: " + day + ". " + month);
				z = true;
				}
			else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12) && (day > 31)) {
				System.out.println("� ���� ������ 31 ����, ��������� ������");
				z = false;
			}
		}
		while (z == false);
		
		System.out.println();
		
	}
	
	public static void TwentyFour() {
		// ��������� ���������, ������������ ��������� ������� �� ������� - "����� - �� �����",
		// ���� �� �������� ������ ���������� ��������� n.
		
		System.out.print("24: ");
		
		int n = 11;
		
		switch (n % 2) {
		
		case 0: 
			System.out.println("�� �����");
			break;
		
		default:
			System.out.println("�����");
		}
	
	
	}
	
	public static void TwentyFive() {
		// �������� ��������� - ������ ������� ��������� ������� � ���������, ������� ������� ��������� "������������� ��������",
		// ���� ����������� � ������� ��������� 60 ��������.
		
		
		
		System.out.print("25: ");
		
		double grad = 60.1;
		
		if (grad > 60) {
			System.out.println("������������� ��������");
		}
		
		System.out.println();
		
	
	
	}
	
	
	public static void TwentySix() {
		// �������� ��������� ���������� ����� �������� � �������� �� ���� �����.
		
		System.out.print("26: ");
		
		int a = 2;
		int b = 3;
		int c = 5;
		
		int min = Math.min(Math.min(a, b), Math.min(a, c));
		
		int max = Math.max(Math.max(a, b), Math.max(a, c));
		
		int result = min + max;
		
		System.out.println(result);
		
		System.out.println();
		
		
	
	}
	
	public static void TwentySeven() {
		// ����� max{min(a, b), min(c, d)}.
		
		System.out.print("27: ");
		
		int a = 2;
		int b = 7;
		int c = 3;
		int d = 10;
		
		int result = Math.max(Math.min(a, b), Math.min(c, d));
		
		System.out.println(result);
		
		System.out.println();
	
	
	}
	
	public static void TwentyEight() {
		// ���� ��� ����� a, b, c. ����������, ����� �� ��� ����� d. ���� �� ���� �� ����� d,
		// �� ����� max (d - a, d - b, d - c).
		
		System.out.print("28: ");
		
		int a = 4;
		int b = 5;
		int c = 9;
		
		int d = 6;
		
		if (a == d) {
			System.out.println("a = d");
		}
		
		if (b == d) {
			System.out.println("b = d");
		}
		
		if (c == d) {
			System.out.println("c = d");
		}
		else {
			System.out.println("d �� ����� �� ������ �� �����");
			int max = Math.max(Math.max(d, a), Math.max( Math.max(d, b), Math.max(d, c)));
			System.out.println(max);
			
		}
	
	
	}
	public static void TwentyNine() {
		// ���� ��� ����� A(x1, y1), B (x2, y2), C(x3,y3). ����������, ����� �� ��� ����������� �� ����� ������.
		
		System.out.print("29: ");
		
		double x1 = 6;
		double y1 = 3;
		
		double x2 = 7;
		double y2 = 4;
		
		double x3 = 8;
		double y3 = 5;
		
		double a = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
		
		double b = Math.sqrt((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)));
		
		double c = Math.sqrt((Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)));
		
		double p = (a + b + c) / 2;
		
		double p2 = p * (p - a) * (p - b) * (p - c);
		
		double S = Math.sqrt(p2);
		
		if (S == 0) {
			System.out.println("�o��� ����������� �� ����� ������");
		}
		
		else {
			System.out.println("�o��� �� ����������� �� ����� ������");
		}
		
		System.out.println();
		
	
	
	}
	
	public static void Thirty() {
		// ���� �������������� ����� a, b, c.������� ��� �����, ���� a>b>c,
		// � �������� �� ����������� ����������, ���� ��� �� ���.
		
		System.out.print("30: ");
		
		double a = 0.3;
		double b = 2.5;
		double c = (-9);
		
		if ((b > c) && (a > b)) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
			System.out.println(a + ", " + b + ", " + c);
		}
		
		else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println(a + ", " + b + ", " + c);
		}
		
		System.out.println();
	
	
	}
	
	public static void ThirtyOne() {
		// ������ ������� A, B �������������� ��������� � ������� x, y �������.
		// ����������, ������� �� ������ ����� ���������.
		
		System.out.print("31: ");
		
		double A = 10;
		double B = 8;
		
		double x = 12.5;
		double y = 6.5;
		
		if ((x < A) && (y < B)) {
			System.out.println("������ ������� � ���������");
		}
		else {
			System.out.println("������ �� ������� � ���������");
		}
		
		System.out.println();
		
	
	
	}
	
	public static void ThirtyTwo() {
		// �������� ���������, ������� �� �������� ���� ������ ����������, �������� �� �����
		// �����-���� ���� �� ��� �������������.
		
		System.out.print("32: ");
		
		int a = (-9);
		int b = 10;
		int c = 5;
		
		int res1 = a + b;
		int res2 = a + c;
		int res3 = b + c;
		
		if (res1 > 0) {
			System.out.println("a + b > 0");
		}
		
		else if (res2 > 0) {
			System.out.println("a + c > 0");
		}
		
		else if (res3 > 0) {
			System.out.println("b + c > 0");
		}
		
		else {
			System.out.println("����� ����� ���� �� �������� ����� ������ ����");
		}
		
		System.out.println();
	
	
	}
	
	public static void ThirtyThree() {
		// �������� ���������, ������� �� ������ ����� ���������� ������� ������� ���������
		// � ��������� ���������� � ���� ������. ������ � ���� ����� ������ 6 �������, �������� �� 3 ������ �� ������� �������.
		// ��� ����� ��������� ������: 9583, 1747 - �������� ������ ��� A, B, C;
		// 3331, 7922 - �������� ������ ��� B, C
		// 9455, 8997 - �������� ������ ���� �.
		
		System.out.print("33: ");
		
		System.out.println("������� ������: ");
		
		Scanner enterPass = new Scanner (System.in);
		int pass = enterPass.nextInt();
		
		switch (pass) {
		case 9583:
			System.out.println("����� ����������! �������� ������ A, B, C");
			break;
			
		case 1747:
			System.out.println("����� ����������! �������� ������ A, B, C");
			break;
			
		case 3331:
			System.out.println("����� ����������! �������� ������ B, C");
			break;
			
		case 7922:
			System.out.println("����� ����������! �������� ������ B, C");
			break;
			
		case 9455:
			System.out.println("����� ����������! �������� ������ C");
			break;
			
		case 8997:
			System.out.println("����� ����������! �������� ������ C");
			break;
			
			default:
				System.out.println("������������ ���� �������, ���������� � ��������������");
			
		}
		
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
		
		System.out.println("������� ��������� �����: ");
		
		Scanner asker = new Scanner (System.in);
		double price = asker.nextDouble();
		
		System.out.println("������� �����������: ");
		double cash = asker.nextDouble();
		
		if (price == cash) {
			System.out.println("�������! ");
		}
		
		else if (price < cash) {
			double change = cash - price;
			System.out.println("�������� ����� " + change + " ���.");
		}
		
		else {
			double shortage = price - cash;
			System.out.println("������������ �������, ������� ��� " + shortage + " ���.");
		}
		
		System.out.println();
		
	
	
	}
	
	public static void ThirtyFive() {
		// ��������� ����� � ����� � ������������ ���� �� ������ ���
		
		System.out.print("35: ");
		
		int number = 365;
		
		//january
		if (number < 32) {
			System.out.println(number + " ������");
		}
		
		//february
		else if ( (number > 31) && (number < 60)) {
			number = number - 31;
			System.out.println(number + " �������");
		}
		
		//march
		else if ( (number > 59) && (number < 91)) {
			number = number - 59;
			System.out.println(number + " �����");
		}
		
		//april
		else if ( (number > 90) && (number < 121)) {
		    number = number - 90;
			System.out.println(number + " ������");
		}
		
		
		//may
		else if ( (number > 120) && (number < 152)) {
			number = number - 120;
			System.out.println(number + " ���");
				}
		
		//june
		else if ( (number > 151) && (number < 182)) {
			number = number - 151;
			System.out.println(number + " ����");
				}
		
		//july
		else if ( (number > 181) && (number < 213)) {
			number = number - 181;
			System.out.println(number + " ����");
				}
		
		//august
		else if ( (number > 212) && (number < 244)) {
			number = number - 212;
			System.out.println(number + " �������");
				}
		
		//september
		else if ( (number > 243) && (number < 274)) {
			number = number - 243;
			System.out.println(number + " ��������");
				}
		
		//october
		else if ( (number > 273) && (number < 305)) {
			number = number - 273;
			System.out.println(number + " �������");
				}
		
		//november
		else if ( (number > 304) && (number < 335)) {
			number = number - 304;
			System.out.println(number + " ������");
				}
		
		//december
		else {
			number = number - 334;
			System.out.println(number + " �������");
				}
		
		System.out.println();
	
	}
	
	public static void ThirtySix() {
		// ��������� �������� �������
		System.out.print("36: ");
		
		double x = 1.5;
		double y;
		
		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
			System.out.println("x <= 3, y = " + y);
		}
		
		else {
			y = 1 / (Math.pow(x, 3) + 6);
			System.out.println("x > 3, y = " + y);
		}
		
		System.out.println();
	
	
	}
	
	public static void ThirtySeven() {
		// ��������� �������� �������
		
		System.out.print("37: ");
		
		double x = 4.0;
		double y;
		
		if (x >= 3) {
			y = (- Math.pow(x, 2)) + 3 * x + 9;
			System.out.println("x >= 3, y = " + y);
		}
		
		else {
			y = 1 / (Math.pow(x, 3) - 6);
			System.out.println("x < 3, y = " + y);
		}
		
		System.out.println();
	
	
	}
	
	public static void ThirtyEight() {
		// ��������� �������� �������
		
		System.out.print("38: ");
		
		double x = 2;
		double y;
		
		if ( (x >= 0) && (x <= 3)) {
			y = Math.pow(x, 2);
			System.out.println("0 <= x <= 3; y = " + y);
		}
		
		else {
			y = 4;
			System.out.println("y = " + y);
		}
		
		System.out.println();
	
	
	}
	
	
	public static void ThirtyNine() {
		// ��������� �������� �������
		
		System.out.print("39: ");
		
		double x = 10;
		double y;
		
		if (x >= 8) {
			y = (- Math.pow(x, 2)) + x - 9 ;
			System.out.println("x >= 8; y = " + y);
		}
		
		else {
			y = 1 / (Math.pow(x, 4) - 6);
			System.out.println("x < 8; y = " + y);
		}
		
		System.out.println();
	
	
	}
	
	public static void Fourty() {
		// ��������� �������� �������
		
		System.out.print("40: ");
		
		double x = 14;
		double y;
		
		if (x <= 13) {
			y = (-Math.pow(x, 3) + 9);
			System.out.println("x <= 13; y = " + y);
		}
		
		else {
			y = (-(3 / (x + 1)));
			System.out.println("x > 13; y = " + y);
		}
		
		System.out.println();
	
	
	}
	
	
	}
		

	

