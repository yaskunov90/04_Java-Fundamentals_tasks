package by.htp.java9.main;

import java.util.*;

public class Mas9 {

	public static void main(String[] args) {

		int[] mas = { 1, 2, 3, 4, 5};
		int i = 0;
		int j = mas.length;

		for (i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		System.out.println("Новая матрица равна:");

		int[][] mas2 = new int[i][j];

		for (i = 0; i < mas2.length; i++) {
			for (j = 0; j < mas2[i].length; j++) {
			if (i == 0) {
				
				mas2[i][j] = mas[j];
				System.out.printf("%-6d ",mas2[i][j]);
			}else {
				mas2[i][j] = (int)Math.pow(mas[j], i+1);
				System.out.printf("%-7d",mas2[i][j]);
				
			}
				
				
				
				

			}

		
			System.out.println();
		}

	}
}