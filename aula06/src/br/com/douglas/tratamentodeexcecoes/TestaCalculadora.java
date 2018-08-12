package br.com.douglas.tratamentodeexcecoes;

public class TestaCalculadora {

	public static void main(String[] args){

		Double nota1 = 5.0;
		Double nota2 = 3.0;
		
		try {
			System.out.println(Calculadora.calculamedia(nota1, nota2));
		}catch(Exception e) {
			System.out.println("Tratamento de erro: ");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
