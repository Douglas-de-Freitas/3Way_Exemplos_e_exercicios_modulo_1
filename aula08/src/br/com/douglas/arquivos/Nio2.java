package br.com.douglas.arquivos;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Nio2 {

	public static void main(String[] args) {

		String fileStr = "arquivo.txt";
		Path path = Paths.get(fileStr);

		List<String> linhas = new ArrayList<>();
		linhas.add("Alguma coisa");
		linhas.add("Alguma coisa 2");
		linhas.add("Alguma coisa 3");

		try {
			Files.write(path, linhas, Charset.forName("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// lê toda s linhas e atribui para uma lista
			List<String> inLines = Files.readAllLines(path, Charset.forName("UTF-8"));

			// PEGA LINHA POR LINHA...
			for (String linha : inLines) {
				// System.out.println(linha);
				// porcorre os caracteres da linha até o fiim - linha.length()

				for (int i = 0; i < linha.length(); i++) {

					// ... e lê caracter por caractere
					char charOut = linha.charAt(i);
					System.out.println();
					System.out.printf("[%d] '%c' ", (i + 1), charOut);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
