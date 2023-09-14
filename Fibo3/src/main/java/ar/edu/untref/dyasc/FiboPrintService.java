package ar.edu.untref.dyasc;

public class FiboPrintService {

	private FiboPrint fiboPrint;

	public FiboPrintService(FiboPrint fiboPrint) {
		this.fiboPrint = fiboPrint;
	}

	public void seleccionDeOpcion(String orientacion, String sumatoria) {

		if (sumatoria.equals("-m=l")) {
			if (orientacion.equals("-o=hd")) {
				this.fiboPrint.printHorizontalDirecto();

			} else if (orientacion.equals("-o=vd")) {
				this.fiboPrint.printVerticalDirecto();

			} else if (orientacion.equals("-o=hi")) {
				this.fiboPrint.printHorizontalInverso();

			} else if (orientacion.equals("-o=vi")) {
				this.fiboPrint.printVerticalInverso();

			} else {
				System.err.println("Opciones no validas.");
			}
		} else if (sumatoria.equals("-m=s")) {
			if (orientacion.equals("-o=hd") || orientacion.equals("-o=hi")) {
				this.fiboPrint.printSumatoriaHorizontal();

			} else if (orientacion.equals("-o=vd") || orientacion.equals("-o=vi")) {
				this.fiboPrint.printSumatoriaVertical();
			} else {
				System.err.println("Opciones no validas.");
			}
		}
	}

}
