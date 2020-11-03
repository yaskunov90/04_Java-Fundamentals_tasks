package by.htp.java12.main;

import java.util.*;

public class Mas12 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int count = 0;
		int n = 0;
		int m = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество срок:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		m = sc.nextInt();

		System.out.println("Введите количество cтолбцов:");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		n = sc.nextInt();

		int[][] mas = new int[m][n];

		init(mas);
		print(mas);

		
	}

	public static void init(int[][] ar) {
		Random rand = new Random();
		int count = 0;
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {
				if (j>=i) {
					ar[i][j] = 1;
				}else ar[i][j] = 0;

				//ar[i][j] = rand.nextInt(2);
				}

		}
		System.out.println();
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
