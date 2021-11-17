package by.sveta.les01.main;

public class Fifteen {

	public static void main(String[] args) {
		// TODO Написать программу, которая выводит на экран первые четыре 
		// степени числа Пи
		
		for (int i = 1; i < 5; i++) {
			double PI = Math.pow(Math.PI, i);
			System.out.printf("Число Пи в степени " + i + " = " + "%.3f", PI);
			System.out.println();
		}

	}

}
