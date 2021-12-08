package by.klimash.part01.main;

public class Linear {

	public static void main(String[] args) {
		
		First();
		Second();
		Third();
		Fourth();
		Fifth();
		Sixth();
		 
	
	}

	public static void First() {
		
		// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
		
		System.out.println("1: Найдите значение функции: z = ((a – 3 ) * b / 2) + c, если:");
		
				double a = 4.5;
				double b = 2.0;
				double c = 3.0;
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
				double z = ((a - 3) * b / 2) + c;
				
				System.out.println("Ответ: z = " + z);
				System.out.println();
	}
	
	public static void Second() {
		
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		//(b + sqrt(b^2 + 4ac)) / (2a) - a^3c + b^(-2)
		
		System.out.println("2: Вычислить значение выражения по формуле (все переменные принимают действительные значения)");
		System.out.println("((b + sqrt(b^2 + 4ac)) / (2a) - a^3c + b^(-2), если:");
			
				double a = 4.0;
				double b = (-1.0);
				double c = 7.5;
				
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);		
						
				double d = Math.pow(b, 2) + 4 * a * c;
						
				double result = (b + Math.sqrt(d)) / ( 2 * a ) - Math.pow(a, 3) * c + Math.pow(b, -2); 
				
				System.out.printf("Ответ: " + "%.2f", result);
				System.out.println();
				System.out.println();
								
	}
	
	public static void Third() {
		
		// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		// ((sin x + cos y) / (cos x - sin y)) * tg xy
		
		System.out.println("3: Вычислить значение выражения по формуле (все переменные принимают действительные значения):");
		System.out.println("((sin x + cos y) / (cos x - sin y)) * tg xy, если:");
						
				double x = 1.57;
				double y = 1.047;
								
		System.out.println("x = " + x + " Rad, y = " + y + " Rad");		
		        
		        double fortg = x * y;
		
				double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(fortg);
				
				
				System.out.printf("Ответ: " + "%.3f", result);
				System.out.println(" Rad");
				System.out.println();
						
	}
	
	public static void Fourth() {
		
		// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
		// Поменять местами дробную и целую части числа и вывести полученное значение числа.

						
		        double R = 222.333;
		        
		        System.out.println("4: Дано число " + R + ". Поменять местами его дробную и целую части");
		        System.out.println("и вывести значение числа.");
				
				double дробная = R * 1000 % 1000 ;
				double целая = (int) R;
				
				double result = дробная + целая / 1000;
					
				System.out.println("Ответ: " + result);
				System.out.println();
				
	}
	
	
	
	public static void Fifth() {
		
		// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
		// Поменять местами дробную и целую части числа и вывести полученное значение числа.

			
        int T = 4000;
        
        System.out.println("5: Дано число T = " + T + ", которое представляет длительность прошедшего времени в секундах. Вывести");
        System.out.println("данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.");
		
		int hours = T / 3600;
		
		T = T - 3600 * hours;
		
		int minutes = T / 60;
				
		int seconds = T - 60 * minutes; 
		
		// вывод полученных значений
		
		System.out.print("Ответ: ");	
		
		if (hours < 10) 
			System.out.print("0" + hours + " ч. ");	
		else
			System.out.print(hours + " ч. ");
		
		if (minutes < 10)
			System.out.print("0" + minutes + " мин. ");	
		else
			System.out.print(minutes + " мин. ");
		
		if (seconds < 10) 
			System.out.print("0" + seconds + " с. ");	
		else
			System.out.print(seconds + " с. ");
		
		System.out.println();
		System.out.println();
		
	}
	
	public static void Sixth() {
		
		// Для данной области составить линейную программу, которая печатает true, 
		// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
		
		int x = 3;
		int y = (-2);
		
		System.out.println("6: Напечатать true, если точка с координатами (" + x + ", " + y + ") принадлежит области (-4 <= x <= 4, -3 <= y <= 0)");
		System.out.println("или области (-2 <= x <= 2, 0 <= y <= 3), false - в противном случае.");
		
		boolean X1 = (x >= -4 && x <= 4);
		boolean Y1 = (y >= -3 && y <= 0);
		
		if (X1 && Y1) {
			System.out.println("Ответ: true");
				}
		
		else {
		   boolean X2 = (x >= -2 && x <= 2);
		   boolean Y2 = (y >= 0 && y <= 4);
		
		   if (X2 && Y2)
				System.out.println("Ответ: true");
		   else
			System.out.println("Ответ: false");
		}
	}
}
