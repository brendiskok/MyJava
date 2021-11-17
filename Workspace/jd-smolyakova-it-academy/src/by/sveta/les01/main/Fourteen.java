package by.sveta.les01.main;

public class Fourteen {

	public static void main(String[] args) {
		// TODO Вычислить длину окружности и площадь круга одного и того же 
		// заданного радиуса R.
		
		double R = 3.1;
		double P = 2 * R * Math.PI;
		double S = Math.PI * Math.pow(R, 2);
		
		System.out.printf( "Длина окружности = " + "%.2f", P);
		System.out.println();
		System.out.printf( "Площадь круга = " + "%.2f", S);

	}

}
