package by.sveta.les01.main;

public class Twelve {

	public static void main(String[] args) {
		// TODO Вычислить расстояние между двумя точками с данными
		// координатами (x1, y1) (x2, y2)

		double x1 = -1.0;
		double y1 =  1.0;
		double x2 =  2;
		double y2 = -2;
		
		double a = Math.abs(x2 - x1);
		double b = Math.abs(y1 - y2);
		
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
		
		System.out.println("Расстояние между точками = " + c);
	}

}
