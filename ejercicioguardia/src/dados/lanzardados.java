package dados;

import java.util.Random;

public class lanzardados {

	
	int lanzarDado(int numVeces, int valor) {
		
		Random dado = new Random();
		
		int contador=0;
	
		
		for(int i=0; i<numVeces;i++ ) {
			int resultado=dado.nextInt(1,7);
			
			if(resultado == valor)
				contador++;
		}
		
	
		/*BUCLE WHILE
		 * int i =0;
		while( i<numVeces) {
			int resultado=dado.nextInt(1,7);
			
			if(resultado == valor)
				contador++;
			i++;
	
	}*/
		return contador;
}
}
 