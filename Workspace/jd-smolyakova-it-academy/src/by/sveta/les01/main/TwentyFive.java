package by.sveta.les01.main;

public class TwentyFive {

	public static void main(String[] args) {
		// TODO Вычислить корни квадратного уравнения ax2+bx+c=0
		// с заданными коэффициентами a, b, c (предположим, что а не равно 0
		// и дискриминант уравнения неотрицательный)
		
		int a =  1;
		int b =  4;
		int c = -5;
		
		double D = Math.pow(b, 2) - 4 * a * c;
		
		if (D > 0) {
			double x1 = (-b + Math.sqrt(D)) / (2 * a);
			double x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println(" первый корень = " + x1);
			System.out.println(" второй корень = " + x2);
		}
		else
			System.out.println("D < = 0");
		
			

	}

}
