import java.util.Scanner;

/*
 * O usuário informa três números inteiros, 
 * o programa soma esses três valores e 
 * depois mostra o quadrado do resultado obtido.
 * */
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Exibir mensagem
		System.out.println("Informe um número");

		// Pedir número para o usuário
		int numero1 = ler.nextInt();

		// Exibir mensagem
		System.out.println("Informe o segundo número");

		// Pedir número para o usuário
		int numero2 = ler.nextInt();

		// Exibir mensagem
		System.out.println("Informe o terceiro número");

		// Pedir número para o usuário
		int numero3 = ler.nextInt();

		// Realiza a soma dos números
		int soma = numero1 + numero2 + numero3;

		int quadrado = soma * soma;

		System.out.println("Quadrado " + quadrado);
	}
}
