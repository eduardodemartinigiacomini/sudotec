
public class Exercicio13 {

	/*
	 * Escreva um programa que leia 5 números Exiba os 5 números e a média
	 */

	public static void main(String[] args) {

		int numero = 10;

		int[] listaNumeros = new int[numero];

		// 0, 1, 2, 3, 4

		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = i + 10; // nextDouble
		}

//		System.out.println(listaNumeros.length);

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println(listaNumeros[i]);
		}

	}
}
