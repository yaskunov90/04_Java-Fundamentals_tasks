package by.htp.java3.main;

import java.util.Random;
import java.util.Scanner;

public class Mas3 {

	public static void main(String[] args) {
		int m = 0;
		int n = 0;
		int[][] mas = new int[2][2];

		init(mas);
		print(mas);
		System.out.println("Новый массив");
		for (m = 0; m < mas.length; m++) {

			if (m % 2 == 1) {
				for (n = mas[m].length - 1; n >= 0; n--) {
					System.out.print(" " + mas[m][n]);
				}
				System.out.println();

			} else {
				for (n = 0; n < mas[m].length; n++)
					System.out.print(" " + mas[m][n]);
				System.out.println();
			}

		}

	}

	public static void print(int[][] ar) {
		for (int m = 0; m < ar.length; m++) {
			for (int n = 0; n < ar[m].length; n++) {
				System.out.printf("%5d ", ar[m][n]);
			}
			System.out.println();
		}

	}

	public static void init(int[][] ar) {
		Random rand = new Random();
		for (int m = 0; m < ar.length; m++) {
			for (int n = 0; n < ar[m].length; n++) {
				ar[m][n] = rand.nextInt(1000);
			}
			System.out.println();
		}

	}

}
