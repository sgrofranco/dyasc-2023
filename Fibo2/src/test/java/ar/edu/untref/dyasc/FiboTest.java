package ar.edu.untref.dyasc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class FiboTest {

	@Test
	void testFibo0() {

		Fibo fibo = new Fibo(0);

		LinkedList<Integer> esperado = new LinkedList<Integer>();
		assertEquals(esperado, fibo.getFibo());
	}

	@Test
	void testFibo1() {

		Fibo fibo = new Fibo(1);

		LinkedList<Integer> esperado = new LinkedList<Integer>();
		esperado.add(0);
		assertEquals(esperado, fibo.getFibo());
	}

	@Test
	void testFibo2() {

		Fibo fibo = new Fibo(2);

		LinkedList<Integer> esperado = new LinkedList<Integer>();
		esperado.add(0);
		esperado.add(1);

		assertEquals(esperado, fibo.getFibo());
	}

	@Test
	void testFibo3() {

		Fibo fibo = new Fibo(3);

		LinkedList<Integer> esperado = new LinkedList<Integer>();
		esperado.add(0);
		esperado.add(1);
		esperado.add(1);

		assertEquals(esperado, fibo.getFibo());
	}

	@Test
	void test() {

		Fibo fibo = new Fibo(5);

		LinkedList<Integer> esperado = new LinkedList<Integer>();
		esperado.add(0);
		esperado.add(1);
		esperado.add(1);
		esperado.add(2);
		esperado.add(3);
		assertEquals(esperado, fibo.getFibo());
	}

}
