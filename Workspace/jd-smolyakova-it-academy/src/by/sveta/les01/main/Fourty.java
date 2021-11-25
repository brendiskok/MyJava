package by.sveta.les01.main;

public class Fourty {

	public static void main(String[] args) {
		// TODO за мин. количество операци вычислить: 
		// -2x + 3x^2 - 4x^3
		// 1 + 2x +3x^2 + 4x^3
		
		double x = 1;
		
		double a = 3 * x * x;
		double b = 2 * x + 4 * x * x * x;
		
		double result1 = a - b;
		double result2 = 1 + a + b;
		
				
				System.out.println(result1);
				System.out.println(result2);
	}

}
