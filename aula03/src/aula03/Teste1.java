package aula03;

import java.util.Arrays;

public class Teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String[] nomes = { "douglas0", "douglas1", "douglas2", "douglas3", "douglas4"
		// };

		String[] nomes = new String[5];

		nomes[0] = "iuri";
		nomes[1] = "banana";
		nomes[2] = "alex";
		nomes[3] = "zuleide";
		nomes[4] = "douglas";

		// for (String n : nomes) {
		// System.out.println(n);
		// }
		//
		// System.out.println("-----------------");
		//
		// for (int i = 0; i < nomes.length; i++) {
		// System.out.println(nomes[i]);
		// }

		Arrays.sort(nomes);

		System.out.println(Arrays.toString(nomes));

		for (String n : nomes) {
			System.out.println(n);
		}
		
		System.out.println("--------------");
		
		System.out.println("nomes[" + Arrays.binarySearch(nomes, "iuri" ) + "]");
	}

}
