package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

public class PruebaThreads_runnable {

	public static void main(String args[])
	{
		
		CuentaAtras_runnable runnable1 = new CuentaAtras_runnable("ID1", 4);
		Thread contador1= new Thread(runnable1); 
		contador1.start();
		CuentaAtras_runnable runnable2 = new CuentaAtras_runnable("ID2", 7);
		Thread contador2= new Thread(runnable2); 
		contador2.start();
		CuentaAtras_runnable runnable3 = new CuentaAtras_runnable("ID3", 8);
		Thread contador3= new Thread(runnable3); 
		contador3.start();
		
		
	}
}
