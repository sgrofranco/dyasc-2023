package ar.edu.untref.dyasc;

public class FiboWriterService {

	FiboWriter fiboWriter;
	String nombreArchivo;

	public FiboWriterService(FiboWriter escritor, String nombreArchivo) {
		this.fiboWriter = escritor;
		this.nombreArchivo = nombreArchivo;
	}

	public void seleccionDeOpccion(String orientacion, String sumatoria) {
		
		fiboWriter.crearArchivo();
		if(sumatoria.equals("-m=l")) {
			
			if (orientacion.equals("-o=hd")) {
				this.fiboWriter.escribirHorizontalDirecto();

			} else if (orientacion.equals("-o=vd")) {
				this.fiboWriter.escribirVertricalDirecto();

			} else if (orientacion.equals("-o=hi")) {
				this.fiboWriter.escribirHorizontalInvertido();

			} else if (orientacion.equals("-o=vi")) {
				this.fiboWriter.escribirVertricalInvertido();

			} else {
				System.err.println("Opciones no validas.");
			}
			
		} else if(sumatoria.equals("-m=s")) {

			if (orientacion.equals("-o=hd") || orientacion.equals("-o=hi")) {
				this.fiboWriter.escribirSumatoriaHorizontal();

			} else if (orientacion.equals("-o=vd") || orientacion.equals("-o=vi")) {
				this.fiboWriter.escribirSumatoriaVertical();
			} else {
				System.err.println("Opciones no validas.");
			}
		}
		

	}

}
