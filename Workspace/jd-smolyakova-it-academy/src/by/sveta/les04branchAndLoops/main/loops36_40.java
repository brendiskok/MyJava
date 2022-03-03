package by.sveta.les04branchAndLoops.main;

import java.util.Scanner;

public class loops36_40 {
	
	public static void main (String[] args) {
		
		//ThirtySix();
		ThirtyEight();
		//ThirtyNine();
	    //Fourty();
		
		
		
			
		}
	
	
	public static void ThirtySix() {
		
		////Два двузначных числа, записанных одно за другим,
		//образуют 4хзначное число, которое делится на их произведение
		//Найти эти числа
		
		System.out.println("36: ");
		
		int a = 10;
		int b = 10;
		double c = 0;
		double d = 0;
		
		for (; a < 100; a++) {
			
			for (; b < 100; b++) {
				
				c = a * 100 + b;
				d = c / (a * b);
				
				if ( (d - (int)d) == 0) {
					System.out.println("удовлетворяют условию числа: " + a + " и " + b);
					
				}
			
			}
			
			b = 10;
						
		}
	}
	
	public static void ThirtyEight() {
		
		//Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию.
		//Предполагается, что в числе не менее 3х цифр
		
		//запрос данных от пользователя
		
		Scanner ask = new Scanner (System.in);
		System.out.println("Введите натуральное число (не менее трех цифр): ");
		
		int startNumber = 0;
		
		if (ask.hasNextInt()) {
				
			startNumber = ask.nextInt();
		}
		
		else {
			System.out.println("Введено не натуральное число, перезапустите программу");
		}
		
		
		int startNumberNoLast = startNumber / 10;
		
		int each = 0;
		int eachPrevious = 0;
		
		int difference = (startNumber % 10) - (startNumberNoLast % 10);
		
		int differenceNext = 0;
		
		boolean checkNext = false;
		
		
		
		do {
			
			if (startNumberNoLast > 0) {
						
			
			each = startNumber % 10;
			
			eachPrevious = startNumberNoLast % 10;
						
			differenceNext = each - eachPrevious;
			
			if (differenceNext == difference ) {
				
				startNumber = startNumber / 10;
				startNumberNoLast = startNumberNoLast / 10;
				checkNext = true;
				
			//	System.out.println(startNumber + " - " + startNumberNoLast + " - " + checkNext);
			}
			
			
			else {
				
				checkNext = false;
				
			}
			
			
			}
			
			
			else {
				break;
			}
			
		}
		
		while (checkNext == true);
		
		
		
		if (checkNext == true) {
			
			System.out.println("цифры числа образуют арифметическую прогрессию");
		}
		
		
		else {
			
			System.out.println("цифры числа НЕ образуют арифметическую прогрессию");
		}
		
	}
	
	public static void ThirtyNine() {
		
		//В трехзначном числе зачеркнули старшую цифру. Когда полученное число
		//умножили на 7, то получили исходное числою Найти это число
		
		int a;
		int b;
		
		
		for (a = 100; a < 1000; a++) {
			
			b = (a % 100) * 7 ;
			
						
			if (a == b) {
				System.out.println(a + " удовлетворяет условию задачи");
			}
			
				
		}
		
	}
	
	public static void Fourty() {
		
		//Получить все числа, не превышающие заданного числа N, которые делятся без остатка
		//на все свои цифры
		
		
		//запрос предельного числа N от пользователя
		Scanner ask = new Scanner(System.in);
		
		System.out.println("40: Введите натуральное число: ");
		
		int N = 0;
		int b = 0;
		int c = 0;
		int each = 0;
		int counter;
		boolean noRemainder = false;
		
		if (ask.hasNextInt()) {
			N = ask.nextInt();
		}
		
		else {
			System.out.println("Введено не натуральное число, перезапустите программу.");
		}
		
		
		//цикл для проверки чисел до N на соответствие условию
		for	(counter = 1; counter <= N; counter++)	 {
			
			b = counter;
			c = b;
			
			while (b > 0) {
				each = b % 10;
				
				if (each != 0) {
				
					if ((c % each) == 0) {
					
						b = b / 10;
				   
						noRemainder = true;
				
					}
				
					else {
					
						b = 0;
						noRemainder = false;
					}
				}
				
			else {
				
				b = 0;
				noRemainder = false;
			}
				
				//System.out.println("проверяем число " + c + " noReminder = " + noRemainder);
			}	
			
			if (noRemainder == true) {
				
				System.out.println("number " + c);
			
			}
			
			
		}
		
		
	}

}

