package br.com.exercicio1;

public class TestaClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programador programador = new Programador();
		programador.setNumeroDeMatricula(123465);
		programador.exibeDados();
		
		GerenteProjetos gerenteProjetos = new GerenteProjetos();
		gerenteProjetos.setNumeroDeMatricula(987);
		gerenteProjetos.exibeDados();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNumeroDeMatricula(123);
		funcionario.exibeDados();

	
	}

}
