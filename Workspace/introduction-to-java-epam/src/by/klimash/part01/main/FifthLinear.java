package by.klimash.part01.main;



public class FifthLinear {

	public static void main(String[] args) {
		// TODO Дано натуральное число Т, которое представляет длительность прошедшего времени 
		// в секундах. Вывести данное значение длительности в часах, минутах и секундах 
		// в следующей форме: ННч ММмин SSc.
		
		int t = 4000;
		
		int h = t / 3600;
		int t1 = t - 3600 * h;
		
		int m = t1 / 60;
				
		int s = t1 - 60 * m; 
		
		System.out.println(t + " c. = " + h + " ч. " + m + " мин. " + s + " с.");
		
		
			
		
	}

}
