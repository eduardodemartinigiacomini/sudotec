import java.util.Scanner;

/*
 * O usuário digita quanto está valendo o dólar e 
 * quanto em reais ele possui. 
 * O programa exibe quantos dólares vale os reais 
 * que o usuário informou.
 * */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o valor do dólar");

		// Carrega o valor do dólar
		double valorDolar = ler.nextDouble();

		System.out.println("Informe quantos reais você quer trocar");

		// Carrega o valor do dólar
		double valorReais = ler.nextDouble();

		double soma = valorReais / valorDolar;

		System.out.println("Resultado: " + soma);
	}
}
