package br.com.abstrato;

public class Gato extends Animal{

	public Gato() {
		super("Miauuuu, miauuuu");
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Miar = " + this.getRuido());
	}
	
	@Override
	public void comer() {
		System.out.println("Come rato");
	}
	
	@Override
	public void caracteristica() {
		System.out.println("felino pequeno");
	}

}
