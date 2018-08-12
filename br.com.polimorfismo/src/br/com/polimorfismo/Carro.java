package br.com.polimorfismo;

public class Carro extends Veiculo{
	
	public Carro(String cor, int ano, String placa, String modelo) {
		super(cor, ano, placa, modelo);
	}
	
	@Override
	public void mover() {
		System.out.println("Correr");
	}

}
