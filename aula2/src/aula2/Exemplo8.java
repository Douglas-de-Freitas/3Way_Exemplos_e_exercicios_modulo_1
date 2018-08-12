package aula2;

import java.util.Scanner;

public class Exemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int n2 = scanner.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		int n3 = scanner.nextInt();
		
		System.out.println("Digite a quarta nota: ");
		int n4 = scanner.nextInt();
		
		double media = (n1 + n2 + n3 + n4) / 4;
		String resultado;
		
		if(media >= 6) {
			resultado = "Aprovado";
		}else if(media < 6 && media >= 5) {
			resultado = "Recuperação";
		}else {
			resultado = "Reprovado";
		}
		
		System.out.println("Sua média é " + media + " e o resultado é " + resultado);
		

	}

}
