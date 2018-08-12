package br.com.douglas.tratamentodeexcecoes;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Tratamento4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream ps = System.out;

		int[] array = { 1, 2, 3, 4 };

		try (InputStreamReader leitor = new InputStreamReader(System.in)) { // usando desta maneira não preciso de usar um finaly
			//deste modo ele automaticamente chama o .close, facilitando o não precisando de criar mais codigos			

			ps.println("Digite uma posição: ");

			Character ch = (char) leitor.read();

			int i = Integer.parseInt(ch.toString());

			ps.println(array[i]);
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | IOException e) {
			
			ps.printf("Um erro aconteceu: %s\n", e.getMessage());
			e.printStackTrace();
			
		}

	}

}
