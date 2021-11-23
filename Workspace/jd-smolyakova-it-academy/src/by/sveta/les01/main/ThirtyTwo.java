package by.sveta.les01.main;

public class ThirtyTwo {

	public static void main(String[] args) {
		// TODO текущее показание электронных часов: 22 ч. 24 мин. 30 сек.
		// Какое время они покажут через p ч., q мин., r сек.
		
		int hours = 23;
		int minutes = 24;
		int seconds = 30;
		
		int p = 10;
		int q = 105;
		int r = 265;
		
		seconds = seconds + r;
		if (seconds > 59) {
			int secondsLeft = seconds - 60;
			
			if (secondsLeft > 0 && secondsLeft < 60)
				minutes = minutes + 1;
			
			if (secondsLeft > 59)
				minutes = minutes + seconds / 60;
									
			seconds = seconds - 60 * (seconds / 60);
		}
		
		
		minutes = minutes + q;
		if (minutes > 0) {
			int minutesLeft = minutes - 60;
			
			if (minutesLeft > 0 && minutesLeft < 60)
				hours = hours + 1;
			
			if (minutesLeft > 59)
				hours = hours + minutes / 60;
				
			minutes = minutes - 60 * (minutes / 60);
		}
		
		hours = hours + p;
		if (hours > 23) 
			hours = hours - 24* (hours / 24);
		
		System.out.println("Текущее показание электронных часов: 22 ч. 24 мин. 30 сек.");
		System.out.println("Через " + p + " ч. " + q + " мин. " + r + " сек. часы покажут:");
	    System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " сек.");
			

	}

}
