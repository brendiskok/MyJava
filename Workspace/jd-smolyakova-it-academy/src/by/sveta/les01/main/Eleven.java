package by.sveta.les01.main;

public class Eleven {

	public static void main(String[] args) {
		// TODO Вычислить периметр и площадь прямоугольного треугольника по длинам
		// a и b двух катетов
		
		double a = 2.1;
		double b = 3.4;
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		double P = a + b + c;
		double S = (a + b) / 2;
		
		System.out.println("Периметр треугольника = " + P);
		System.out.println("Площадь треугольника = " + S);
		
	}

}
