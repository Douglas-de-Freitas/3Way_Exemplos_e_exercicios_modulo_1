package aula03;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro gol = new Carro();
		gol.modelo = "Gol";
		gol.placa = "AOX-4545";
		
		System.out.println("Modelo: " + gol.modelo);
		System.out.println("Placa: " + gol.placa);
		gol.acelerar();

	}

}
