package by.sveta.les01.main;

public class TwentySix {

	public static void main(String[] args) {
		// TODO Найти площадь треугольника, две стороны которого равны a и b, а угол между ними y
		
		double a = 2.0;
		double b = 3.0;
		
		// y - угол 30 градусов в радианах
		double y = Math.PI / 180 * 30;
		
		double S = 0.5 * a * b * Math.sin(y);
		
	System.out.printf("Площадь треугольника со сторонами " + a + " см и " + b + " см и углом между ними в 30 градусов = " + "%.2f", S);
	System.out.println(" см");
		

	}

}
