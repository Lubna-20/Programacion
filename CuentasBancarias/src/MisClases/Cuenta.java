package MisClases;

public class Cuenta {

	//Atributos
	
	int idCuenta;
	String titular;
	String dni;
	double saldo; 
	
	//Metodos
	
	//Constructor
	
	Cuenta(int id, String tit,String dniTitular ){
		idCuenta=id;
		dni=dniTitular;
		saldo=0;
		titular=tit;
	}
	
	double obtenerSald(){
		return saldo;
	}
	
	int hacerIngreso(double cantidad){
		if(cantidad>0){
			
			saldo = saldo + cantidad;
			return 1;
		}
		else return -1; //ha habido un error al hacer el ingreso
	
	}
	int hacerReingreso(double cantidad){
		
	
		if(cantidad>saldo){
			
			return -1; //saldo insuficiente
		}
		else {
			saldo = saldo - cantidad;
			return 1;
	}
}
	void mostrarDatosCuenta() {
		System.out.println();
		System.out.println("El id de la cienta es "+ idCuenta);
		System.out.println("Su titular es "+ titular);
		System.out.println("El saldo actual de la cuenta es "+ saldo);
	}
	
	int hacerTransferencia (double cantidad, Cuenta cuentaDestino){
		
		if (saldo >= cantidad) {
			
			//disminuyo el saldo de la cuenta prigen
			saldo = saldo - cantidad;
			//incremento el saldo en la cuenta destino 
			cuentaDestino.hacerIngreso(cantidad);
			
			return 1;
		}
		else return -1; //hay un problema no se puede hacer 
	}
}
