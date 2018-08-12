package aula2;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caneta canetaAzul = new Caneta();
		canetaAzul.cor = "Azul";
		canetaAzul.modelo = "Bic";
		canetaAzul.tampada = true;
		canetaAzul.carga = 95;
		
		System.out.println(canetaAzul.escreve("Escrevendo com a caneta Azul")  + " do modelo " + canetaAzul.modelo + 
				" que esta com carga de " + canetaAzul.carga + "%");
		//System.out.println(canetaAzul.cor);
				
		Caneta canetaVermelha = new Caneta();
		canetaVermelha.cor = "Vermelha";
		canetaVermelha.modelo = "Bic";
		canetaVermelha.tampada = false;
		canetaVermelha.carga = 50;
		
		System.out.println(canetaVermelha.escreve("Escrevendo com a caneta Vermelha")  + " do modelo " + canetaVermelha.modelo + 
				" que esta com carga de " + canetaVermelha.carga + "%");
		
		//System.out.println(canetaVermelha.escreve());
		//System.out.println(canetaVermelha.cor);
		
		Caneta canetaPreta = new Caneta();
		canetaPreta.cor = "Preta";
		canetaPreta.modelo = "Bic";
		canetaPreta.tampada = true;
		canetaPreta.carga = 80;
		
		System.out.println(canetaPreta.escreve("Escrevendo com a caneta Preta")  + " do modelo " + canetaPreta.modelo + 
				" que esta com carga de " + canetaPreta.carga + "%");
		
		//System.out.println(canetaPreta.escreve());
		//System.out.println(canetaPreta.cor);
		

	}

}
