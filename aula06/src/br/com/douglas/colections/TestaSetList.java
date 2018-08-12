package br.com.douglas.colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaSetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		set.add(new String("Duke"));
		set.add(new String("Duke"));
		set.add(new String("Teste"));
		
		List<String> list = new ArrayList<>();
		list.add(new String("Duke"));
		list.add(new String("Duke"));
		list.add(new String("Duke"));
		
		System.out.println(set.toString());
		System.out.println(list.toString());

	}

}
