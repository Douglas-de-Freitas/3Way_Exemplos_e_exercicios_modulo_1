package br.com.exercicio1;

public class Funcionario {
	
	private int numeroDeMatricula;

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}
	
	public void exibeDados() {
		System.out.println("Funcionario de matrícula " + getNumeroDeMatricula());
	}

}
