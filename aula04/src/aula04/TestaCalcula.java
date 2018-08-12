package aula04;

import java.util.Scanner;

public class TestaCalcula {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double n1 = scanner.nextDouble();
		System.out.println("Digite outro número: ");
		double n2 = scanner.nextDouble();

		System.out.println("Que operação deseja realizar? ");
		System.out.println("1 - soma");
		System.out.println("2 - Multiplicação");

		System.out.println("Digite o número da operação: ");
		int operacao = scanner.nextInt();

		Calcula calcula = new Calcula();
		
		if (operacao == 1) {
			System.out.println("A soma de " + n1 + " + " + n2 + " é igual a: " + calcula.soma(n1, n2));

		} else if (operacao == 2) {
			System.out.println("A multiplicação de " + n1 + " * " + n2 + " é igual a: " + calcula.multiplicacao(n1, n2));
		}

	}

}
