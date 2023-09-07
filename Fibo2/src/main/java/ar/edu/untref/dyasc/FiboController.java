package ar.edu.untref.dyasc;

import java.util.Collections;

public class FiboController {

	private FiboPrint fiboPrint;
	private String[] config;
	private Fibo fibo;

	public FiboController(String[] config) {
		this.config = config;

		if (usoPredeterminado()) {
			this.fibo = new Fibo(Integer.parseInt(config[0]));
		} else {
			this.fibo = new Fibo(Integer.parseInt(config[1]));
		}
		this.fiboPrint = new FiboPrint(this.fibo);
	}

	// Devuelve true si se utiliza la configuracion predeterminada de Fibo 1.
	public boolean usoPredeterminado() {
		return this.config[0].chars().allMatch(Character::isDigit);
	}

	private void seleccionDeOpcion(String config) {
		if (config.equals("-o=hd")) {
			System.out.println("El fibo a imprimir es" + this.fibo);
			this.fiboPrint.printHorizontalDirecto();

		} else if (config.equals("-o=vd")) {
			this.fiboPrint.printVerticalDirecto();

		} else if (config.equals("-o=hi")) {
			this.fiboPrint.printHorizontalInverso();

		} else if (config.equals("-o=vi")) {
			this.fiboPrint.printVerticalInverso();

		} else {
			System.err.println("Opciones no validas.");
		}
	}

	public void execute() {

		if (usoPredeterminado()) {
			this.fiboPrint.printHorizontalDirecto();
		} else {
			seleccionDeOpcion(config[0]);
		}

	}

}
