package br.com.douglas.interfaces;

public interface DAO {
	
	public boolean inserir(Object o);
	
	public boolean deletar(String cpf);
	
	public boolean deletar(int id);
	
	public String listar();
	
	public boolean alterar(Object o, int linha);

}
