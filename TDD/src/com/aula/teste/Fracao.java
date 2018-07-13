package com.aula.teste;

public class Fracao {
	
	public int numerador;
	public int denominador;
	
	
	public Fracao(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public int calculaFracao() {
		return numerador / denominador;
	}
	
	public double CalcularValorCorreto() {
		double a = (double)this.numerador;
		double b = (double)this.denominador;
		return a/b;
	}
	
	public double calcularMultiplicacaoDeFracoes(Fracao fracao){
		double novoNumerador = (double) numerador * fracao.numerador;
		double novoDenominador = (double) denominador * fracao.denominador;
		return novoNumerador/novoDenominador;
	}
	
	public double calcularFracaoDeFracoes(Fracao fracao){
		double novoNumerador = (double) numerador * fracao.denominador;
		double novoDenominador = (double) denominador * fracao.numerador;
		return novoNumerador/novoDenominador;
	}
	
}
