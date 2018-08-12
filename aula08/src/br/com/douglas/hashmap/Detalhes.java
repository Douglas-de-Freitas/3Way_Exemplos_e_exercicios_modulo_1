package br.com.douglas.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Detalhes {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();
		lista.add("Stack");
		lista.add("Overflow");
		lista.add("Douglas de Freitas");
		lista.add("teste");
		lista.add("abacate");
		
		// Index | Elemento (Objeto | Objeto)
		//   0   | "Stack"
		//   1   | "Overflow"
		
		String str1 = lista.get(0); // str1 receberá "Stack"
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Stack");
		hashMap.put(5, "Overflow");
		hashMap.put(10, "Douglas de Freitas");
		hashMap.put(7, "teste");
		hashMap.put(50, "abacate");
		
		// key | Value
		//  1  | "Stack"
		//  5  | "Overflow"
		
		String retornoMap = hashMap.get(5); //str receberá
		
		System.out.println(retornoMap);
		
	}

}
