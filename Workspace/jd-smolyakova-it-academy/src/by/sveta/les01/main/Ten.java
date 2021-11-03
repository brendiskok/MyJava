package by.sveta.les01.main;

public class Ten {

	public static void main(String[] args) {
		// TODO (sin x + cos y) / (cos x - sin y) * tg xy
		
		double x = 1.2;
		double y = - 0.3 ;
		
		double res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println(res + " rad");

	}

}
