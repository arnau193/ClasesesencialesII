package edu.upc.eetac.dsa.ejerciciosclasesesenciales.Threads;

public class CuantaAtras_synchronized extends PruebaThreads_synchronized
		implements Runnable {

	private String nombre;
	private int s;
	private int sl;

	public CuantaAtras_synchronized(String nom, int seg) {
		nombre = nom;
		s = seg;

	}

	public void run() {

		while (s > (-1)) {

			synchronized(nombre){
			System.out.println(nombre + (": ") + s
					+ (" ultimo thread activo: ")
					+ PruebaThreads_synchronized.ultima_escritura);
			PruebaThreads_synchronized.ultima_escritura = nombre;
			if (s == 0) {
				PruebaThreads_synchronized.finalizado();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException interruptedException) {
				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);

			}
			}

			s--;

		}

	}
}
