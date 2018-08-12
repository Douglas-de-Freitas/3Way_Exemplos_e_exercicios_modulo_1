package aula03;

public class TesteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 20, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		System.out.println(array[0]);
		System.out.println(array[6]);
		System.out.println(array.length - 1);

		// for(int valorArray : array) {
		// System.out.println(valorArray);
		// }

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
