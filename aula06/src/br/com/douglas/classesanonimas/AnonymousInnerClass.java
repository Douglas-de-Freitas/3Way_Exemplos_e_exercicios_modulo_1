package br.com.douglas.classesanonimas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousInnerClass {
	
	public void ordenar(List<Fruta> frutas) {
		// Ordenar
		
		Collections.sort(frutas, new Comparator<Fruta>() {
			public int compare(Fruta fruta2, Fruta fruta1) {
				return fruta2.nome.compareTo(fruta1.nome);
			}
			
		});
		
	}
	

}
