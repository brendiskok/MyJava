package by.sveta.les01.main;

public class TwentyThree {

	public static void main(String[] args) {
		// Найти площадь кольца, внутренний радиус которого = r,
		// а внешний R (R > r)
		
		double r = 2.0;
		double R = 3.0;
		
		double S1 = Math.PI * Math.pow(r, 2);
		double S2 = Math.PI * Math.pow(R, 2);
		
		double ringS = S2 - S1;
		
		System.out.printf("Площадь кольца = " + "%.2f", ringS);

	}

}
