package by.klimash.part01.main;

public class SecondLinear {

	public static void main(String[] args) {
		// TODO  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		//(b + sqrt (b2 + 4 ac)) / (2a) - a3c +b(-2)
		
		double a = 2.0;
		double b = 4.0;
		double c = 3.0;
		double d = Math.pow(b, 2) + 4 * a * c;
		
				
		double result = (b + Math.sqrt(d)) / ( 2 * a ) - Math.pow(a, 3) * c + Math.pow(b, -2); 
		
		System.out.println(result);
		
	}

}
