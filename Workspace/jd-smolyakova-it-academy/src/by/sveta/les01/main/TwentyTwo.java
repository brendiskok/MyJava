package by.sveta.les01.main;

public class TwentyTwo {

	public static void main(String[] args) {
		// TODO Дано натуральное число Т, которое представляет длительность прошедшего времени 
				// в секундах. Вывести данное значение длительности в часах, минутах и секундах 
				// в следующей форме: ННч ММмин SSc.
				
				int t = 4000;
				
				int h = t / 3600;
				int t1 = t - 3600 * h;
				
				int m = t1 / 60;
						
				int s = t1 - 60 * m; 
				
				// вывод полученных значений
				System.out.print(t + " c. = ");	
				
				if (h < 10) 
					System.out.print("0" + h + " ч. ");	
				else
					System.out.print(h + " ч. ");
				
				if (m < 10)
					System.out.print("0" + m + " мин. ");	
				else
					System.out.print(m + " мин. ");
				
				if (s < 10) 
					System.out.print("0" + s + " с. ");	
				else
					System.out.print(s + " с. ");

	}

}
