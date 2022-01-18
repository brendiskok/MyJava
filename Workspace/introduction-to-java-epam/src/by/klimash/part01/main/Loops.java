package by.klimash.part01.main;

public class Loops {

	public static void main(String[] args) {
		
		/*First();
		Second();
		Third();
		Fourth();
		Fifth();
		Six();
		Seven();*/
		Eight();

	}
    
	public static void Eight() {
		
		//Даны 2 числа. Определить цифры, входящие в запись как первого, так и второго чисел
		
		System.out.println("29: Даны 2 числа. Определить цифры, входящие в запись как первого, так и второго чисел.");
		
		int a = 2845907;
		int b = 517296;
		
		System.out.println("число 1: " + a + " число 2: " + b);
		
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
			System.out.println("Совпадений нет");
		}
		
		System.out.println();
		
	}
	
	
}
