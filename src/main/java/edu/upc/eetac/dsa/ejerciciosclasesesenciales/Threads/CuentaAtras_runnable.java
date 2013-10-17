package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

import java.io.*;

public class CuentaAtras_runnable implements Runnable {
	
	private String nombre;
	private int s;
	
	public CuentaAtras_runnable(String nom, int seg) {
		nombre = nom;
		s = seg;
}		
	public void run() {
		
		while(s>(-1)){
			
			System.out.println(nombre + (": ")+ s);
			
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
