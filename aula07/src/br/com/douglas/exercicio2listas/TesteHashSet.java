package br.com.douglas.exercicio2listas;

import java.util.HashSet;

public class TesteHashSet {

	public static void main(String[] args) {
		
		HashSet<Cliente> clientes = new HashSet<>();
		clientes.add(new Cliente("Jesus"));
		
		//duplicado
		clientes.add(new Cliente("Jesus"));
		clientes.add(new Cliente("Mateus"));
		clientes.add(new Cliente("Maria"));
		
		//duplicado
		clientes.add(new Cliente("Maria"));
		clientes.add(new Cliente("Paulo"));
		clientes.add(new Cliente("João"));
		
		//imprimir com toString() de Cliente sem override de equals() e hashCode
		System.out.println(clientes.toString());
		
		//------------------------------------------------------------------------------------------
		
		System.out.println();
		
		HashSet<Conta> contas = new HashSet<>();
		contas.add(new Conta(5, new Cliente("Ze")));
		contas.add(new Conta(2, new Cliente("Lucas")));
		
		contas.add(new Conta(1, new Cliente("Pedro")));
		
		//duplicado o numero da conta
		contas.add(new Conta(1, new Cliente("Maria")));
		
		contas.add(new Conta(0, new Cliente("Joao")));
		contas.add(new Conta(4, new Cliente("Ana")));
		
		//imprimir com override da equals() e hashCode()
		System.out.println(contas);
		

	}

}
