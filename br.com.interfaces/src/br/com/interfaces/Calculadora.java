package br.com.interfaces;

public class Calculadora implements Calculos{

	@Override
	public Double soma(Number x, Number y) {
		// TODO Auto-generated method stub
		return (x.doubleValue() + y.doubleValue());
	}

	@Override
	public Double subtracao(Number x, Number y) {
		// TODO Auto-generated method stub
		return (x.doubleValue() - y.doubleValue());
	}

	@Override
	public Double multiplicacao(Number x, Number y) {
		// TODO Auto-generated method stub
		return (x.doubleValue() * y.doubleValue());
	}

}
