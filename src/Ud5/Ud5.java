package Ud5;
import java.util.Scanner;
public class Ud5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		// hacemos la formula
		if (numero % 2 == 0) {
			System.out.println("Sí es divisible entre dos");
		} else {
			System.out.println("NO es divisible entre dos");
		}
		sc.close();

	}

}
