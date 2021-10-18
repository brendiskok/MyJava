package by.sveta.les01.main;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		
		// в n малых бидонах 80л молока. Сколько литров молока в m больших бидонах, 
		// если в каждом большом на 12 л больше, чем в малом?
		
		System.out.print("Введите количество малых бидонов: ");
		Scanner askN = new Scanner (System.in);
			
		// little can's quantity
		int n = askN.nextInt();
				    
		// milk in 1 little can
		double little = 80.0 / n;  
				
		
			System.out.print("Введите количество больших бидонов: ");
		// big can's quantity 
		Scanner askM = new Scanner(System.in);
		int m = askM.nextInt();
		
		
		//milk in m big cans
		double bigs = (little + 12.0) * m;           
		
		System.out.println("В больших бидонах у вас " + bigs + " л. молока.");
		
		askN.close();
		askM.close();
		
		}
		
	}
	
