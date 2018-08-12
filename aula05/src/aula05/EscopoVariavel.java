package aula05;

public class EscopoVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var1 = 10;
		int var2;
		
		if(var1 < 100) {
			var2 = 20;
		}else {
			var2 = 21;
		}
		
		//Acesso a var1 é permitido, então não há erro de compilação.
		System.out.println("valor de var1 = " + var1);
		
		//Acesso a var2 não é permitido, então erro de compilação será gerado
		System.out.println("valor de var2 = " + var2);

	}

}
