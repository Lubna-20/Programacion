package MisClases;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tanque mitanque = new Tanque();
		Scanner teclado = new Scanner(System.in);

		boolean salir = false;
		while (salir == false) {
			System.out.println("----------------------------------------");
			System.out.println("1-Mostrar estado Tanque ");
			System.out.println("2-Mostrar estado Tanques ");
			System.out.println("3-Rellenar tanque ");
			System.out.println("4-Extraer tarnque");
			System.out.println("5- Mostrar resumen tipo combustible");
			;
			System.out.println("6- Salir");
			System.out.println("----------------------------------------");

			String opcion = teclado.nextLine();

			if (opcion.equals("1")) {

			}

			if (opcion.equals("2")) {

			}
			if (opcion.equals("3")) {
			}
			if (opcion.equals("4")) {

			}
			if (opcion.equals("5")) {

			}

			if (opcion.equals("6")) {
				salir = true;
			}
		}

	}

}
