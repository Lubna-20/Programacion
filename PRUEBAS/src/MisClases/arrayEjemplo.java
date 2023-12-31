package MisClases;

import java.util.Arrays;
import java.util.Random;

public class arrayEjemplo {

	
	
		public static int[] crearContenido(int numElementos) {

			int[] arAux=new int[numElementos];
			return arAux;
		}
		
		
		public static void cambiarContenido(int[] arDatos) {
			for(int i=0; i < arDatos.length; i++)
			{
				int valor=arDatos[i];
				arDatos[i]=valor+1;
			}
		}

		public static void mostrarContenido(int[] arDatos) {
			for(int i=0; i < arDatos.length; i++)
			{
				int valor=arDatos[i];
				System.out.println(valor);
			}
		}


		
		public static int posicionPrimeroMayor(int[] arDatos, int dato) {
			for(int i=0;i< arDatos.length; i++) {
				if(arDatos[i]>=dato)
					return i;
			}
			
			return arDatos.length;
		}

		public static int[] insertarArrayEnPosicion(int[] arDatos,int posicion, int dato) {
			
			// Creamos un array con el tamaño del original + 1
			int[] resultado=new int[arDatos.length+1];
			resultado[posicion]=dato;		
			
			int j=0;
			for(int i=0;i<arDatos.length;i++) {
				if(i==posicion)
				{
					j++;
				}
				
				resultado[j]=arDatos[i];
				j++;
			}
			return resultado;
		}
		
		
		public static int[] insertarFinalArray(int[] arDatos,int dato) {
			// Creamos un array con el tamaño del original + 1
			int[] resultado=new int[arDatos.length+1];
			
			// Copiamos los elementos del array original en el nuevo
			for(int i=0;i<arDatos.length;i++) 
				resultado[i]=arDatos[i];
					
			// Copio el nuevo dato
			resultado[resultado.length-1]=dato;
			return resultado;
		}
		
		public static int[] borrarPrimeraOcurrencia(int[] arDatos, int dato) {
			int posBorrar=-1;
			//Cpmpruebo si el elemento que quiero borrar esta en el array
				for(int i=0 ; i<arDatos.length; i++) {
					if(arDatos[i] == dato)
						posBorrar=i;
						break; //Me salgo del bucle
				}
				
		
				
				if(posBorrar !=-1) {
					//El elemento a borrar esta en el array
					
					//Creo un array con un elemento menos que el original
					int[] resultado =new int [arDatos.length-1]; 
					int j=0;
					for(int i=0;i<arDatos.length;i++) {
						if(i!=posBorrar) {
							resultado[j]=arDatos[i];
							j++;
						}
					}
 
					
				}
			
			int[] ressultado=new int[arDatos.length-1];
				
			 
}

		
		public static void main(String[] args) 
		{
			// Declaramos una variable de tipo array a enteros 
			// OJO El array todavía no está creado
	/*		int[] arNumeros=crearContenido(10);
			// Creamos el array y se lo asignamos a la variable anterior
			cambiarContenido(arNumeros);
			for(int i=0; i < arNumeros.length; i++)
			{
				int valor=arNumeros[i];
				System.out.println(valor);
			}
	*/
			int[] arNumeros= {1,30,100,200,400};
			
			int posicion=posicionPrimeroMayor(arNumeros,1000);
			int[] res=insertarArrayEnPosicion(arNumeros,posicion,1000);
			System.out.println(Arrays.toString(res));		
			
//			insertarFinalArray(arNumeros,1000);
			
//			System.out.println(Arrays.toString( insertarFinalArray(arNumeros,1000) ));		
//			System.out.println(Arrays.toString(arNumeros));		
			
	/*		Arrays.sort(arNumeros);
			System.out.println(Arrays.toString(arNumeros));		
			System.out.println(Arrays.toString(revertirArray(arNumeros)));		
	*/		
//			int[] res=revertirArray(arNumeros);
//			System.out.println(Arrays.toString(res));		

			
//			if(estaOrdenado(arNumeros)==true)
//				System.out.println("Está ordenado");
//		else System.out.println("No está ordenado");

//			int[] res=lanzarDado(1000);
//			System.out.println(Arrays.toString(res));		
			
			
//			int[] res=copiarArray(arNumeros);
//			System.out.println(Arrays.toString(arNumeros));
//			System.out.println(Arrays.toString(res));		
			
//			Arrays.sort(arNumeros);
//			System.out.println(Arrays.toString(arNumeros));
			
			
			
	/*		int[] resultado=contarParesImpares(arNumeros);
			
			System.out.println("El número de valores pares es :" + resultado[0]);
			System.out.println("El número de valores impares es :" + resultado[1]);		
	*/
		}
		
		public static String invertirCadena(String cadena) {

			String resultado="";
			for(int i=cadena.length()-1; i>=0; i-- ) {
				resultado=resultado + cadena.charAt(i);
			}
			return resultado;
		}
		
		public static int[] revertirArray(int[] arDatos) {
			
			int[] resultado=new int[arDatos.length];
			
			for(int i=0; i< arDatos.length; i++ ) {
//				resultado[i]=arDatos[i];  // Copia exacta
				resultado[arDatos.length-1-i]=arDatos[i]; // Copia revertida
			}
			return resultado;
		}
		
		
		
		
		
		public static boolean estaOrdenado(int[] arNumeros) {

			for(int i=1;i<arNumeros.length;i++) {
				if(arNumeros[i] < arNumeros[i-1])
					return false;
			}
			return true;

		}
		
		public static int[] lanzarDado(int numVeces) {

			// Las posiciones int del array se inicializan a 0
			int[] resultado=new int[6];		
		
			Random dado=new Random();
			for(int i=0;i<numVeces;i++)
			{
				int valor=dado.nextInt(1,7);  // Lanzamos dado
				resultado[valor-1]++;
			}
			return resultado;
		}
		
		
		
		
		
		
		
		
		public static int[] copiarArray(int[] arDatos) {
			
			int[] resultado=new int[arDatos.length];
			
			for(int i=0;i<arDatos.length;i++) {
				resultado[i]=arDatos[i];
			}
			
			return resultado;
		}
		
		
		public static int[] contarParesImpares(int[] arDatos) {
			int numPares = 0;
			int numImpares = 0;
	/*		
			for(int i=0;i<arDatos.length;i++) {
				int valor=arDatos[i];
				
			}
	*/		
			for (int valor : arDatos){
				
				if(valor%2==0)
					numPares++;
				else numImpares++;
			}
			
			int[] resultado= {numPares,numImpares};
			
	/*		int[] resultado= new int[2];
			resultado[0]=numPares;
			resultado[1]=numImpares;		
	*/		
			return resultado;
		}
		
		
	}