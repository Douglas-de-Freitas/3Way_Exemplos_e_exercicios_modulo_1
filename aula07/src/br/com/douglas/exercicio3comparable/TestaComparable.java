package br.com.douglas.exercicio3comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaComparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBanco conta1 = new ContaBanco(5452, "Phillip Lahm");
		ContaBanco contaBanco = new ContaBanco(1003, "Lucas Podolski");
		ContaBanco conta3 = new ContaBanco(2052, "Arne Friedrich");
		
		List<ContaBanco> lista = new ArrayList<>();
		lista.add(conta1);
		lista.add(contaBanco);
		lista.add(conta3);
		
		for(ContaBanco conta : lista) {
			System.out.println("=======+ "+conta.getConta());
		}
		
		Collections.sort(lista);
		System.out.println();
		
		for(ContaBanco conta : lista) {
			System.out.println("=======+ "+conta.getConta());
		}

	}

}
