package br.com.codenation.desafioexe;

import org.junit.Test;

import static org.junit.Assert.*;

public class DesafioApplicationTest {

	@Test
	public void fibonacci() {
		assertNotNull(DesafioApplication.fibonacci());
	}

	@Test
	public void isFibonacci() {
		assertTrue(DesafioApplication.isFibonacci(1));
	}

	// Testes adicionais:

	@Test
	public void isFibonacciSize15() { assertEquals(15, DesafioApplication.fibonacci().size()); }

	@Test
	public void isFibonacciSizeNot14() { assertNotEquals(14, DesafioApplication.fibonacci().size()); }

	@Test
	public void isFibonacciSizeNot16() { assertNotEquals(16, DesafioApplication.fibonacci().size()); }

	@Test
	public void is5Fibonacci() { assertTrue(DesafioApplication.isFibonacci(5)); }

	@Test
	public void is144Fibonacci() { assertTrue(DesafioApplication.isFibonacci(144)); }

	@Test
	public void is233Fibonacci() {assertTrue(DesafioApplication.isFibonacci(233)); }

	@Test
	public void is4NotFibonacci() {	assertFalse(DesafioApplication.isFibonacci(4)); }

	@Test
	public void is150NotFibonacci() { assertFalse(DesafioApplication.isFibonacci(150)); }

	@Test
	public void is350NotFibonacci() { assertFalse(DesafioApplication.isFibonacci(350)); }

}
