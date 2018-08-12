package br.com.douglas.tratamentodeexcecoes;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Tratamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintStream ps = System.out;
		
		InputStreamReader leitor = new InputStreamReader(System.in);
		
		int[] array = {1, 2, 3, 4};
		
		try {
			
			ps.println("Digite uma posição: ");
			
			Character ch = (char) leitor.read();
			
			int i = Integer.parseInt(ch.toString());
			
			ps.println(array[i]);
		}catch (ArrayIndexOutOfBoundsException e) {
			ps.printf("Indice fora do limite [0...3] : %s\n", e.getMessage());
			e.printStackTrace();
		}catch (NumberFormatException e) {
			ps.printf("Erro de conversão : %s\n", e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			ps.printf("Erro de entrada/saida : %s\n", e.getMessage());
			e.printStackTrace();
		}finally {
			ps.println("Sempre passo aqui para fechar todos os recursos");
		}
		

	}

}
