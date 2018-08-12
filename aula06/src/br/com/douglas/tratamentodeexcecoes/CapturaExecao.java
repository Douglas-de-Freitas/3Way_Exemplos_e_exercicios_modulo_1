package br.com.douglas.tratamentodeexcecoes;

public class CapturaExecao {

	public static void main(String[] args) {

		try {
			
			int a[] = new int[2];
			System.out.println("Access element three: " + a[3]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown: " + e);
			System.out.println();
			e.printStackTrace();
		}
		
		System.out.println("Out of the block");

	}

}
