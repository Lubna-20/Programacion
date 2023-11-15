package MisClases;

public class BoletinEjercicios {
	
	/*EJERCICIO1 :ESCRIBE UN PROGRAMA QUE VERIFIQUE SI UNA CADENA ES UN PALÍNDROMO
	 (SE LEE IGUAL DE IZQUIERDA A DERECHA Y DE DERECHA A IZQUIERDA).*/
	boolean esPalindromoV2(String cadena) {
		return cadena.equals(invertirCadena(cadena));
	}
	
	
	
	boolean esPalindromo(String cadena) {
		
		int posIzquierda=0;
		int posDerecha=cadena.length()-1;
		
		boolean resultado=true;
		
		while(posIzquierda<posDerecha && resultado==true)
		{
			if(cadena.charAt(posIzquierda) != cadena.charAt(posDerecha) )
				resultado=false;
			
			posIzquierda++;
			posDerecha--;			
		}
		
		return resultado;
	
	}

	String invertirCadena(String cadena) {
		
		String resultado="";
		
		for(int i= cadena.length()- 1   ;i>= 0; i--)	{
			resultado+=cadena.charAt(i);
		}
		
		return resultado;
		
	}
	
	
	/* EJERCICO2: CREA UN MÉTODO QUE RECIBA COMO PARÁMETRO UNA CADENA Y CUENTE CUÁNTAS 
	VOCALES TIENE. OJO, HABRÍA QUE CONTABILIZAR TANTO MAYÚSCULAS COMO MINÚSCULAS Y 
	VOCALES CON TILDE.*/
		int contarVocales(String cadena) {
			//RECORREMOS LA CADENA DE IZQUIERDA A DERECHA
			 int numVocales=0;
			 
			 
			 //CONVERTIMOS LA CADENA QUE NOS PASEN A MINUSCULA PARA TENER QUE 
			 //HACER MENOS COMPROBACIONES
			 for(int i=0;i<cadena.length();i++)	{
					char caracter=cadena.charAt(i);
					if(caracter=='a' || caracter=='á'  || caracter=='à'  || caracter=='â' || 
					   caracter=='e' || caracter=='é'  || caracter=='è'  || caracter=='ê' ||
					   caracter=='i' || caracter=='í'  || caracter=='ì'  || caracter=='î' ||			   
					   caracter=='o' || caracter=='ó'  || caracter=='ò'  || caracter=='ô' ||			   
					   caracter=='u' || caracter=='ú'  || caracter=='ù'  || caracter=='û' || 
					   caracter=='ü' ) 			   
						numVocales++;
				}

				
				return numVocales;
		 	}
		
		/* EJERCICIO3: CREA UN MÉTODO QUE TOME UNA CADENA Y REEMPLACE TODAS LAS LETRAS 
		 * MINÚSCULAS POR MAYÚSCULAS Y VICEVERSA.*/
		String invertirMayusculasMinusculas(String cadena){
			
			String resultado="";
			
			String cadenaMinuscula=cadena.toLowerCase();
			String cadenaMayuscula=cadena.toUpperCase();		

			for(int i=0;i<cadena.length();i++)	{
				
				char caracterOriginal=cadena.charAt(i);
				char caracterMinuscula=cadenaMinuscula.charAt(i);
				if(caracterOriginal == caracterMinuscula)
				{
					// Está en minúscula
					resultado=resultado + cadenaMayuscula.charAt(i);
				}
				else 
				{
					// Está en mayúscula
					resultado=resultado + cadenaMinuscula.charAt(i);				
				}
			}
		
			return resultado;
		}
		
		/*EJERCICIO 4: DESARROLLA UN MÉTODO QUE TOME UNA CADENA 
		 *  Y ELIMINE TODOS LOS ESPACIOS EN BLANCO.*/
		String quitarEspacio(String cadena) {
			String resultado="";
			
			for (int i=0; i< cadena.length();i++) {
				
				char caracterLeido=cadena.charAt(i);
				
				if(caracterLeido != ' ') {
					resultado  = resultado  + caracterLeido;		
				}
			}
			return resultado;
			
		}
		/*EJERCICIO5: HAZ UN MÉTODO QUE DEVUELVA LAS INICIALES DE UN NOMBRE PASADOÇ
		   POR PARÁMETRO. POR EJEMPLO SI LE PASO “FERNANDO GARCÍA CASTILLO”, DEBERÍA 
		 DEVOLVER “F.G.C.”. */
		
		String devolverIniciales(String cadena) {
			String resultado ="";
			for (int i=0; i< cadena.length();i++) {
				
				char caracterLeido=cadena.charAt(i);
				
				if(caracterLeido!=' ') {
					if(i==0 || cadena.charAt(i-1) == ' ') {
						resultado=resultado+caracterLeido+".";
					}
				}
			}
			return resultado;
			
		}
		
		/*EJERCICIO6: ESCRIBE UN MÉTODO QUE TOME UNA CADENA Y CUENTE CUÁNTAS 
		 * VECES APARECE UNA LETRA O UN CARÁCTER ESPECÍFICO EN LA CADENA.*/
		
		int contarNumVeces(String cadena, char letra) {
			int contador=0;
			
			for (int i=0; i<cadena.length();i++) {
				char caracterLeido=cadena.charAt(i);
				if( caracterLeido==letra)
					contador++;
			}
			return contador;
			
		}
		
		/*EJERCICIO 7: ESCRIBE UN PROGRAMA QUE TOME UNA CADENA Y CUENTE CUÁNTAS
		 *  PALABRAS LA COMPONEN. COMO SEPARADOR DE PALABRAS SE CONSIDERARÁN LOS
		 *   CARACTERES: “. , : ; Y EL ESPACIO” */
		
		int numPalabras(String cadena) {
			boolean anteriorSeparador =true;
			int contador=0;
			
			for(int i=0; i<cadena.length();i++) {
				char caracterLeido=cadena.charAt(i);
				
			if(caracterLeido==' ' || caracterLeido=='.' || caracterLeido==',' ||
					caracterLeido==';' ||caracterLeido==':') 
				
				anteriorSeparador= true;
			
			else{
				if(anteriorSeparador==true)
					contador++;
				
				anteriorSeparador=false;
			}
			
		}
	
		return contador;
		}
		
		/*EJERCOICIO 8.ESCRIBE UN PROGRAMA QUE TOME UNA CADENA Y CUENTE CUÁNTAS VECES APARECE UNA
	PALABRA ESPECÍFICA EN ELLA.*/
		
		int numVecesIncluidas(String cadena, String palabra) {
			int contador=0;
			int posicion=cadena.indexOf(palabra);
		while(posicion!=-1) {
			contador++;
			posicion=cadena.indexOf(palabra,posicion+1);
			
		}
			return contador;
			
		}
		
		/*EJERCICIO9: IMPLEMENTA UN MÉTODO QUE RECIBA UNA STRING QUE SÓLO PUEDE CONTENER 0 Y 1. EL
	MÉTODO DEBE DEVOLVER EL NÚMERO MÁXIMO DE 1 SEGUIDOS QUE HAY. SI ALGUNO DE LOS
	CARACTERES NO ES UN 0 O UN 1, DEBE RETORNAR -1.*/
		int numMaximoUnos(String cadena) {
			
			int numUnosSeguidos=0;
			int numMaximo=0;
			
			for (int i=0;i < cadena.length();i++) {
				char caracter=cadena.charAt(i);
				
				if(caracter=='1') {
					numUnosSeguidos++; 
					if(numUnosSeguidos > numMaximo )
						numMaximo=numUnosSeguidos;
				}
				else if(caracter=='0') {
					numUnosSeguidos=0;
				}  
				else {
					return -1 ;//CADENA NO VALIDA PORQUE TIENE CARACTER DISTINTO  A 0 Y 1
				}
			}
			return numMaximo;
		}
		
		/*EJERCICIO 10:DESARROLLA UN MÉTODO QUE TOME UNA CADENA CON VARIAS PALABRAS Y DEVUELVA LA MISMA
	CADENA CON LAS PALABRAS EN ORDEN INVERSO.*/
		
		
}

