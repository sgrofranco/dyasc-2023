package ar.edu.untref.dyasc;

import java.util.*;

public class Ejecutable {

	private static Integer numFibo;
	private static String opcion;
	private static LinkedList<Integer> lista = new LinkedList<Integer>();

	public static void main(String[] args) {

		if (args[0].chars().allMatch(Character::isDigit)) {
			opcion = "-o=hd";
			numFibo = Integer.parseInt(args[0]);

		} else {

			opcion = args[0];
			numFibo = Integer.parseInt(args[1]);

		}
		if (opcion.equals("-o=hd")) {
			crearLista(numFibo);
			horizontal();
		} else if (opcion.equals("-o=vd")) {
			crearLista(numFibo);
			vertical();
		} else if (opcion.equals("-o=hi")) {
			crearLista(numFibo);
			Collections.reverse(lista);
			horizontal();
		} else if (opcion.equals("-o=vi")) {
			crearLista(numFibo);
			Collections.reverse(lista);
			vertical();
		} else {
			System.out.println("Opciones no validas.");
		}

	}

	private static void crearLista(Integer numFibo) {

		if (numFibo == 1) {
			lista.addLast(0);
		}
		if (numFibo == 2) {
			lista.addLast(0);
			lista.addLast(1);
		}
		if (numFibo >= 3) {
			lista.addLast(0);
			lista.addLast(1);
			for (int i = 2; i < numFibo; i++) {
				lista.addLast(lista.get(i - 1) + lista.get(i - 2));
			}
		}

	}

	private static void horizontal() {

		System.out.print("fibo<" + numFibo + ">: ");

		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i).toString() + ' ');
		}

	}

	private static void vertical() {

		System.out.println("fibo<" + numFibo + ">: ");

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString() + ' ');
		}
	}
}
