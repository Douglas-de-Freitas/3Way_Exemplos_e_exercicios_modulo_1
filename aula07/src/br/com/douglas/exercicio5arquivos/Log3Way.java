package br.com.douglas.exercicio5arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Log3Way {

	public static void gerarLog(String descricao) {

		try {

			File arquivo = new File("c:\\log.txt");

			if (arquivo.exists()) {
				FileReader fr = new FileReader(arquivo);
				BufferedReader br = new BufferedReader(fr);

				while (br.ready()) {
					String linha = br.readLine() + descricao;

					FileWriter fw = new FileWriter(arquivo);
					BufferedWriter bw = new BufferedWriter(fw);

					bw.newLine();
					bw.write(linha);

					bw.close();
					fw.close();
					System.out.println("Log salvo com sucesso!!!");

				}

				fr.close();
				br.close();

			}else {
				
				FileWriter fw = new FileWriter(arquivo);
				BufferedWriter bw = new BufferedWriter(fw);

				bw.newLine();
				bw.write(descricao);

				bw.close();
				fw.close();
				System.out.println("Log salvo com sucesso!!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
