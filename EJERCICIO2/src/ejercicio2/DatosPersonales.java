package ejercicio2;

public class DatosPersonales {


	// Atributos
	String nombre;
	String direccion;
	int edad;
	double altura;  
	
	
	// Métodos
	
	// Constructores
	
	DatosPersonales() {
		nombre="Desconocido";
		direccion="C/ Sin nombre nº 1";
		edad=35;
		altura=1.75;
	}
	
	DatosPersonales(String nom, String dir, int ed, double al) {
		nombre=nom;
		direccion=dir;
		edad=ed;
		altura=al;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	void mostrarDatos() {
		System.out.println("El nombre de la persona es " + nombre);
		System.out.println("La direccion  es " + direccion);
		System.out.println("La edad de la persona  es " + edad);
		System.out.println("La altura de la persona es " + altura);
		
	}
	
	public static void main(String[] args) {
		
		DatosPersonales per1 = new DatosPersonales();
		per1.setNombre("lola");
	}

}
