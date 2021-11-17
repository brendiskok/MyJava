package by.sveta.les01.main;

public class Thirteen {

	public static void main(String[] args) {
		// Заданы координаты 3х вершин треугольника (x1, y1) (x2, y2) (x3, y3)
		// Найти его периметр и площадь.
		
	double x1 = -3;
	double y1 = -2;
	double x2 = -2;
	double y2 =  2;
	double x3 =  4;
	double y3 = -1;
	
	double a = Math.sqrt(Math.pow((y2-y1), 2) + Math.pow((x2 - x1), 2));
	double b = Math.sqrt(Math.pow((y2-y3), 2) + Math.pow((x3 - x2), 2));
	double c = Math.sqrt(Math.pow((y3-y1), 2) + Math.pow((x3 - x1), 2));
	
	double P = a + b + c;
	
	double p = P / 2;
	double S = Math.sqrt(p * Math.abs(p - a) * Math.abs(p - b) * Math.abs(p - c));
	
	
	System.out.printf("Периметр треугольника = " + "%.2f", P);
	System.out.println();
	System.out.printf("Площадь треугольника = " + "%.2f", S);
	}

}
