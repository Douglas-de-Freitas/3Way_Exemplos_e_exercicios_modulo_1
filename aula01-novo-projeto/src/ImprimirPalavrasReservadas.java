
public class ImprimirPalavrasReservadas {

	public static void main(String[] args) {
		
		//35 palavras 0-34 de conhecimento meu (Douglas) - modo que eu preferi fazer
		String[] palavrasReservadas = {
				"private","protected","public","class","extends","final",
				"new","static","break","case","continue","default","do","else",
				"for","if","instanceof","return","switch","while","catch","try","import","package",
				"boolean","byte","char","double","float","int","long","short","super","this","void"};
		
		for(int i = 0; i < palavrasReservadas.length; i++) {
			System.out.println(i + " " + palavrasReservadas[i]);
		}
		
		// Palavras reservadas que vimos no curso até agora - de modo que foi pedido
		String palavra1 = "public";
		String palavra2 = "class";
		String palavra3 = "static";
		String palavra4 = "void";
		String palavra5 = "int";
		String palavra6 = "String";
		
		System.out.println("");
		// valor que contem na String
		System.out.println(palavra1);
		System.out.println(palavra2);
		System.out.println(palavra3);
		System.out.println(palavra4);
		System.out.println(palavra5);
		System.out.println(palavra6);
		
		System.out.println("");
		// Quantidade de caracteres da String
		System.out.println(palavra1.length());
		System.out.println(palavra2.length());
		System.out.println(palavra3.length());
		System.out.println(palavra4.length());
		System.out.println(palavra5.length());
		System.out.println(palavra6.length());
			
	}
	
}
