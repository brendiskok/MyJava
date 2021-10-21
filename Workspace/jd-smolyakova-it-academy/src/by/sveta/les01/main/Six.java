package by.sveta.les01.main;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		
		// в n бидонах 80л молока. сколько молока в m бидонах, если в каждом большом на 12 л больше?
		
		System.out.print("Количество малых бидонов: ");
		Scanner askN = new Scanner (System.in);
			
		// little can's quantity
		int n = askN.nextInt();
				    
		// milk in 1 little can
		double little = 80.0 / n;  
				
		
			System.out.print("Количество больших бидонов: ");
		// big can's quantity 
		Scanner askM = new Scanner(System.in);
		int m = askM.nextInt();
		
		
		//milk in m big cans
		double bigs = (little + 12.0) * m;           
		
		System.out.println("В больших бидонах " + bigs + " л. молока.");
		
		askN.close();
		askM.close();
		
		}
		
	}
	
