package br.com.douglas.exercicio4generics;

import java.lang.reflect.Method;

public class Solution {
	
	public static void main(String[] args) {
		
		Printer myPrinter = new Printer();
		
		Integer[] intArray = {1, 2, 3};
		String[] stringArray = {"Hello", "World", "ou n�o"};
		
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		
		
		//verificar se existem m�todos sobrecarregados
		int count = 0;
		for(Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();
			System.out.println("======"+name);
			if(name.equals("printArray")){
				count++;
			}
		}
		
		if(count > 1) {
			System.out.println("m�todo sobrecarregado n�o permitido!");
		}
		
	}

}
