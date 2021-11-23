package by.sveta.les01.main;

public class Thirty {

	public static void main(String[] args) {
		// TODO Три сопротивления R1, R2, R3 соединены параллельно. 
		// Найти сопротивление соединения R0 (точность - 3 знака).
		
		double R1 = 2.0;
		double R2 = 3.0;
		double R3 = 5.0;
		
		double R0 = Math.ceil (((R1 * R2 * R3) / (R2 * R3 + R1 * R3 + R1 * R2)) * 1000) / 1000;
		
		System.out.println("Сопротивление параллельного соединения (R1 = " + R1 + " (Ом) R2 = "+ R2 
				+ " (Ом) R3 = " + R3 + " (Ом)) = " + R0 + " (Ом)." );

	}

}
