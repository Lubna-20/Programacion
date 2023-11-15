package MisClases1;

import MisClases2.ClaseTipo2;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClaseTipo1 ob1=new ClaseTipo1();
		
		//ACCESO A ATRIBUTOS Y METODOS PUBLIC 
			ob1.atPublic=100;
			ob1.metodoPublic();
		//ACCESO A ATRIBUTOS Y METODOS PROTECTED 
			ob1.atProtected=100;
			ob1.metodoProtected();
		//ACCESO A ATRIBUTOS Y METODOS Default 
			ob1.atDefault=100;
			ob1.metodoDefault();
		//ACCESO A ATRIBUTOS Y METODOS PUBLIC 
		//	ob1.atPrivate=100;		NO PUEDO PORQUE ES PROVADO
		//	ob1.metodoPrivate();	NO PUEDO PORQUE ES PROVADO
			
	
			//PARA PODER INVOCAR AL CONSTRUCTOR TENGO QUE HACERLE PUBLIC POR ESTAR 
			//EN PAQUETES DISTINTOS
			ClaseTipo2 ob2=new ClaseTipo2();

			//ACCESO A ATRIBUTOS Y METODOS PUBLIC 
				ob2.atPublic=100;
				ob2.metodoPublic();
		//ACCESO A ATRIBUTOS Y METODOS PROTECTED 
				//ob2.atProtected=100;	NO PUEDO ACCEDER POR ESTAR EN PAQUETES
				//DISTINTOS Y NO TENER HERENCIAS ENTRE OBJETOS
				//ob2.metodoProtected();	NO PUEDO ACCEDER POR ESTAR EN PAQUETES			
				//DISTINTOS Y NO TENER HERENCIAS ENTRE OBJETOS
		//ACCESO A ATRIBUTOS Y METODOS Default 
				//ob2.atDefault=100;	NO PUEDO ACCEDER POR ESTAR EN PAQUETES
				//DISTINTOS Y NO TENER HERENCIAS ENTRE OBJETOS
				//ob2.metodoDefault();	NO PUEDO ACCEDER POR ESTAR EN PAQUETES
				//DISTINTOS Y NO TENER HERENCIAS ENTRE OBJETOS
		//ACCESO A ATRIBUTOS Y METODOS PUBLIC 
				//	ob2.atPrivate=100;		NO PUEDO PORQUE ES PROVADO
				  //	ob2.metodoPrivate();	NO PUEDO PORQUE ES PROVADO
	
}
}