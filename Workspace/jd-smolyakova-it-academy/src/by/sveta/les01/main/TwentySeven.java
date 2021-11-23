package by.sveta.les01.main;

public class TwentySeven {

	public static void main(String[] args) {
		// TODO Дано значение a. Не используя никаких операций, кроме умножения,
		// получить значение a10 за 4 операции
		
		int a = 2;
		a = a * a;
		int b = a;
		a = a * a;
		a = a * a;
		a = a * b;
		
		System.out.println(a);

	}

}
