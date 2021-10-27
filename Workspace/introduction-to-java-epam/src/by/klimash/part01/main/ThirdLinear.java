package by.klimash.part01.main;

public class ThirdLinear {

	public static void main(String[] args) {
		// TODO Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		// (sin x + cos y) / (cos x - sin y) * tg xy
		
		double x = 1.57;
		double y = 1.047;
		double o = x * y;
				
		double z = (Math.sin(x) - Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(o);
		
		
		System.out.println(" (sin " + x + " - cos " + y + ") / (cos " + x + " - sin " + y + ") * tg (" + x + " * " + y + ") = " + z + " rad");
		
	}

}
