package MisClases;

public class Jugador {

	// ATRIBUTOS
	int identificador;
	int dineroAcumulado;
	int dineroPanel;
	int numComodines;

	// CONSTRUCTOR DE LA CLASE
	Jugador(int id) {
		identificador = id;
		dineroAcumulado = 0;
		dineroPanel = 0;
		numComodines = 0;
	}

	int getNumComodines() {
		return numComodines;
	}

	void incrementarComodines() {
		numComodines++;
	}

	void decrementarComodines() {
		numComodines--;
	}

	void setDineroPanelCero() {
		dineroPanel = 0;
	}

	int getDineroPanel() {
		return dineroPanel;
	}

	void incrementarDineroPanel(int cantidad) {
		dineroPanel += cantidad;
	}

	void decrementarDineroPanel(int cantidad) {
		dineroPanel -= cantidad;
	}

	int getDineroAcumulado() {
		return dineroAcumulado;
	}

	void incrementarDineroAcumulado(int cantidad) {
		dineroAcumulado += cantidad;
	}

	int getIdentificador() {
		return identificador;
	}
}
