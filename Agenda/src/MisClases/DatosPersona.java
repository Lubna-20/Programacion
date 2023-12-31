package MisClases;


public class DatosPersona {

	//Atributos
	private String nombre;
	private String direccion;
	private String numFijo;
	private String numMovil;
	private String email;
	
	DatosPersona(String nom, String dir , String fijo,String movil, String mail) {
		nombre=nom;
		direccion=dir;
		numFijo=fijo;
		numMovil=movil;
		email=mail;
	}
	
	public  String formatoCorto() {
		String resultado;
		resultado= nombre + " (" + numFijo + "," + numMovil + " )";
		
		return resultado;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String valor){
		 nombre=valor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumFijo() {
		return numFijo;
	}

	public void setNumFijo(String numFijo) {
		this.numFijo = numFijo;
	}

	public String getNumMovil() {
		return numMovil;
	}

	public void setNumMovil(String numMovil) {
		this.numMovil = numMovil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
