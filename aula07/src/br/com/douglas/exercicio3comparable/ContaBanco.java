package br.com.douglas.exercicio3comparable;

public class ContaBanco implements Comparable<ContaBanco>{
	
	String nome;
	int conta;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public ContaBanco(int numConta, String titularConta) {
		this.nome = titularConta;
		this.conta = numConta;
	}
	
	@Override
	public int compareTo(ContaBanco outraConta) {
		// TODO Auto-generated method stub
		
		if(this.getConta() < outraConta.getConta()) {
			return -1;
		}
		
		if(this.getConta() > outraConta.getConta()) {
			return 1;
		}
		
		return 0;
	}
	
	

}
