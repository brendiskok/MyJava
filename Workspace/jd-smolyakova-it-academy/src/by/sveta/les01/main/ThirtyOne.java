package by.sveta.les01.main;

public class ThirtyOne {

	public static void main(String[] args) {
		// TODO Составить программу для вычисления пути, пройденного лодкой,
		// если ее скорость в стоячей воде y (км/ч), скорость течения реки V1 (км/ч)
		// время движения по озеру t1 (ч), а против течения t0 (ч)
		
		double y = 10.0;
		double V1 = 5.0;
		double t1 = 3.0;
		double t0 = 1.5;
		
		double SForward = (y + V1) * (t1 - t0);
		double SBack = (y - V1) * t0;
		double S = SForward + SBack; 
		
		System.out.println("Лодка прошла " + S + " км");

	}

}
