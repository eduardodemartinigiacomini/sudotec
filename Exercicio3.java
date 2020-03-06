import java.util.Scanner;

/*
 * O usuário informa quatro valores. 
 * O programa mostra o resultado 
 * da multiplicação do primeiro pelo terceiro e o 
 * resultado da soma do segundo com o quarto.
 * */

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um número");

		int numero1 = ler.nextInt();

		System.out.println("Informe um número");

		int numero2 = ler.nextInt();

		System.out.println("Informe um número");

		int numero3 = ler.nextInt();

		System.out.println("Informe um número");

		int numero4 = ler.nextInt();

		// Multiplicação
		int multiplicacao = numero1 * numero3;

		// Soma
		int soma = numero2 + numero4;

		System.out.println("Resultado da multiplicação: " + multiplicacao);
		System.out.println("Resultado da soma: " + soma);

	}
}
