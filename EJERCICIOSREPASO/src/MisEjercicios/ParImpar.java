package MisEjercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		int numero= scanner.nextInt();
		
		if (numero % 2==0) {
			System.out.println(numero + " es un numero par");

		} 
		
		else {
			System.out.println(numero + " es un munero impar");
		}
			
		scanner.close();	}

}
