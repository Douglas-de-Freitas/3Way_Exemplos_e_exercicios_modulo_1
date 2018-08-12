package br.com.douglas.arquivos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {

		try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream("c:\\textfile.txt"));) {

			stream.write("Hello, Word! 2".getBytes());
			stream.write(System.lineSeparator().getBytes());
			stream.write("I am writting into a file using BufferedOutputStream".getBytes());
			stream.write(System.lineSeparator().getBytes());
			// stream.close(); se não tivesse criado dentro do try

			System.out.println("Arquivo criado com sucessoS");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
