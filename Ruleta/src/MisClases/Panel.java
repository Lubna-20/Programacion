package MisClases;

public class Panel {
	//ATRIBUTOS
	String pista;
	String textoAdivinar;
	char[] estadoCasillas;
	
	//CONSTRUCTOR
	Panel(String p, String texto){
		pista=p.toUpperCase();
		textoAdivinar=texto.toUpperCase(); 
		
		
		estadoCasillas=textoAdivinar.toCharArray();
	//SUSTITUIMOS POR '-' TODOS LOS CARACTERES QUE NO SEAN 
		for(int i=0;i<estadoCasillas.length;i++) {
			char caracter=estadoCasillas[i];
			
			if(caracter!=' ' && caracter!='\n') {
				estadoCasillas[i]='-';
			}
			
		}
	}
		
		void mostrarEstadoActual() {
			System.out.println(pista);
			System.out.println("__________________________________\n"
					+ "");
			System.out.println(estadoCasillas);
		}
		
		int comprobarLetra(char letra){
			
			int numAciertos=0;
			//ME ASEGURO QUE LA LETRA PASADA ESTA EN MAYUSCULA
			letra=Character.toUpperCase(letra);
			
			
			for(int i=0;i<textoAdivinar.length();i++) {
				char caracter=textoAdivinar.charAt(i);
				
				if(caracter==letra) {
					numAciertos++;
					estadoCasillas[i]=caracter;
				}
			}
			return numAciertos;
			
		}
		
		
	}


