package ar.edu.untref.dyasc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FiboWriter {

	private String nombreArchivo;
	private Fibo fibo;

	public FiboWriter(String nombreArchivo, Fibo fibo) {

		this.nombreArchivo = obtenerNombre(nombreArchivo);
		this.fibo = fibo;
	}

	public void crearArchivo() {

		try {
			File archivo = new File(this.nombreArchivo);
			if (archivo.createNewFile()) {
				System.out.println("fibo<" + fibo.getNumeroFibo() + ">: guardado en " + this.nombreArchivo);
			} else {
				System.out.println("El archivo ya existe.");
			}
		} catch (Exception e) {
			System.out.println("Se cayo el sistema.");
			e.printStackTrace();
		}
	}

	public void escribirHorizontalDirecto() {

		try {

			BufferedWriter escritor = new BufferedWriter(new FileWriter(this.nombreArchivo));
			escritor.write("fibo<" + fibo.getNumeroFibo() + ">: ");

			for (int i = 0; i < fibo.getFibo().size(); i++) {
				escritor.write(fibo.getFibo().get(i).toString() + ' ');
			}
			escritor.close();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void escribirVertricalDirecto() {

		try {

			BufferedWriter escritor = new BufferedWriter(new FileWriter(this.nombreArchivo));
			escritor.write("fibo<" + fibo.getNumeroFibo() + ">: ");

			for (int i = 0; i < fibo.getFibo().size(); i++) {
				escritor.write("\n" + fibo.getFibo().get(i).toString() + ' ');
			}
			escritor.close();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void escribirHorizontalInvertido() {

		try {

			BufferedWriter escritor = new BufferedWriter(new FileWriter(this.nombreArchivo));
			escritor.write("fibo<" + fibo.getNumeroFibo() + ">: ");

			for (int i = 0; i < fibo.getFiboInvertido().size(); i++) {
				escritor.write(fibo.getFiboInvertido().get(i).toString() + ' ');
			}
			escritor.close();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void escribirVertricalInvertido() {

		try {

			BufferedWriter escritor = new BufferedWriter(new FileWriter(this.nombreArchivo));
			escritor.write("fibo<" + fibo.getNumeroFibo() + ">: ");

			for (int i = 0; i < fibo.getFiboInvertido().size(); i++) {
				escritor.write("\n" + fibo.getFiboInvertido().get(i).toString() + ' ');
			}
			escritor.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void escribirSumatoriaHorizontal() {
		
		try {

			BufferedWriter escritor = new BufferedWriter(new FileWriter(this.nombreArchivo));
			escritor.write("fibo<" + fibo.getNumeroFibo() + ">: "+fibo.getSumatoria());

			escritor.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void escribirSumatoriaVertical() {
		try {

			BufferedWriter escritor = new BufferedWriter(new FileWriter(this.nombreArchivo));
			escritor.write("fibo<" + fibo.getNumeroFibo() + ">: ");
			escritor.write("\n"+fibo.getSumatoria());
			
			escritor.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	private String obtenerNombre(String config) {
		
		if(config != null) {			
			String[] aux = config.split("=");
			return aux[aux.length-1];
		}
		else {
			return null;
		}
		
		
	}

}
