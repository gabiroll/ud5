package Ud5;

import java.util.Scanner;

public class Ud10 {
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		
			System.out.println("�Cu�ntos tipos de articulos?");
			int tiposArticulos = sc.nextInt();
		
			int total = 0;
			for (int i = 1; i <= tiposArticulos; i++) {
			System.out.println("�Cu�ntos art�culos del tipo " + i + "?");
			total += sc.nextInt();
		}

		System.out.println("Total art�culos : " + total);
		
		sc.close();
	}
}
