package ar.edu.untref.dyasc;

import java.util.Collections;

public class FiboPrint {

	private Fibo fibo;

	public FiboPrint(Fibo fibo) {
		this.fibo = fibo;
	}

	public void printHorizontalDirecto() {

		System.out.print("fibo<" + fibo.getNumeroFibo() + ">: ");

		for (int i = 0; i < fibo.getFibo().size(); i++) {
			System.out.print(fibo.getFibo().get(i).toString() + ' ');
		}

	}

	public void printHorizontalInverso() {
		
		System.out.print("fibo<" + fibo.getNumeroFibo() + ">: ");

		for (int i = 0; i < fibo.getFiboInvertido().size(); i++) {
			System.out.print(fibo.getFiboInvertido().get(i).toString() + ' ');
		}

	}

	public void printVerticalDirecto() {
		
		System.out.println("fibo<" + fibo.getNumeroFibo() + ">: ");

		for (int i = 0; i < fibo.getFibo().size(); i++) {
			System.out.println(fibo.getFibo().get(i).toString() + ' ');
		}

	}

	public void printVerticalInverso() {
		
		System.out.println("fibo<" + fibo.getNumeroFibo() + ">: ");

		for (int i = 0; i < fibo.getFiboInvertido().size(); i++) {
			System.out.println(fibo.getFiboInvertido().get(i).toString() + ' ');
		}

	}

}
