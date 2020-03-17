import java.util.Scanner;

/*Faça um algoritmo que mostre ao usuário um cardápio com 
 * 3 lanches, solicite qual lanche o usuário vai comer, 
 * e se deseja pedir algo mais. 
 * Você deve somar o valor de todos os lanches 
 * que o usuário pedir.
 * No final deverá mostrar um resumo do pedido 
 * e o valor total da compra.*/
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opcao = 0;

		double total = 0;

		String resumo = "\nResumo do pedido:";

		do {

			System.out.println("Cardápio:");
			System.out.println("0 - Sair");
			System.out.println("1 - Pastel R$ 5,00");
			System.out.println("2 - Coxinha R$ 2,50");
			System.out.println("3 - Salada R$ 10,00");

			System.out.println("\nQual opção deseja?");

			opcao = ler.nextInt();

			if (opcao == 0) {

			} else if (opcao == 1) { // Pastel

				System.out.println("Pastel R$ 5,00");

				total = total + 5.0;

				resumo = resumo + "\nPastel";

			} else if (opcao == 2) { // Coxinha

				System.out.println("Coxinha R$ 2,50");

				total = total + 2.5;

				resumo = resumo + "\nCoxinha";

			} else if (opcao == 3) { // Salada

				System.out.println("Salada R$ 10,00");

				total = total + 10.0;

				resumo = resumo + "\nSalada";

			} else {
				System.out.println("Opção inválida");
			}

		} while (opcao != 0);

		System.out.println(resumo);

		System.out.println("Total do pedido: " + total);
	}

}
