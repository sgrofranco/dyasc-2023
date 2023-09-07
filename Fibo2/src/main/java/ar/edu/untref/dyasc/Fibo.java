package ar.edu.untref.dyasc;

import java.util.*;

public class Fibo {

	private LinkedList<Integer> fibo = new LinkedList<Integer>();
	private LinkedList<Integer> fiboInvertido;
	private int numeroFibo;

	public Fibo(int numeroFibo) {
		this.numeroFibo = numeroFibo;
		crearFibo();
		this.fiboInvertido = new LinkedList<Integer>(fibo);
		Collections.reverse(fiboInvertido);
	}

	private void crearFibo() {
		if (this.numeroFibo == 1) {
			this.fibo.addLast(0);
		}
		if (this.numeroFibo == 2) {
			this.fibo.addLast(0);
			this.fibo.addLast(1);
		}
		if (this.numeroFibo >= 3) {
			this.fibo.addLast(0);
			this.fibo.addLast(1);
			for (int i = 2; i < this.numeroFibo; i++) {
				this.fibo.addLast(this.fibo.get(i - 1) + this.fibo.get(i - 2));
			}
		}
	}

	public LinkedList<Integer> getFibo() {
		return fibo;
	}
	
	public LinkedList<Integer> getFiboInvertido(){
		return this.fiboInvertido;
	}
		

	public int getNumeroFibo() {
		return numeroFibo;
	}

}
