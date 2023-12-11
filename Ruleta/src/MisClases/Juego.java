package MisClases;

import java.util.Random;
import java.util.Scanner;

public class Juego {

	// ATRIVUTOS
	final int NUM_JUGADORES = 3;
	int turnoActual;
	final int NUM_PANELES = 7;

	Jugador[] jugadores;

	// METODOS

	Juego() {
		// CREAMOS EL ARRAY PARA LOS JUGADORES
		jugadores = new Jugador[NUM_JUGADORES];

		for (int i = 0; i < NUM_JUGADORES; i++) {
			jugadores[i] = new Jugador(i + 1);
		}

		// ASIGNAMOS EL TURNO INICIAL ALEATORIAMENTE
		Random numeroAleatorio = new Random();
		turnoActual = numeroAleatorio.nextInt(0, NUM_JUGADORES);

	}

	void cambiarTurno() {
		turnoActual++;
		if (turnoActual == NUM_JUGADORES)
			turnoActual = 0;
	}

	void partida() {
		Ruleta ruletaJuego = new Ruleta();
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < NUM_PANELES; i++) {
			// CREAMOS EL PANEL CON EL QUE VAMOS A JUGAR
			Panel miPanel = new Panel("Te has echo mayor si...", "Si usas\n pantuflas y bata");
			// MOSTRAMOS EL ESTADO DEL PANEL
			miPanel.mostrarEstadoActual();

			int opcion = mostrarMenuTipo1();

			if (opcion == 1) {
				// LANZAMOS LA RULETA
				ruletaJuego.lanzarRuleta();
				String tirada = ruletaJuego.getValorActual();
				switch (tirada) {
				case "Quiebra":
					// LE PONEMOS EL DINERO DEL PANEL A CERO
					jugadores[turnoActual].setDineroPanelCero();
					cambiarTurno();
					break;
				case "Pierde turno":
					cambiarTurno();
					break;
				case "Comodin":
					jugadores[turnoActual].incrementarComodines();
					break;
				default:
					// VALOR NUMERICO
					int cantidad = Integer.parseInt(tirada);
					// LE PEDIMOS AL USUARIO QUE ELIJA UNA LETRA
					System.out.println("Elije una letra: ");
					String seleccion = teclado.nextLine();
					char caracter = seleccion.charAt(0);
					int numAciertos = miPanel.comprobarLetra(caracter);
					if (numAciertos == 0) {
						// EL USUARIO
						cambiarTurno();
					} else {
						jugadores[turnoActual].incrementarDineroPanel(numAciertos * cantidad);
					}
					break;
				}
			} else if (opcion == 2) {
				// COMPROBAR VOCAL
			} else if (opcion == 3) {
				// RESOLVER PANEL
			}
		}
	}

	int mostrarMenuTipo1() {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		int opcion = 0;
		while (salir == false) {
			// MOSTRAMOS LAS DISTINTAS POCIONES POR PANTALLA
			System.out.println("1-Tirar ruleta. \n2-Comprobar voval. \n3-Resolver Panel");
			opcion = teclado.nextInt();
			teclado.hasNextLine();
			if (opcion >= 1 && opcion <= 3)
				salir = true;

		}

		return opcion;
	}
}
