package aula04;

public class PassagemPorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = 10;
		
		System.out.println(i);
		
		teste(i);
		
		System.out.println(i);

	}
	
	public static void teste(Integer j) {
		j = 33;
	}

}
