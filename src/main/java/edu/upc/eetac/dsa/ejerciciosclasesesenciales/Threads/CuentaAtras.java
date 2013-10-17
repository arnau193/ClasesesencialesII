package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

public class CuentaAtras extends Thread {

	private String nombre;
	private int s;

	public CuentaAtras(String nom, int seg) {
		nombre = nom;
		s = seg;
}

	public void run() {
		while (s >= 0) {

			System.out.println("Contador: " + nombre + " quedan " + s
					+ " segundos");

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
