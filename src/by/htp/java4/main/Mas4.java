package by.htp.java4.main;

import java.util.*;

public class Mas4 {

	public static void main(String[] args) {

		int i = 0;
		int j = i;
		int x = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите четное число: ");

		while (!sc.hasNextInt()) {
			sc.next();
		}
		i = sc.nextInt();

		int[][] mas = new int[i][i];
		mas[0][0]=x;

		for (i = 0; i < mas.length; i++) {

			if (i % 2 == 1) {
				for (j = mas[i].length-1; j >= 0; j--) {
					mas[i][j] = x--;
					System.out.print(" " + mas[i][j]);
					
				}
				System.out.println();
				
				
				
				

			} else {
				for (j = 0; j < mas[i].length; j++) {
					mas[i][j] = x++;
					System.out.print(" " + mas[i][j]);
					
				}
				System.out.println();;
			}

		}

	}

	
}
