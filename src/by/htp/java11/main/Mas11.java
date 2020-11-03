package by.htp.java11.main;

import java.util.*;

public class Mas11 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int count = 0;
		// int n=0;
		int[][] mas = new int[10][20];

		// Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Введите количество срок:"); while (!sc.hasNextInt()) {
		 * sc.next(); } i = sc.nextInt();
		 * 
		 * System.out.println("Введите количество cтолбцов:"); while (!sc.hasNextInt())
		 * { sc.next(); } j = sc.nextInt();
		 */

		init(mas);
		print(mas);
		
		for (i = 0; i < mas.length; i++) {
			for(j= 0; j<mas[i].length-1; j++) {
			
				if (mas[i][j] == 5) {
				count++;}
						
			}if (count >= 3) {i++;
		System.out.println("Число 5 повторяется в строках " +i);}
			
			count = 0;
					
			}
		
		

		
	}

	public static void init(int[][] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(10);
			}
			System.out.println();
		}
	}

	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%2d ", ar[i][j]);
			}
			System.out.println();
		}

	}

}
