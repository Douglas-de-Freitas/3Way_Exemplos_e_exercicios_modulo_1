package aula04;

public class Conta {
	
	static int contador = 0;
	
	private int numero;
	private double saldo;
	private String titular;
	
	public Conta() {
		
	}
	
	public Conta(int numero, double saldo, String titular) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		contador++;
	}

	public void sacar(double quantidade) {
		if(quantidade > saldo) {
			System.out.println("Você não pode sacar uma quantidade que você não tem");
		}else {
			this.saldo = this.saldo - quantidade;
			System.out.println(quantidade + " reais sacado com sucesso");
		}
		
	}
	
	public void depositar(double quantidade) {
		this.saldo = this.saldo + quantidade;
		System.out.println(quantidade + " reais depositado com sucesso");
	}
	
	public void retornaSaldo() {
		System.out.println("Seu saldo é de " + saldo + " Reais");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
	

}
