import java.util.Scanner;

/*
 * Peça dois números para o usuário
 * E retorne a média. 
 * */
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a nota");

		double nota1 = ler.nextDouble();

		System.out.println("Informe a segunda nota");

		double nota2 = ler.nextDouble();

		// Somar notas
		double soma = nota1 + nota2;

		// Calcular média
		double media = soma / 2;

		if (media < 6) {
			System.out.println("Você reprovou");
		}

		if (media == 10) {
			System.out.println("Você foi muito bem. Parabéns.");
		}

		System.out.println("Média: " + media);
	}
}
