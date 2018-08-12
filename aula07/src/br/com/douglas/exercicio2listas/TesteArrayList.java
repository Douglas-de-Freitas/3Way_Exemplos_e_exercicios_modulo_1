package br.com.douglas.exercicio2listas;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List<String> listaString = new ArrayList<>(2);
		
		//checar tamanho
		System.out.println(listaString + ", size = " + listaString.size());
		
		// Adiciona itens ao ArrayList
		listaString.add("Robaum");
		listaString.add("Usurpa");
		listaString.add("Omitte");
		
		System.out.println(listaString + ", size = " + listaString.size());
		
		//Remove item, usa equals e hashCode
		listaString.remove("Usurpa");
		System.out.println(listaString + ", size = " + listaString.size());
		
		//Checa se a lista contem o elemento especificado
		boolean contem = listaString.contains("Omitte");
		System.out.println("A lista contem Omitte = " + contem);
		
		contem = listaString.contains("Paumdu");
		System.out.println("A lista contem Paumdu = " + contem);
		
		//adiconar mais 3 elementos na lista
		listaString.add("Douglas");
		listaString.add("João");
		listaString.add("Maria");
		
		//Verifique o tamanho
		System.out.println(listaString + ", size = " + listaString.size());
		
		//remova um deles
		listaString.remove("Douglas");
		
		//Verifique o tamanho
		System.out.println(listaString + ", size = " + listaString.size());
		
		//adicionando um novo na posição 2
		listaString.add(2, "Douglas");
		
		// Percorra os valores num laço for
		System.out.println("\nPercorrendo valores:");
		for(String s : listaString) {
			System.out.println(s);
		}
		

	}

}
