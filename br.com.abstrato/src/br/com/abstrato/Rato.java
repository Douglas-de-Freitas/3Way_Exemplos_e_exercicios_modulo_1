package br.com.abstrato;

public class Rato extends Animal{
	
	public Rato() {
		super("qui qui qui");
	}
	
	@Override
	public void fazerBarulho() {
		// TODO Auto-generated method stub
		System.out.println("Grito de rato = " + this.getRuido());
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("come queijo");
	}

	@Override
	public void caracteristica() {
		// TODO Auto-generat'''''ed method stub
		System.out.println("mamifero");
	}
	
	

}
