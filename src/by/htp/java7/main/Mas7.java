package by.htp.java7.main;

import java.util.*;

public class Mas7 {

	public static void main(String[] args) {

		int i = 0;
		int j = i;
		int x = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ������ �����: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		i = sc.nextInt();

		if (i % 2 == 0) {

			int[][] mas = new int[i][i];

			for (i = 0; i < mas.length; i++) {
				for (j = 0; j < mas[i].length; j++) {

					if (i < mas.length) {
						mas[i][j] = x;
						System.out.printf("%-3d ", mas[i][j]);

					}

				}
				x++;
				System.out.println();
			}

		} else {
			System.out.println("�� ����� �������� �����");
		}

	}

}