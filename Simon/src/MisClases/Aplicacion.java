package MisClases;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String cadena="1234123";
	
	for(int i=0;i<cadena.length();i++) {
		
		char caracter=cadena.charAt(i);
		System.out.print(caracter);
		try {
			Thread.sleep(1000);
			
		}catch (InterruptedException e) {
			//TODO Auto-generated catch block
				e.printStackTrace();
		}
			System.out.print("\b");
		}
	
	
	}

}
