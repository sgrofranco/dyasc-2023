package ar.edu.untref.dyasc;

public class FiboController {

	private Integer numeroFibo;
	private String orientacion;
	private String nombreArchivo;
	private String sumatoria;

	public FiboController(String[] config) {

		if( config.length>4 || buscarConfigInvalida(config)) {
			System.err.println("Opcion no valida");
		} else {	
			this.numeroFibo = buscarNumeroFibo(config);
			this.orientacion = buscarOrientacion(config);
			this.sumatoria = buscarSumatoria(config);
			this.nombreArchivo = buscarNombreArchivo(config);
			execute();
		}

	}

	public void execute() {

		Fibo fibo = new Fibo(this.numeroFibo);
		FiboPrint printer = new FiboPrint(fibo);
		FiboWriter writer = new FiboWriter(this.nombreArchivo, fibo);

		FiboPrintService printService = new FiboPrintService(printer);
		FiboWriterService writeService = new FiboWriterService(writer, this.nombreArchivo);

		if (this.nombreArchivo != null) {
			writeService.seleccionDeOpccion(orientacion, sumatoria);
		} else {

			printService.seleccionDeOpcion(this.orientacion, this.sumatoria);
		}
	}

	private Integer buscarNumeroFibo(String[] args) {
		Integer numeroFibo = null;

		for (int i = 0; i < args.length; i++) {
			if (validarNumeroFibo(args[i])) {
				numeroFibo = Integer.parseInt(args[i]);
				break;
			}
		}
		return numeroFibo;
	}

	private String buscarOrientacion(String[] args) {
		String orientacion = null;

		for (int i = 0; i < args.length; i++) {
			if (validarOrientacion(args[i])) {
				orientacion = args[i];
				break;
			}
		}
		if (orientacion == null) {
			orientacion = "-o=hd";
		}
		return orientacion;
	}

	private String buscarSumatoria(String[] args) {
		String sumatoria = null;

		for (int i = 0; i < args.length; i++) {
			if (validarSumatoria(args[i])) {
				sumatoria = args[i];
				break;
			}
		}
		if (sumatoria == null) {
			sumatoria = "-m=l";
		}
		return sumatoria;
	}

	private String buscarNombreArchivo(String[] args) {
		String nombreArchivo = null;

		for (int i = 0; i < args.length; i++) {
			if (validarNombreArchivo(args[i])) {
				nombreArchivo = args[i];
				break;
			}
		}
		return nombreArchivo;
	}

	// Devuelve true si se utiliza la configuracion predeterminada de Fibo 1.
	private boolean validarNumeroFibo(String numeroFibo) {
		return numeroFibo.chars().allMatch(Character::isDigit);
	}

	private boolean validarNombreArchivo(String nombreArchivo) {
		String[] aux = nombreArchivo.split("=");
		return aux[0].equals("-f");
	}

	private boolean validarOrientacion(String orientacion) {
		String[] aux = orientacion.split("=");
		return aux[0].equals("-o");
	}

	private boolean validarSumatoria(String sumatoria) {
		String[] aux = sumatoria.split("=");
		return aux[0].equals("-m");
	}

	private boolean buscarConfigInvalida(String[] args) {
		boolean encontroConfigInvalida = false;

		for (int i = 0; i < args.length; i++) {
			if (!validarNumeroFibo(args[i]) && !validarNombreArchivo(args[i]) && !validarOrientacion(args[i]) && !validarSumatoria(args[i])) {
				encontroConfigInvalida = true;
			}
		}
		
		return encontroConfigInvalida;
	}

}
