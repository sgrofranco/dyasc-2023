package ar.edu.untref.dyasc;

import java.util.*;

public class Fibo {

	private LinkedList<Integer> sucesion = new LinkedList<Integer>();
	private LinkedList<Integer> fiboInvertido;
	private int numeroFibo;
	private Integer sumatoria;

	public Fibo(int numeroFibo) {
		this.numeroFibo = numeroFibo;
		crearFibo();
		this.sumatoria = calcularSumatoria();
		this.fiboInvertido = new LinkedList<Integer>(sucesion);
		Collections.reverse(fiboInvertido);
	}

	private void crearFibo() {
		if (this.numeroFibo == 1) {
			this.sucesion.addLast(0);
		}
		if (this.numeroFibo == 2) {
			this.sucesion.addLast(0);
			this.sucesion.addLast(1);
		}
		if (this.numeroFibo >= 3) {
			this.sucesion.addLast(0);
			this.sucesion.addLast(1);
			for (int i = 2; i < this.numeroFibo; i++) {
				this.sucesion.addLast(this.sucesion.get(i - 1) + this.sucesion.get(i - 2));
			}
		}
	}

	public LinkedList<Integer> getFibo() {
		return sucesion;
	}
	
	public LinkedList<Integer> getFiboInvertido(){
		return this.fiboInvertido;
	}
		

	public int getNumeroFibo() {
		return numeroFibo;
	}
	
	private Integer calcularSumatoria() {
		Integer aux = 0;
		
		for(int i = 0; i< this.sucesion.size();i++) {
			aux = aux + this.sucesion.get(i);
		}
		
		return aux;
	}
	
	public Integer getSumatoria() {
		return sumatoria;
	}

}
