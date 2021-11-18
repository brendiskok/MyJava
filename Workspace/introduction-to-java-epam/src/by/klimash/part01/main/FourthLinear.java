package by.klimash.part01.main;

public class FourthLinear {

	public static void main(String[] args) {
		// TODO Дано действительное число R вида nnn.ddd три цифровых разряда 
		// в дробной и целой частях).Поменять местами дробную и целую части 
		// числа и вывести полученное значение числа.
		
		
        double x = 222.333;
		
		double a = x * 1000 % 1000 ;
		double b = (int) x;
		
		double y = a + b / 1000;
			
		System.out.println(a);
		System.out.println("Начальное число = " + x);
		System.out.println("Конечное число = " + y);
	}

}
