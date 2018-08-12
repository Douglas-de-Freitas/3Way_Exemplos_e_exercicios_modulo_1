package aula05;

public class TresTiposDeVariaveis {
	
	// Exemplo de variavel estatica
	static String staticVariable = "Variavel de classe, ou estatica";
	
	// Exemplo de variável de instancia
	String instanceVariable = "variavel de instancia";
	
	public static void main(String[] args) {
		
		TresTiposDeVariaveis t = new TresTiposDeVariaveis();
		String teste = t.instanceVariable;
		
		String localVariable = "variavel local";
		System.out.println("Variavel estatica = " + staticVariable);
		System.out.println("Variavel de instancia = " + teste);
		System.out.println("Variavel local = " + localVariable);
		
		
		
		
	}

}
