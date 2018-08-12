package aula03;

public class Carro {
	
	int ano;
	String cor;
	String modelo;
	String placa;
	
	public void acelerar() {
		System.out.println("acelerando");
	}
	
	public String frear() {
		return "freando";
	}
	
	public String ligar() {
		return "ligando";
	}

}
