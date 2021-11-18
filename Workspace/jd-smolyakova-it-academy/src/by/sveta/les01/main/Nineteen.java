package by.sveta.les01.main;

public class Nineteen {

	public static void main(String[] args) {
		// TODO Дана сторона равностороннего треугольникаю Найти площадь этого 
		// треугольника, его высоту, радиусы вписанной и описанной окружностей
		
		double a = 10.0;
		
		double S = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		double h = a * Math.sqrt(3) / 2;
		double r = a * Math.sqrt(3) / 6;
		double R = a * Math.sqrt(3) / 3;
		
		System.out.println("Равносторонний реугольник со стороной = " + a);
		System.out.printf("Площадь = " + "%.2f", S);
		System.out.println();
		System.out.printf("Высота = " + "%.2f", h);
		System.out.println();
		System.out.printf("Радиус вписанной окружности = " + "%.2f", r);
		System.out.println();
		System.out.printf("Радиус описанной окружности = " + "%.2f", R);
	}

}
