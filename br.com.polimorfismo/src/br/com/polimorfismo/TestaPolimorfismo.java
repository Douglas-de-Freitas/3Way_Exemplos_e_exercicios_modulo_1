package br.com.polimorfismo;

public class TestaPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo veiculo = new Carro("Cinza", 2012, "NWP-2552", "Gol");
		veiculo.mover();
		
		veiculo = new Aviao("Prata", 2013, "NWP-2552");
		veiculo.mover();
		
		veiculo = new Barco("Branco", 2008, "NWP-2552");
		veiculo.mover();
		
		veiculo = new Veiculo("Preto", 1111, "NWP-2552", "xxx");
		veiculo.mover();
		
		Barco barco = new Barco("Branco", 2008, "NWP-2552");
		barco.mover();
		barco.teste();

	}

}
