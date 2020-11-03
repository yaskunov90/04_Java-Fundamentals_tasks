package by.htp.java8.main;

import java.util.*;

public class Mas8 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		

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
					if (i == 0) {
						mas[i][j] = j+1;

						

					} else if (i > 0 && j < mas[i].length-1) {

						mas[i][j] = mas[i - 1][j + 1];
					}

					System.out.printf("%-3d  ", mas[i][j]);

				}
				
System.out.println();
			}
			
			
			
		    }
			

		

		else {
			System.out.println("Вы ввели нечетное число");
		}

	}
}
