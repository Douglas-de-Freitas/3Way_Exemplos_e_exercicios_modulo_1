package br.com.douglas.tratamentodeexcecoes;

public class Calculadora {
	
	public static Double calculamedia(Double x, Double y) throws Exception{
		Double media = ( x + y) / 2;
		
		if(media < 6) {
			throw new MediaInsuficienteException();
		}
		
		return media;
	}
}
