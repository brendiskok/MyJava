package by.sveta.les01.main;

public class Eight {

	public static void main(String[] args) {
		// TODO ((b + sqrt (pow (b,2) + 4 ac) / 2a) - pow(a,3)*c + 1/pow(b,2)
		
		double a = 1.0;
		double b = 1.0;
		double c = 1.0;
		
		double res = ( (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + 1 / Math.pow(b, 2);
		
		System.out.println(res);

	}

}
