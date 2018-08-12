package aula03;

import java.util.Scanner;

public class MaiorMenorIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma Idade: ");
		
		int entrada = scanner.nextInt();
		
		if(entrada > 18) {
			System.out.println("É maior que 18");
		}else if(entrada == 18) {
			System.out.println("Tem 18");
		}else {
			System.out.println("Menor de 18");
		}
		
		String resultado = (entrada > 18) ? "É maior" : "É menor";
		System.out.println(resultado);
	}

}
