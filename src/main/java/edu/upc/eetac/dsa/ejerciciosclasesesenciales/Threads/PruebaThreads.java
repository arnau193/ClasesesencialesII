package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

public class PruebaThreads extends Thread {
	
		public static void main(String args[])
		{
		CuentaAtras contador1 = new CuentaAtras("ID1", 4);
		contador1.start();
		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
		contador2.start();
		CuentaAtras contador3 = new CuentaAtras("ID3", 8);	
		contador3.start();
		
		}


}
