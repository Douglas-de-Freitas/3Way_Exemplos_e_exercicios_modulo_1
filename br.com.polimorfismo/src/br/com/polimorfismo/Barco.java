package br.com.polimorfismo;

public class Barco extends Veiculo{
	
	String teste;
	
	public Barco(String cor, int ano, String placa) {
		super(cor, ano, placa, null);
	}
	
	@Override
	public void mover() {
		System.out.println("Navegar");
	}
	
	public void teste() {
		System.out.println("aqui um teste");
	}


}
