package by.sveta.les01.main;
import java.util.Scanner;

public class TwentyEight {

	public static void main(String[] args) {
		// TODO Составить программу перевода  радианной меры угла в градусы, минуты и секунды 
		// точность вычсиления - 3 знака после запятой
		
		System.out.println("Введите значение угла в радианах: ");
		Scanner AskDegreesRad = new Scanner (System.in);
		double Rad = AskDegreesRad.nextDouble();
		
		
		while (Rad < 0) {
			System.out.println("Для радианной меры угла невозможно значение меньше 0, введите положительное значение меры угла: ");
			Rad = AskDegreesRad.nextDouble();	
		}
		
		
		if (Rad > 0) {
		double DegreesLong = 180 / Math.PI * Rad;
		
		// узнаем значение градусов, отсекая хвостик дабла (мин, сек)
		double DegreesShort = (int)DegreesLong;
		
		double ForMinutes = DegreesLong % DegreesShort;
		double MinutesLong = ForMinutes * 60;
		double Minutes = (int) MinutesLong;
		
		double Seconds = MinutesLong % Minutes * 60;
		Seconds = Math.ceil(Seconds * 1000) / 1000;
		
		if (DegreesShort > 360) {
			DegreesShort = DegreesShort - (360 * ( (int) (DegreesShort / 360)));
		}
		
		
		System.out.println("Угол " + Rad + " радиан = " + DegreesShort + " градусов " + Minutes + " минут "
				+ Seconds + " секунд.");
		}
		
		
		if (Rad == Math.abs(0))
			System.out.println("Угол 0 радиан = 0 радиан 0 градусов 0 минут.");
		
		
		AskDegreesRad.close();
			
	}

}
