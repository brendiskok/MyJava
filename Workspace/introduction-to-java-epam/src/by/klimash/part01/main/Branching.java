package by.klimash.part01.main;

public class Branching {

	public static void main(String[] args) {
		
		
		First();
		Second();
		Third();
		Fourth();
		Fifth();

	}
	
	public static void First() {
		//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
		//и если да, то будет ли он прямоугольным.
		
		System.out.println("1: Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, ");
		System.out.println("и если да, то будет ли он прямоугольным.");
	
		int a = 30;
		int b = 90;
		
		System.out.println("угол 1 = " + a + " градусов, угол 2 = " + b + " градусов");
		
		int c = 180 - (a + b);
		
				
		if (c > 0) {
			if (a == 90 || b == 90 || c == 90) {
				System.out.println("Ответ: Треугольник существует, он прямоугольный");
			}
			else {
				System.out.println("Ответ: Треугольник существует, он не прямоугольный");
			}
		}
		
		else {
			System.out.println("Ответ: Это не треугольник");
		}
		
		System.out.println();
	
				
	}
	
	public static void Second() {
		 // Найти max {min(a, b), min(c, d)}.
		
				
		System.out.print("2: ");
				
		int a = 2;
		int b = 7;
		int c = 3;
		int d = 10;
		
		System.out.println(" Найти max {min(" + a + ", " + b+ "), min(" + c + ", " + d + ")}");
				
		int result = Math.max(Math.min(a, b), Math.min(c, d));
				
		System.out.println("Ответ: " + result);
				
		System.out.println();
			
	}
	
	public static void Third() {
		// Даны три точки A(x1, y1), B (x2, y2), C(x3,y3). Определить, будут ли они расположены на одной прямой.
		// Применим формулу Герона для расчета площади треугольника по трем сторонам. 
		// Если площадь равна 0, значит это не треугольник, точки лежат на одной прямой.
		
        System.out.print("3: ");
		
		double x1 = 6.0;
		double y1 = 3.0;
		
		double x2 = 7.0;
		double y2 = 4.0;
		
		double x3 = 8.0;
		double y3 = 5.0;
		
		System.out.println("Даны три точки A(" + x1 + ", " + y1 + "), B (" + x2 + ", " + y2 + "), C(" + x3 + ", " + y3 + ").");
		System.out.println("Определить, будут ли они расположены на одной прямой.");
		
		double a = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
		
		double b = Math.sqrt((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)));
		
		double c = Math.sqrt((Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)));
		
		
		double p = (a + b + c) / 2;
		
		double p2 = p * (p - a) * (p - b) * (p - c);
		
		
		double S = Math.sqrt(p2);
		
		if (S == 0) {
			System.out.println("Ответ: Тoчки расположены на одной прямой");
		}
		
		else {
			System.out.println("Ответ: Тoчки не расположены на одной прямой");
		}
		
		System.out.println();
	}
	
	public static void Fourth() {
		// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
		// Определить, пройдет ли кирпич через отверстие.
		
        		
		double A = 7.0;
		double B = 14.0;
		
		System.out.println("4: Определить, пройдет ли кирпич (ДхВхШ - 25х12х6.5 (см)) в отверстие высотой " + A + " см, шириной " + B +" см.");
		
		double x = 12.5;
		double y = 6.5;
		
		if ((x < A) && (y < B)) {
			System.out.println("Ответ: Кирпич пройдет в отверстие");
		}
		
		else if ((y < A) && (x < B)) {
	    	System.out.println("Ответ: Кирпич пройдет в отверстие");			
		}
				
		else {
			System.out.println("Ответ: Кирпич не пройдет в отверстие");
		}
		
		System.out.println();
		
	}
	
	public static void Fifth() {
		// Вычислить значение функции. Если x <= 3, y = x^2 - 3x + 9;
		//                             Если x > 3,  y = 1 / (x^3 + 6).
		
        System.out.println("5: Вычислить значение функции. Если:");
		System.out.println(" x <= 3, y = x^2 - 3x + 9; ");
		System.out.println(" x > 3,  y = 1 / (x^3 + 6) ");
		
		
		double x = 1.5;
		double y;
		
		System.out.println(" x = " + x);
		
		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
			System.out.println("Ответ: x <= 3, y = " + y);
		}
		
		else {
			y = 1 / (Math.pow(x, 3) + 6);
			System.out.println("Ответ: x > 3, y = " + y);
		}
		
	}

}
