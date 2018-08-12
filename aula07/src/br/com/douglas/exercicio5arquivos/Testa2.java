package br.com.douglas.exercicio5arquivos;

import java.util.Scanner;
import br.com.douglas.exercicio1exceptions.VerificaLetraSexo;

public class Testa2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um M para Masculino ou F para Feminino: ");

		char ch = scanner.nextLine().charAt(0);

		try {
			Log3Way.gerarLog("Iniciando");
			System.out.println(VerificaLetraSexo.verificaLetra(ch));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Log3Way.gerarLog("Erro ao tentar definir o sexo");
			e.printStackTrace();
			
		}
		
		Log3Way.gerarLog("Terminando");

		scanner.close();

	}

}
