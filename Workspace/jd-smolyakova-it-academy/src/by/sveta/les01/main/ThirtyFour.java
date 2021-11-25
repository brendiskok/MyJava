package by.sveta.les01.main;

public class ThirtyFour {

	public static void main(String[] args) {
		// TODO Дана величина А, выражающая объем информации в байтах.
		// Перевести А в более крупные единицы информации
		
		double A = 388439; //byte
		System.out.println("Объем информации А = " + A + " байт");
		
		A = A / 1024;   //Kbyte
		System.out.println("А = " + A + " Кбайт");
		
		A = A / 1024;   //Мbyte
		System.out.println("А = " + A + " Мбайт");
		
		A = A / 1024;   //Gbyte
		System.out.println("А = " + A + " Гбайт");
		
		A = A / 1024;   //Тbyte
		System.out.println("А = " + A + " Тбайт");

	}

}
