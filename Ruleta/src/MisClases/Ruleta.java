package MisClases;

import java.util.Random;

public class Ruleta {
	
	String[] ruleta= {"100","75","25","Quiebra","200","25","50",
			"Pierde turno","0","Comodín","100","50","25","500"};
	int indicador;
	
	 Ruleta() {
		indicador=0;  //RULETA APUNTA A LA PRIMERA POSICION

	}
	 
	 
	 
	 String getValorActual() {
		 return ruleta[indicador];
	 }
	 
	void lanzarRuleta(){
		//FORMA 1 DE LANZAR LA RULETA
	//	 Random numAleatorio=new Random();
	//	indicador=numAleatorio.nextInt(0,ruleta.length);
		
		//FORMA 2 
		int timpoFuerza; //REPRESENTA EL TIEMPO QUE TARDA EN PASAR DE UNA CELDA A OTRA
		Random numAleatorio=new Random();
		timpoFuerza=numAleatorio.nextInt(100,300);
		
		System.out.println("La ruelta empieza a girar ");
		System.out.print(getValorActual() + " ");
		
		while(timpoFuerza<800) {
			
		
			//HACEMOS UNA PAUSA DEL NUMERO DE MILISEGUNDOS QUE MARQUE LA VARIABLE TIEMPOFUERZA
			try {
				Thread.sleep(timpoFuerza);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			indicador++;
			if (indicador>=ruleta.length)
				indicador=0;
			
			System.out.print(getValorActual() + " "); 
			
			//INCREMENTAMOS EL TIRMPOPASO EN 40 MILISEGUNDOS
			timpoFuerza+=40;
		}
		
		System.out.println("\n");
		
		
	 }

}
