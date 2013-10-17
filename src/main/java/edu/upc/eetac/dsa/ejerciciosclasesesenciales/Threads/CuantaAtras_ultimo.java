package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

import java.io.*;

public class CuantaAtras_ultimo extends PruebaThreads_ultimo implements Runnable   {
	
	private String nombre;
	private int s;


	
	public CuantaAtras_ultimo(String nom, int seg) {
		nombre = nom;
		s = seg;
		
			
}
	
	public void run() {
		
		while(s>(-1)){
			
			
			System.out.println(nombre + (": ")+ s + (" ultimo thread activo: ") + PruebaThreads_ultimo.ultima_escritura);
			PruebaThreads_ultimo.ultima_escritura=nombre;
			if(s==0){
				PruebaThreads_ultimo.finalizado();
				}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException interruptedException) {
				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);
				
			}
			
			s--;

			
		}
		
	}
}
