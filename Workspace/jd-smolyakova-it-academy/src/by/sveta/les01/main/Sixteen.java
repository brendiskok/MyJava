package by.sveta.les01.main;

public class Sixteen {

	public static void main(String[] args) {
		// Найти произведени цифр заданного четырехзначного числа
		
		int x = 1234;
		int check = x;
		int lastNumber = 0;
		int result = 1;
		int i = 0;
				
		while (check > 0) {
		
			lastNumber = (x - lastNumber) / (int) Math.pow(10, i) % 10;
			result = result * lastNumber;
			i++;
			check = check - (lastNumber * (int) Math.pow(10, (i - 1)));
		
		}
		
		
		System.out.println("произведение цифр заданного числа 1234 = " + result);

	}

}
