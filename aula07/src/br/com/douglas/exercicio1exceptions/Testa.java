package br.com.douglas.exercicio1exceptions;

import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um M para Masculino ou F para Feminino: ");

		char ch = scanner.nextLine().charAt(0);

		try {
			System.out.println(VerificaLetraSexo.verificaLetra(ch));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scanner.close();

	}

}
