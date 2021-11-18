package by.sveta.les01.main;

public class TwentyFour {

	public static void main(String[] args) {
		// TODO Найти площадь равнобедренной трапеции с основаниями a и b
		// и углом A при большем основании a
		
		double a = 9.0;
		double b = 3.0;
		
		// угол 45 градусов в радианах (45*3,14)/180
		double A = 0.785;
		
		double c = (a - b) / 2;
		double tan = Math.tan(A);
		double h = c * tan;
		double S = (a + b) / 2 * h;
		
		
		System.out.println("Площадь трапеции = " + S);
	}

}
