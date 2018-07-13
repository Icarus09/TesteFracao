package com.aula.teste;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestaFracao {
	
	public Fracao f;

	@Before
	public void setUp() throws Exception {
		f = new Fracao(4,5);
	}

	@Test
	public void retornaValorCorreto() {
		Double a = 0.0;
		Double b = f.CalcularValorCorreto();
		assertEquals(a, b);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void DenominadorComValorZero() {
		int a = f.calculaFracao();
	}
	
	@Test
	public void RetornarValorCorretoDaMultiplicacaoDeDuasFracoes(){
		Double a = 2.4;
		Double b = f.calcularMultiplicacaoDeFracoes(new Fracao(6,2));
		System.out.println(b);
		assertEquals(a, b);
	
	}
	
	@Test
	public void RetornarValorCorretoDaFracaoDeDuasFracoes(){
		Double a = 2.4;
		Double b = f.calcularFracaoDeFracoes(new Fracao(2,5));
		System.out.println(b);
		assertEquals(a, b);
	}
	
	@Test
	public void RetornarValorCorretoDoMmc() {
		f.mmc(2, 3);
		assertEquals(6,f.mmc(2, 3));
	}
	
	
}
