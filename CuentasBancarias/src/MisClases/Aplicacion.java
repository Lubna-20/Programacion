package MisClases;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta cu1;
		cu1=new Cuenta(11111, "Lubna Meziane","12345678-h");
		
		Cuenta cu2;
		cu2=new Cuenta(2222222, "Fatima Yaala","9871984-f");
		
		cu1.mostrarDatosCuenta();
		cu2.mostrarDatosCuenta();
		
		cu1.hacerIngreso(500);
		cu1.hacerTransferencia(300, cu2);
		
		cu1.mostrarDatosCuenta();
		cu2.mostrarDatosCuenta();
		
		/*int retorno=cu1.hacerIngreso(500);
		if (retorno ==1) 
			System.out.println("El ingreso se ha hecho correctamente");
		else  System.out.println("Hubo un problema al hacer el ingreso");
			
		cu1.mostrarDatosCuenta();
		
		 retorno=cu1.hacerIngreso(-100);
		if (retorno ==1) 
			System.out.println("El ingreso se ha hecho correctamente");
		else  System.out.println("Hubo un problema al hacer el ingreso");
			
		cu1.mostrarDatosCuenta();*/
		
	}

}
