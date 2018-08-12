package br.com.polimorfismo;

public class Aviao extends Veiculo{
	
	public Aviao(String cor, int ano, String placa) {
		super(cor, ano, placa, null);
	}
	
	@Override
	public void mover() {
		System.out.println("Voar");
	}

}
