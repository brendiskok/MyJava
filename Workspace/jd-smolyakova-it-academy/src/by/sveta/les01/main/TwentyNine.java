package by.sveta.les01.main;

public class TwentyNine {

	public static void main(String[] args) {
		// TODO Найти в радианах (точность 3 знака) и градусах все углы треугольника
		// со сторонами a, b, c
		
		double a = 3.0;
		double b = 4.0;
		double c = 5.0;
		
		
		double ForCRad = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / ( 2 * b * c);
		double CRad = Math.ceil(Math.acos(ForCRad) * 1000) / 1000;
		
		double ForARad = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / ( 2 * a * c);
		double ARad = Math.ceil(Math.acos(ForARad) * 1000) / 1000;
		
		double BRad = Math.ceil((Math.PI - ARad - CRad) * 1000) / 1000;
		
		double CDegrees = (int) (180 / Math.PI * CRad);
		double ADegrees = (int) (180 / Math.PI * ARad);
		double BDegrees = 180 - CDegrees - ADegrees;
		
		System.out.println("Углы треугольника со сторонами " + a + " см, "+ b + " см, "+ c + " см: ");
		System.out.println("в радианах:" + CRad + " " + ARad + " " + BRad);
		System.out.println("в градусах:" + CDegrees + " " + ADegrees + " " + BDegrees);
		
		

	}

}
