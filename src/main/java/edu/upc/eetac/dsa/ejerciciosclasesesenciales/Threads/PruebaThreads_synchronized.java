package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

import java.io.IOException;

public class PruebaThreads_synchronized {
	static int i=3;
	public static String ultima_escritura;
	
	static void finalizado(){
	
	i--;
	System.out.println("Ultima escritura: " + ultima_escritura + " quedan " + i + " threads activos");
	
	}

	public static void main(String args[]) throws IOException {

		
		
		CuantaAtras_synchronized runnable1 = new CuantaAtras_synchronized("ID1", 4);
		Thread contador1 = new Thread(runnable1);
		contador1.start();
		CuantaAtras_synchronized runnable2 = new CuantaAtras_synchronized("ID2", 7);
		Thread contador2 = new Thread(runnable2);
		contador2.start();
		CuantaAtras_synchronized runnable3 = new CuantaAtras_synchronized("ID3", 8);
		Thread contador3 = new Thread(runnable3);
		contador3.start();

	}
}
