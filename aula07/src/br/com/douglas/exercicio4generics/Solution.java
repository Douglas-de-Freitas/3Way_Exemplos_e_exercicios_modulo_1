package br.com.douglas.exercicio4generics;

import java.lang.reflect.Method;

public class Solution {
	
	public static void main(String[] args) {
		
		Printer myPrinter = new Printer();
		
		Integer[] intArray = {1, 2, 3};
		String[] stringArray = {"Hello", "World", "ou não"};
		
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		
		
		//verificar se existem métodos sobrecarregados
		int count = 0;
		for(Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();
			System.out.println("======"+name);
			if(name.equals("printArray")){
				count++;
			}
		}
		
		if(count > 1) {
			System.out.println("método sobrecarregado não permitido!");
		}
		
	}

}
