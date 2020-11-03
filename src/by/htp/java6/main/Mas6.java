package by.htp.java6.main;

import java.util.*;

public class Mas6 {

	public static void main(String[] args) {
		int i = 0;
		int j = i;
		int x = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите четное число: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		i = sc.nextInt();

		if (i % 2 == 0) {

			int[][] mas = new int[i][i];

			for (i = 0; i < mas.length; i++) {
				for (j = 0; j < mas[i].length; j++) {

					if (i == 0 || i == mas.length - 1) {
						mas[i][j] = x;
					}

					if (j == 0 || j == mas[i].length - 1) {
						mas[i][j] = x;
					}

					System.out.print(" " + mas[i][j]);

				}

				System.out.println();

			}

		} else {
			System.out.println("Вы ввели нечетное число");
		}

	}

}
