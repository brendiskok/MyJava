package by.sveta.les01.main;

public class TwentyOne {

	public static void main(String[] args) {
		// TODO Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
		// Поменять местами дробную и целую части числа и вывести полученное значение числа.

		double x = 222.333;
		
		double a = (int) (x * 1000 % 1000) ;
		double b = (int) x;
		
		double y = a + b / 1000;
		
		System.out.println("Начальное число = " + x);
		System.out.println("Конечное число = " + y);
		
		
		//one more variant
		double k = 555.222;
		double l = k * 1000;
		double m = l % 1000;
		double n = (l - m) / 1000;
		double o = m + n / 1000;
		
		System.out.println("Начальное число = " + k);
		System.out.println("Конечное число = " + o);
	}

}
