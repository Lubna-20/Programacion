package MisClases;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Juego juego=new Juego();
		Scanner teclado=new Scanner(System.in);
		
		boolean salir=false;
		
		while(salir==false)
		
			/// Muestro el menú al usuario
			System.out.println("----------MENU----------");
			System.out.println("1 - Nueva partida");
			System.out.println("2 - Modificar tiempo espera entre valor (actual 1000)");
			System.out.println("3 - Ver número máximo de aciertos en la actual ejecución");
			System.out.println("4 - Salir");	
			
			int valor=teclado.nextInt(); 
			if(valor==1) {
				juego.nuevaPartida();
				
			}
			else if(valor==2) {
				
			}
			if(valor==4) {
				salir=true;
			}
		
	
	/*String cadena="1234123";
	
	for(int i=0;i<cadena.length();i++) {
		
		char caracter=cadena.charAt(i);
		System.out.print(caracter);
		try {
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			//TODO Auto-generated catch block
				e.printStackTrace();
		}
			System.out.print("\b");
		}
*/	
	
		}

}
