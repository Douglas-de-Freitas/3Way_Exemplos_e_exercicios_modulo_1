package aula04;

import java.util.Scanner;

public class TestaCalcula {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double n1 = scanner.nextDouble();
		System.out.println("Digite outro n�mero: ");
		double n2 = scanner.nextDouble();

		System.out.println("Que opera��o deseja realizar? ");
		System.out.println("1 - soma");
		System.out.println("2 - Multiplica��o");

		System.out.println("Digite o n�mero da opera��o: ");
		int operacao = scanner.nextInt();

		Calcula calcula = new Calcula();
		
		if (operacao == 1) {
			System.out.println("A soma de " + n1 + " + " + n2 + " � igual a: " + calcula.soma(n1, n2));

		} else if (operacao == 2) {
			System.out.println("A multiplica��o de " + n1 + " * " + n2 + " � igual a: " + calcula.multiplicacao(n1, n2));
		}

	}

}
