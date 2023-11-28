package MisClases;

import java.util.Random;

public class Juego {

	//ATRIVUTOS
	final int NUM_JUGADORES=3;
	int turnoActual;
	final int NUM_PANELES=7;
	
	Jugador[] jugadores;
	
	//METODOS
	
	 Juego() {
		 //CREAMOS EL ARRAY PARA LOS JUGADORES
		jugadores=new Jugador[NUM_JUGADORES];
		
		//ASIGNAMOS EL TURNO INICIAL ALEATORIAMENTE
		Random numeroAleatorio=new Random();
		turnoActual=numeroAleatorio.nextInt(0,NUM_JUGADORES);
		
	}
	 
	 
	void  cambiarTurno() {
		turnoActual++;
		if(turnoActual==NUM_JUGADORES)
			turnoActual=0;
	}
	
	void partida() {
		for (int i=0;i<NUM_PANELES;i++) {
			//CREAMOS EL PANEL CON EL QUE VAMOS A JUGAR 
			Panel miPanel=new Panel("Te has echo mayor si...",
					"Si usas\n pantuflas y bata");
			//MOSTRAMOS EL ESTADO DEL PANEL
			miPanel.mostrarEstadoActual();
			
			mostrarMenuTipo1();
		}
	}
	
}
