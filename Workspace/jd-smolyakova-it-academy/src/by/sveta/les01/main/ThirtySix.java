package by.sveta.les01.main;

public class ThirtySix {

	public static void main(String[] args) {
		// TODO Найти частное произведений четных и нечетных цифр четырехзначного числа
		
		double number = 8736;
		double multipliedEven = 1;
		double multipliedUneven = 1;		
		
		System.out.printf("Дано число " + "%.0f", number);
		System.out.println();
		
		while (number > 0.99) {
			
			double digit = number % 10;
				    
		    if (digit % 2 > 0) 
			    multipliedUneven = multipliedUneven * digit;
		    else 
		    	multipliedEven = multipliedEven * digit;
		   
		    int n = 1;
		    number = (int) (number / Math.pow(10, n));
		    
		}
		
		double result = multipliedEven / multipliedUneven;
		System.out.println("Частное произведений четных и нечетных цифр числа = " + result);
		
		
		
	}

}
