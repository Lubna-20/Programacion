package MisClases;

import java.util.ArrayList;

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

		numeros.addAll(numeros2);
	}

}
