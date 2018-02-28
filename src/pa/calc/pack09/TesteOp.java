package pa.calc.pack09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteOp {

	@Test
	void testSoma() {
		Soma sum = new Soma();
		int result = sum.soma(3, 6);
		assertEquals(result, 9);
		System.out.println("Soma: " + result);
	}

	@Test
	void testSubtracao() {
		Subtracao sub = new Subtracao();
		int result = sub.sub(10, 5);
		assertEquals(result, 5);
		System.out.println("Subtração: " + result);
	}

	@Test
	void testMultiplicacao() {
		Multiplicacao mult = new Multiplicacao();
		int result = mult.mult(3, 10);
		assertEquals(result, 30);
		System.out.println("Multiplicação: " + result);
	}
	@Test
	void testDivisao() {
		Divisao div = new Divisao();
		int result = div.div(30, 10);
		assertEquals(result, 3);
		System.out.println("Divisão: " + result);
	}
}
