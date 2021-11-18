package by.sveta.les01.main;

public class Twenty {

	public static void main(String[] args) {
		// TODO Известна длина окружности. Найти площадь круга,
		// ограниченного этой окружностью
		
		// длина окружности
		double C = 1;
		
		double S = Math.pow(C, 2) / (4 * Math.PI);
		
		System.out.printf("площадь круга  = " + "%.2f", S);
		System.out.println();

	}

}
