package MisClases;

import java.util.Scanner;

public class Agenda {

	//Atributos
	DatosPersona[] agenda;
	Scanner teclado;

	
	 Agenda(int numEntradas) {
	
		agenda=new DatosPersona[numEntradas];
		teclado=new Scanner(System.in);
	 }
	
	 int insertarEntrada() {
		 
		 boolean encontrado=false;
		 int i=0;
		 
		 //BUSCAMOS EL PRIMER HUECO VACIO EN LA AGENDA
		 for( i=0;i<agenda.length;i++) {
			 if(agenda[i]==null) {
				 encontrado=true;
				 break; 
			 }
		 }
		 
		 if(encontrado==true ) {
			 //HE ENCONTRADO EL ELEMENTO
			 //LE PEDIOMOS AL USUARIO LOS DATOS DEL NUEVO REGISTRO
			
			 
			 System.out.println("Introduce el nombre");
			 String nombre=teclado.nextLine(); 
			 
			 System.out.println("Introduce la direccion");
			 String direccion=teclado.nextLine(); 
			 
			 System.out.println("Introduce el numero Fijo");
			 String fijo=teclado.nextLine(); 
			 
			 System.out.println("Introduce el numero Movil");
			 String movil=teclado.nextLine(); 
			 
			 System.out.println("Introduce el email");
			 String eMail=teclado.nextLine(); 
			 	
			 //CREAAMOS UN OBJETO DE LA CLASE DatosPersona
			 
			 DatosPersona nuevoRegistro=new DatosPersona(nombre, direccion, fijo, movil, eMail);
			 //iNSERTO EL OBJETO EN LA POSICION BUSCADA EN LA AGENDA
			 agenda[i]=nuevoRegistro;
			 return i;
		 }
		 else {
			 //LA AGENDA ESTABA LLENA
			 	return -1;
		 }
	 }
	 
	 public void buscarAgenda() {
		 System.out.println("Introduce el termino de busqueda: ");
		 String termino=teclado.nextLine();
		 termino=termino.toUpperCase();
		 for(int i=0;i<agenda.length;i++) {
			 if(agenda[i]!=null) {
				 boolean deboMostrar=false;
				 if(agenda[i].getNombre().toUpperCase().contains(termino))
					 deboMostrar=true;
				 else if(agenda[i].getNumMovil().toUpperCase().contains(termino))
					 deboMostrar=true;
				 else if(agenda[i].getNumFijo().toUpperCase().contains(termino))
					 deboMostrar=true;
				 else if(agenda[i].getEmail().toUpperCase().contains(termino))
					 deboMostrar=true;
				 
				 if(deboMostrar==true)
					 System.out.println(i + " - "+ agenda[i].formatoCorto());
			 }
		 }
	 }
	 
	public void mostrarEntradasAgenda(){
	//RECORREMOS LAS DIFERENTES ENTRADAS DE LA AGENDA
		System.out.println("---------------------------------------------\n");
		for(int i=0; i< agenda.length;i++) {
			
			if(agenda[i]!= null){
				//MUESTROLOS DATOS DE LA ENTRADA
				System.out.println(i + " - "+ agenda[i].formatoCorto());
			}	
		}
		System.out.println("---------------------------------------------\n");
	}
	public int  modificarEntrada() {
		int entradaModificada=-1;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el indice de la entrada a modificar : ");
		int numero=teclado.nextInt();
		teclado.nextLine();
		
			if(agenda[numero]!=null) {
				System.out.println("Introduce el nombre : (" + agenda[numero].getNombre() + " )");
				String nombre=teclado.nextLine(); 
				if (!nombre.isEmpty())
					agenda[numero].setNombre(nombre);
				System.out.println("Introduce la dirrecion : (" + agenda[numero].getDireccion() + " )");
				String dirrecion=teclado.nextLine(); 
				if (!dirrecion.isEmpty())
					agenda[numero].setDireccion(dirrecion);
				System.out.println("Introduce el numero fijo : (" + agenda[numero].getNumFijo() + " )");
				String numfijo=teclado.nextLine(); 
				if (!numfijo.isEmpty())
					agenda[numero].setNumFijo(numfijo);
				System.out.println("Introduce el numero movil : (" + agenda[numero].getNumMovil() + " )");
				String numMovil=teclado.nextLine(); 
				if (!numMovil.isEmpty())
					agenda[numero].setNumMovil(numMovil);
				System.out.println("Introduce el email : (" + agenda[numero].getEmail() + " )");
				String email=teclado.nextLine(); 
				if (!email.isEmpty())
					agenda[numero].setEmail(email);
				
			}
		else System.out.println("La entrada seleccionada no tiene datos");

		return entradaModificada;
	
	}
		
	
	public int  borrarEntrada() {
		int entradaBorrada=-1;
		
		System.out.println("Introduce el indice de la entrada a borrar : ");
		int numero=teclado.nextInt();
		teclado.nextLine();
		
		if(agenda[numero]!=null) {
			agenda[numero]=null;
			entradaBorrada=numero;
			System.out.println("La entrada " + numero + "se borro correctamente");
			


		}
		else System.out.println("La entrada seleccionada no tiene datos");

		return entradaBorrada;
	
	}
		
	 
	 
	//Metodos
}
