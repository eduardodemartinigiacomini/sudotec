import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a média");

		double media = ler.nextDouble();

		if (media < 6) {
			System.out.println("Você reprovou");
		}

		if (media == 10) {
			System.out.println("Você foi muito bem. Parabéns.");
		}

		System.out.println("Média: " + media);
	}
}
