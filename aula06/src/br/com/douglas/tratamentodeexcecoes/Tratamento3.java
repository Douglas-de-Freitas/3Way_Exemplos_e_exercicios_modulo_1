package br.com.douglas.tratamentodeexcecoes;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Tratamento3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream ps = System.out;

		InputStreamReader leitor = new InputStreamReader(System.in);

		int[] array = { 1, 2, 3, 4 };

		try {

			ps.println("Digite uma posição: ");

			Character ch = (char) leitor.read();

			int i = Integer.parseInt(ch.toString());

			ps.println(array[i]);
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | IOException e) {
			
			ps.printf("Um erro aconteceu: %s\n", e.getMessage());
			e.printStackTrace();
			
		} finally {

			if (leitor != null) {
				
				try {
					leitor.close();
				} catch (Exception e) {
					ps.println("Sempre fechar o recurso.");
				}
				
			}

		}

	}

}
