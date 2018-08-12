package br.com.douglas.classesanonimas;

import java.util.ArrayList;
import java.util.List;

public class TestaAnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Fruta> frutas = new ArrayList<Fruta>();
		
		Fruta fruta01 = new Fruta();
		fruta01.nome = "mamão";
		frutas.add(fruta01);
		
		
		Fruta fruta02 = new Fruta();
		fruta02.nome = "abacate";
		frutas.add(fruta02);
		
		Fruta fruta03 = new Fruta();
		fruta03.nome = "zuba";
		frutas.add(fruta03);
		
		Fruta fruta04 = new Fruta();
		fruta04.nome = "batata";
		frutas.add(fruta04);
		
		System.out.println(frutas.toString());
		
		AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
		anonymousInnerClass.ordenar(frutas);
		
		System.out.println();
		
		System.out.println(frutas.toString());

	}

}
