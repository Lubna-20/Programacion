package MisEjercicos;

public class AplicacionSimon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/// Muestro el menú al usuario
		System.out.println(" 1 - Jugar a la versión 1");
		System.out.println(" 2 - Jugar a la versión 2 (con margen de errores)");			
		System.out.println(" 3 - Salir");	
		
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

}
