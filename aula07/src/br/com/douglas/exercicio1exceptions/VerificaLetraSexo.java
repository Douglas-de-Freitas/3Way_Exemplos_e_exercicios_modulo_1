package br.com.douglas.exercicio1exceptions;

import br.com.douglas.exercicio5arquivos.Log3Way;

public class VerificaLetraSexo {

	public static String verificaLetra(char ch) throws Exception {

		if (ch == 'F' || ch == 'f') {
			return "F - Feminino";

		}

		if (ch == 'M' || ch == 'm') {
			return "M - Masculino";
		}

		throw new SexoInvalidoException();
	}

}
