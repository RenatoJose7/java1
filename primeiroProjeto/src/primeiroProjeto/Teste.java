package primeiroProjeto;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual sua nota média? (0 a 10) ");
		double nota = scanner.nextDouble();
		System.out.println("Qual sua frequência (0 a 100) ");
		int frequencia = scanner.nextInt();
		
		if(nota >= 7 || frequencia >= 75) {
			System.out.println("Bolsa concedida");
		} else {
			System.out.println("Bolsa não concedida");
	}

	}
}