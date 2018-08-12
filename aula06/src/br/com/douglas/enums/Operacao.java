package br.com.douglas.enums;

public enum Operacao {
	
	SOMA,
	SUBTRACAO,
	MULTIPLICACAO,
	DIVISAO;
	
	double calculate(double x, double y) {
		switch(this) {
			case SOMA:
				return x + y;
			case SUBTRACAO:
				return x - y;
			case MULTIPLICACAO:
				return x * y;
			case DIVISAO:
				return x / y;
			default:
				throw new AssertionError("Não existe operação " + this);		
		}
	}
	
}
