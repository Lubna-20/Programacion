package MisClases;

public class MedidorTiempo {
	
	/// Atributos
	long puntoReferencia;
	long ultimaMedida;
	
	// Métodos
	
	// Constructor
	MedidorTiempo() {
		ultimaMedida=0;
		puntoReferencia=System.currentTimeMillis();
	}
	
	
	void setPuntoReferencia() {
		puntoReferencia=System.currentTimeMillis();
	}
	
	long tomarMedida() {
		long tiempo;
		tiempo= System.currentTimeMillis() - puntoReferencia;

		ultimaMedida=tiempo;
		return tiempo;
	}		
		
	long devolverUltimaMedida() {
		return ultimaMedida;
	}
	
	double devolverUltimaMedidaSegundos() {
		
		// OJO con el detalle de la división entera. Tiene que ser 1000.0
		return ultimaMedida/1000.0;
	}
}
