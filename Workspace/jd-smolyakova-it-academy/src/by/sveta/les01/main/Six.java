package by.sveta.les01.main;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		
		// � n ����� ������� 80� ������. ������� ������ ������ � m ������� �������, 
		// ���� � ������ ������� �� 12 � ������, ��� � �����?
		
		System.out.print("������� ���������� ����� �������: ");
		Scanner askN = new Scanner (System.in);
			
		// little can's quantity
		int n = askN.nextInt();
				    
		// milk in 1 little can
		double little = 80.0 / n;  
				
		
			System.out.print("������� ���������� ������� �������: ");
		// big can's quantity 
		Scanner askM = new Scanner(System.in);
		int m = askM.nextInt();
		
		
		//milk in m big cans
		double bigs = (little + 12.0) * m;           
		
		System.out.println("� ������� ������� � ��� " + bigs + " �. ������.");
		
		askN.close();
		askM.close();
		
		}
		
	}
	
