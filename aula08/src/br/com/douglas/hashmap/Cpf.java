package br.com.douglas.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Cpf {

	public static void retornaNome(Long cpf) {

		Map<Long, String> pessoa = new HashMap<>();

		pessoa.put(12345678910L, "douglas");
		pessoa.put(11111111111L, "aluno 1111");
		pessoa.put(22222222222L, "aluno 2222");
		pessoa.put(33333333333L, "aluno 3333");
		pessoa.put(44444444444L, "aluno 4444");

		if (pessoa.containsKey(cpf) && cpf.toString().length() == 11) {
			System.out.println("O aluno " + pessoa.get(cpf) + " possui o cpf " + cpf.toString());
		} else {
			System.out.println("Aluno não encontrado!");
		}

	}

	public static void main(String[] args) {

		long cpf = 12345678910L;

		retornaNome(cpf);

	}

}
