package by.htp.java2.main;

import java.util.*;

public class Mas2 {
	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int k = 0;
		int p = 0;
		
		int[][] mas = new int[8][4];

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите требуемую строку: ");

		while (!sc.hasNextInt()) {
			sc.next();
		}
		k = sc.nextInt();

		System.out.println("Введите требуемый столбец: ");

		while (!sc.hasNextInt()) {
			sc.next();
		}
		p = sc.nextInt();

		init(mas);
		print(mas);

		if (k >= 0 && k <= mas.length) {
			for ( j = 0; j < mas[i].length; j++) {
				System.out.print (" " +mas[k][j]);}
			
		}

		else {
			System.out.println("Такой строки не существует!");
		}
		
		
		System.out.println (" ");
		
		
		if (p >= 0 && p <= mas[i].length) {
			for (i = 0; i < mas.length; i++) {
				System.out.print (" " +mas[i][p]);
				
			}
			
		}
		else {System.out.println("Такого столбца не существует!");}
		
		
		
		
		
	}

	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%5d ", ar[i][j]);
			}
			System.out.println();
		}

	}

	public static void init(int[][] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(1000);
			}
			System.out.println();
		}

	}

}
