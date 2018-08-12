package br.com.polimorfismo;

public class ColecoesHeterogeneasDeObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro[] carros = new Carro[3];
		carros[0] = new Carro("Cinza", 2012, "NWP-2552", "Gol");
		carros[1] = new Carro("Preto", 1995, "PAX-4589", "Pálio");
		carros[2] = new Carro("Vermelho", 2000, "XPY-3895", "Celta");
		
		Barco[] barcos = new Barco[2];
		barcos[0] = new Barco("Verde", 1999, "Naúfrago");
		barcos[1] = new Barco("Preto", 1312, "Pérola Negra");
		
		Veiculo[] veiculo = new Veiculo[4];
		veiculo[0] = new Carro("Cinza", 2012, "NWP-2552", "Gol");
		veiculo[1] = new Barco("Preto", 1312, "Pérola Negra");
		veiculo[2] = new Carro("Preto", 1995, "PAX-4589", "Pálio");
		veiculo[3] = new Aviao("branco", 2010, "Boing 737");
		
		carros[0].mover();
		carros[1].mover();
		carros[2].mover();
		
		barcos[0].mover();
		barcos[1].mover();
		
		veiculo[0].mover();
		veiculo[1].mover();
		veiculo[2].mover();
		veiculo[3].mover();
		

	}

}
