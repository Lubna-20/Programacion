package MisClases;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EJERCICIO1
		BoletinEjercicios ejercicios = new BoletinEjercicios();
		
	if(ejercicios.esPalindromo("ojo") ==true)
			System.out.println("Es àlindromo");
		else
			System.out.println("No es palindromo");

		
		
		System.out.println(ejercicios.invertirMayusculasMinusculas("Fernando García Castillo"));
		System.out.println(ejercicios.quitarEspacio("Fernando García Castillo"));
		System.out.println(ejercicios.devolverIniciales("Fernando García Castillo"));
		System.out.println(ejercicios.contarNumVeces("Fernando García Castillo",'F'));
		System.out.println(ejercicios.numPalabras("HOLA...   QUE TAL ,"));
		//System.out.println(ejercicios.numVecesIncluidas("Fernando García Castillo",'2'));
		System.out.println(ejercicios.numMaximoUnos("1100010001000101111001"));
		
	}
	


	}


