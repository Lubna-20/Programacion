package snippet;

public class Snippet {
	int opcionElegida=teclado.nextInt();
				switch(opcionElegida)
				{
				case 1:
						juego.jugarPartida();
						break;
				case 2:
						juego.jugarPartidaV2();				
						break;
				case 3:
						salir=true;
						break;
				default:
						break;
				
				}
}

