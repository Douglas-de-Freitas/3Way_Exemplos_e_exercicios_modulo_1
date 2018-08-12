package br.com.douglas.exercicio5arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestaArquivo {

	public static void main(String[] args) {

		try {
			
			File arquivo = new File("C:\\teste.txt");
			
			FileWriter fw = new FileWriter(arquivo);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Texto a ser escrito no txt");
			bw.newLine();
			bw.write("quebra de linha");
			
			bw.close();
			
			fw.close();
			
			System.out.println("Arquivo salvo com sucesso!");
		
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("Arquivo não existe!");
		}

	}

}
