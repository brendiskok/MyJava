package by.klimash.part01.main;

public class FourthLinear {

	public static void main(String[] args) {
		// TODO Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
		// Поменять местами дробную и целую части числа и вывести полученное значение числа.
		
		double a = 555.222;
		double b = a * 1000;
		double c = b % 1000;
		double d = (b - c) / 1000;
		double e = c + d / 1000;
		
		System.out.println("Начальное число = " + a);
		System.out.println("Конечное число = " + e);
	}

}
