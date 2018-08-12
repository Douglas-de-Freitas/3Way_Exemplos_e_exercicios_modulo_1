package br.com.polimorfismo;

public class Veiculo {
	
	private String cor;
	private int ano;
	private String placa;
	private String modelo;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Veiculo(String cor, int ano, String placa, String modelo) {
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;
		this.modelo = modelo;
	}
	
	public void mover() {
		System.out.println("Veiculo se movendo");
	}

}
