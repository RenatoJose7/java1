package primeiroProjeto;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 1;
		do {
			System.out.println(contador);
			contador++;
		} while (contador <= 10);

		System.out.println("--------------------------------");
		int secreto = 5;
		int escolha = 0;
		do {
			System.out.println("Escolha um número: ");
			escolha = sc.nextInt();
			if (escolha > secreto) {
				System.out.println("Tente um número menor");
			} else if (escolha < secreto) {
				System.out.println("é maior");
			}
		} while (secreto != escolha);
		System.out.println("Acertoou");

		System.out.println("--------------------------------");
		System.out.println("Escolha uma opção de navegação");
		System.out.println("1 - Ficar na navegação");
		System.out.println("2 - Saur da navegação");
		int opcao = sc.nextInt();
		do {
			System.out.println("Escolha novamente uma opção do menu");
			opcao = sc.nextInt();
		} while (opcao != 2);
		System.out.println("--------------------------------");
		System.out.println("Informe 3 idades: ");
		int idade;
		int cont1 = 1;
		do {
			idade = sc.nextInt();
			if (idade <= 12) {
				System.out.println("Criança");
			} else {
				System.out.println("Não é criança");
			}
			cont1++;
		} while (cont1 <= 5);
		System.out.println("FIM");
		
		System.out.println("--------------------------------");
		System.out.println("Informe três notas: ");
		int nota;
		int contador1 = 1;
		do {
			nota = sc.nextInt();
			if(nota < 5) {
				System.out.println("Nota ruim");
			} else {
				System.out.println("Nota boa");
			} 
			contador1++;
		}while (contador1 <= 3);
		System.out.println("Diario fechado");
		
		
	}

}
