package by.sveta.les01.main;
import java.util.Scanner;

public class ThirtyEight {

	public static void main(String[] args) {
		// TODO Для данных областей составить линейную программу, которая печатает true, если точка 
		// с координатами принадлежит закрашенной области, false -  в противном случае
		
		ThirtyEightA();

	}
	
	public static void ThirtyEightA() {
		
		
		int x = 3;
		int y = -2;
		
		System.out.println("Печать true, если точка с координатами (" + x + ", " + y + ") принадлежит области (-4 <= x <= 4, -3 <= y <= 0)");
		System.out.println("или области (-2 <= x <= 2, 0 <= y <= 3), false - в противном случае");
		
		boolean X1 = (x >= -4 && x <= 4);
		boolean Y1 = (y >= -3 && y <= 0);
		
		if (X1 && Y1)
			System.out.println("true");
		
		else {
		   boolean X2 = (x >= -2 && x <= 2);
		   boolean Y2 = (y >= 0 && y <= 4);
		
		   if (X2 && Y2)
				System.out.println("true");
		   else
			System.out.println("false");
		}	
	}

	
	public static void ThirtyEightB() {
		
		int x = -5;
		int y = 1;
				
		System.out.println("Печать true, если точка с координатами (" + x + ", " + y + ") принадлежит области, ограниченной y = -x + 4, где (0 <= x <= 4, 0 <= y <= 4)");
		System.out.println("или области, ограниченной y = 3x + 4, где (4 <= x <= 0, 0 <= y <= 4), false - в противном случае");
		
		boolean A = (y < 0 || y > 4);
		
		if (A)
			System.out.println("false");
		else {
		   boolean B = (x < -4 || x > 4);
		   if (B)
			   System.out.println("false");
		   
		   else {
				
		         int y1 = -x +4;
		         int y2 = 3 * x + 4;
		         boolean C = (y1 <= 4 || y2 <= 4);
		
		         System.out.println(C);
		   }
	   }
	}	
		
	public static void ThirtyEightC() {
			
			
			int x = 5;
			int y = 0;
			
			System.out.println("Печать true, если точка с координатами (" + x + ", " + y + ") принадлежит области, находящейся в 1 четверти окружности R = 4");
			System.out.println("или области, находящейся в 4 четверти окружности R = 5, false - в противном случае");
			
			boolean A = ((x > 4 || x < 0) && (y > 4 || y < -5));
				
			 if (A) 
				System.out.println("false");
			 else {
				
				boolean B = ((x > 5 || x < 0) && (y < -5 || y > 0));
					
				 if (B) 
				      System.out.println("false");
				 
				 // принадлежность точки проверяем через площадь круга с радиусом2 = x2 + y2
				 else {
					double S1 = Math.PI * Math.pow(4, 2);
					double S0 = Math.PI * (Math.pow(x, 2) + Math.pow(y, 2));
					if (S0 <= S1)
						System.out.println("true");
					else {
						double S2 = Math.PI * Math.pow(5, 2);
						if (S0 <= S2)
							System.out.println("true");
						else
							System.out.println("false");
										}
				 }
			
			}
	
	}

	}

