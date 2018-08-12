package br.com.douglas.exercicio4generics;

public class Printer{
	
	// Adicionado na versão javaSE 5, tem como objetivo possibilitar a tipagem de métodos
	// e classes de forma a assegurar a integridade da implementação.
	
	//generics - metodo
	public <T> void printArray(T[] array) {
		for(T t : array) {
			System.out.println(t);
		}
	}
	
	
//	public void printArray(int[] array) {
//		
//	}
//	
//	public void printArray(String[] array) {
//		
//	}

}
