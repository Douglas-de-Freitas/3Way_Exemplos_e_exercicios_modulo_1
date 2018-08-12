package br.com.douglas.threads;

public class HerancaThread extends Thread {

	@Override
	public void run() {
		
		// conteudo da thread
		
		System.out.println("extends Thread");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}
