package by.sveta.les06Decomposition.main;

public class Decomposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = SofHexagon(1.9);
		
		System.out.println(a);

	}
	
	public static double SofTriangleTaskOne (double x1, double y1, double x2, double y2, double x3, double y3) {
		
		//1: заданы координаты вершин треугольника, найти площадь треугольника
		
		double a = SidesofTriangle(x1, y1, x2, y2);
		double b = SidesofTriangle(x3, y3, x2, y2);
		double c = SidesofTriangle(x3, y3, x1, y1);
		
		double S = SofTriangleBy3Sides(a, b, c);
		
		if (S == 0) {
			System.out.println("Введенные координаты соответствуют прямой, это не треугольник");
			return 0;
		}
		
		else {
		
			return S;
		}
		
	}
	
	public static double SidesofTriangle (double x1, double y1, double x2, double y2) {
		//поиск длины стороны треугольника для задания 1 исходя из координат вершин треугольника
		//Справочно: Задание 1 - заданы координаты вершин треугольника, найти площадь треугольника
		
		double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
				
		return a;
				
	}
	
	public static double SofTriangleBy3Sides (double a, double b, double c) {
		//1:заданы координаты вершин треугольника, найти площадь треугольника
		
				
		double p = (a + b + c) / 2;
		
		double S = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
		
		return S;
				
	}
	public static int NOD1 (int A, int B) {
		//2:метод для нахождения НОД натуральных чисел А и В, первый вариант
		
		int c;
		int d;
		int counter;
		int NOD;
		
		if ( (A != 0) && ( B != 0)) { 
		
		//исключаем влияние знака, оперируем модулем чисел А и В
		A = Math.abs(A);
		B = Math.abs(B);
		
		//A > B для следующих операций
		if (B > A) {
			int C = A;
			A = B;
			B = C;
		}
		
		//находим НОД
		
		counter = B;
				
		do {
			
			c = B % counter;
			d = A % counter;
			
			NOD = counter;
			
			counter--;
		}
		
		while ((c != 0) || (d != 0));
		
		return NOD;
		}
		
		else {
			System.out.println("введите числа, отличные от 0");
			return 0;
		}
		}
		
	public static int NOD2 (int A, int B) {
		//2: метод для нахождения НОД натуральных чисел А и В, второй вариант
		
		if ((A != 0) || (B != 0)) {
		
		//исключаем влияние знака, оперируем модулем чисел А и В
				A = Math.abs(A);
				B = Math.abs(B);
				
				//A > B для следующих операций
				if (B > A) {
					int C = A;
					A = B;
					B = C;
				}
				
				while (B != 0) {
					
					int C = B;
					B = A % B;
					A = C;
					
				}
				return A;
		}
		
		else {
			System.out.println("введите числа, отличные от 0");
			return 0;
		}
		
	}
	
	public static int NOK (int A, int B) {
		
		//2: метод для нахождения НОК натуральных чисел А и В
		
		int NOK = A * B / NOD2(A, B);
		return NOK;
	}
	
	public static int NODforFour (int a, int b, int c, int d) {
		
		// 3: метод для нахождения НОД четырех натуральных чисел
		
		int NOD = NOD2( NOD2 (a, b), NOD2 (c, d));
		
		return NOD;
	}
	
	
	public static int NOKforThree (int a, int b, int c) {
		
		//4: метод для нахождения НОК трех натуральных чисел
		
		int NOK = NOK( NOK( a , b), c);
		
		return NOK;
		
	}
	
	
	public static double SumOfLargerOrLess (double a, double b, double c) {
		
		//5: нахождение суммы большего и меньшего из трех чисел
		
		double sum = Math.max(Math.max(a, b), c) + Math.min(Math.min(a, b), c);
		return sum;
		
	}
	
	
	public static double SofHexagon (double a) {
	
	// 6: вычислить площадь правильного шестиугольника со стороной а,
	// используя метод вычисления площади треугольника
		
		
		double S = 6 * SofTriangleBy3Sides(a, a, a);
		
		return S;
	
		
		
	}
	
	
	
	
	public static int NumberOfDigitsCounter (int a) {
		
		//считает количество цифр в числе
		
		int length = 0;
		
		while ( a > 0 ) {
			
			length++;
			a = a / 10;
		}
		
		return length;
	}
	
	
	}
	


