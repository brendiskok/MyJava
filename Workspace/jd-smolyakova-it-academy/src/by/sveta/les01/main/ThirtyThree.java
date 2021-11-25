package by.sveta.les01.main;

public class ThirtyThree {

	public static void main(String[] args) {
		// TODO Ввести любой символ и определить его порядковый номер, а также
		// указать предыдущий и последующий
		
		char c = 'Ф';
		int code = c;
		
		System.out.println("Символ " + c + ", его порядковый номер " + code);
		
		code--;
		char previous = (char)code;
		System.out.println("Предыдущий символ " + previous + ", его порядковый номер " + code);
		
		code = code + 2;
		char next = (char)code;
		System.out.println("Последующий символ " + next + ", его порядковый номер " + code);
		

	}

}
