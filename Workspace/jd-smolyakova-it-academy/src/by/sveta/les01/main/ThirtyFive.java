package by.sveta.les01.main;

public class ThirtyFive {

	public static void main(String[] args) {
		// TODO Даны натуральные числа M и N. Вывести старшую цифру дробной
		// части и младшую цифру целой части числа  M / N (точность - 5 знаков)
		
		double M = 74448;
		double N = 21;
		
		double result = M / N;
		System.out.println(M + " / " + N + " = " + result);
		
		double целаяЧасть = (int) result;
		System.out.printf("Целая часть: " + "%.0f", целаяЧасть);
		System.out.println();
		
		double дробнаяЧасть = Math.round((result - целаяЧасть) * 100000) ;
		
		
		int min = (int) (целаяЧасть % 10);
				
		while (целаяЧасть > 0.99) {
			int n = 1;
			
			int forMin = (int) (целаяЧасть % 10);
			if (min > forMin)
				min = forMin;
			целаяЧасть = (int) (целаяЧасть / Math.pow(10, n));
			n++;
		}
		System.out.println("Минимальное число целой части: " + min);
		
		System.out.printf("Дробная часть (точность 5 знаков): " + "%.0f", дробнаяЧасть);
		System.out.println();
		int max = (int) (дробнаяЧасть % 10);
		
		while (дробнаяЧасть > 0.99) {
			int m = 1;
			
			int forMax = (int) (дробнаяЧасть % 10);
			if (max < forMax)
				max = forMax;
			дробнаяЧасть = (int) (дробнаяЧасть / Math.pow(10,  m));
			m++;
		}
		
		System.out.println("максимальное число дробной части: " + max);	
				
		
		
		}
		

	}


