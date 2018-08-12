package aula03;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		
		while(true) {
			
			if(contador == 3) {
				contador ++;
				continue;
			}else {
				System.out.println(contador);
			}
			
			contador ++;
			
			if(contador == 10) {
				break;
			}
			
		}

	}

}
