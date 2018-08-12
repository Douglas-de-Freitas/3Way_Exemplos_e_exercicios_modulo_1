package br.com.douglas.threads;

public class TestaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HerancaThread threadSimples = new HerancaThread();
		
		Thread threadRunnable = new Thread(new RunnableThread());
		
		threadSimples.start();
		
		threadRunnable.start();
		

	}

}
