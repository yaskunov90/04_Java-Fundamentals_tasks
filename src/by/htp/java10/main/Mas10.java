package by.htp.java10.main;

import java.util.*;

public class Mas10 {

	public static void main(String[] args) {
		int i = 0;
		int j = i;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размерность матрицы: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		i = sc.nextInt();
		System.out.println("Новая матрица равна: ");
		if (i % 2 == 0) {

			int[][] mas = new int[i][i];
			int[] mas2 = new int[i];
           
			init(mas);// инициализация массива

			for (i = 0; i < mas.length; i++) {
				for (j = 0; j < mas[i].length; j++) {

					System.out.printf("%5d ", mas[i][j]);

					if (mas[i][j] > 0 && i == j) {

						mas2[i] = mas[i][j];
					}
					
									
				}

				System.out.println();

			}
			System.out.println("Положительные члены диагонали матрицы равны");

			for (i = 0; i < mas2.length; i++) {
				if (mas2[i] > 0) {
					System.out.printf("%5d", mas2[i]);
				}
			}

		} else {
			System.out.println("Вы ввели нечетное число");
		}

	}

	public static void init(int[][] ar) {
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = rand.nextInt(100) - 50;
			}
			System.out.println();
		}

	}

}
