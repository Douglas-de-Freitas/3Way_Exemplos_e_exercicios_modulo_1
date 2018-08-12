package br.com.abstrato;

public abstract class Animal {
	
	private String ruido;
	private String caracteristica;
	
	public Animal() {
		
	}
	
	public Animal(String ruido) {
		this.ruido = ruido;
	}
	
	public abstract void fazerBarulho();
	public abstract void comer();
	public abstract void caracteristica();
	
	public String getRuido() {return ruido;}
	public void setRuido(String ruido) {this.ruido = ruido;}
	

}
