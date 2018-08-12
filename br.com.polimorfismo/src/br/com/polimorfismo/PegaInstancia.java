package br.com.polimorfismo;

public class PegaInstancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo[] veiculo = new Veiculo[4];
		
		veiculo[0] = new Carro("Cinza", 2012, "NWP-2552", "Gol");
		veiculo[1] = new Barco("Preto", 1312, "Pérola Negra");
		veiculo[2] = new Carro("Preto", 1995, "PAX-4589", "Pálio");
		veiculo[3] = new Aviao("branco", 2010, "Boing 737");
		
		System.out.println(veiculo[0].getClass().getSimpleName());
		System.out.println(veiculo[1].getClass().getSimpleName());
		System.out.println();
		System.out.println(veiculo[0] instanceof Carro);
		System.out.println(veiculo[1] instanceof Barco);
		System.out.println(veiculo[2] instanceof Aviao);
		System.out.println(veiculo[3] instanceof Aviao);

	}

}
