import java.util.Scanner;

/*O usuário digita um número e o programa retorna o quadrado 
 * deste número (o número multiplicado por ele mesmo).*/

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Exibir mensagem
		System.out.println("Informe um número");

		// Pedir número para o usuário
		int numero = ler.nextInt();

		int quadrado = numero * numero;

		System.out.println("Quadrado: " + quadrado);

	}

}
