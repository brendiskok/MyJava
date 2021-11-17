package by.sveta.les01.main;

public class Sixteen {

	public static void main(String[] args) {
		// Найти произведени цифр заданного четырехзначного числа
		
		int x = 1234;
		double check = x;
		double lastNumber = 0;
		double result = 1;
		int i = 0;
				
		while (check > 0) {
		
			lastNumber = (x - lastNumber) / Math.pow(10, i) % 10;
			result = result * lastNumber;
			i++;
			check = (check - lastNumber) * Math.pow(10, i);
			System.out.println(lastNumber + result);
			 		}
		

	}

}
