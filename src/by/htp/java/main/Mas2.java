package by.htp.java.main;

import java.util.*;

public class Mas2 {

	public static void main(String[] args) {

		int i=0;
		int j=i;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите размерность матрицы: ");

		while (!sc.hasNextInt()) {
			sc.next();
		}
		i = sc.nextInt();

		int[][] mas = new int[i][i];
		init(mas);
		print(mas);

		for(i = 0; i <= mas.length-1; i++) {
			if (i==j) {System.out.print (" " + mas [i][j]);}
			j++;
		}
		
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
