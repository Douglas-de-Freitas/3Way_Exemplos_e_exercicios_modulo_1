package br.com.douglas.exercicio1exceptions;

import br.com.douglas.exercicio5arquivos.Log3Way;

public class SexoInvalidoException extends Exception{
	
	public SexoInvalidoException() {
		super("Sexo Inválido");
	}
	
	public SexoInvalidoException(String msg) {
		super(msg);
	}

}
