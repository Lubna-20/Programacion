package MisClases2024;

import java.util.ArrayList;
import java.util.Iterator;

public class Hola {

	public static void main(String[] args) {

		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("hola");
		palabras.add("buenos dias");
		palabras.add(0, "Feliz Año");

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		numeros.add(125);
		numeros.add(307);
		numeros.add(100);

		numeros2.add(10);
		numeros2.add(20);

		numeros.addAll(0, numeros2);
		
		System.out.println();
		
		
		System.out.println(numeros);

		/*for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

		for (int elemento : numeros) {
			System.out.println(elemento);
		}
*/
	}

}
