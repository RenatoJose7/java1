package primeiroProjeto;

import java.util.Scanner;

public class lista16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Criando um vetor de cores

		String[] cores = new String[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Informe " + (i + 1) + " cor: ");
			cores[i] = sc.next();
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("As cores são: " + cores[i]);
		}

		System.out.println("-------------------------------------------------");

		// Vetor de números decimais

		double[] dec = new double[8];
		for (int i = 0; i < 8; i++) {
			System.out.println("Informe o valor " + (i + 1) + ":");
			dec[i] = sc.nextDouble();
		}
		for (int i = 0; i < 8; i++) {
			System.out.println("O valor " + (i + 1) + " é: " + dec[i]);
		}

		System.out.println("-------------------------------------------------");

		// Mostrando apenas os pares

		int[] valores = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor " + (i + 1) + ":");
			valores[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (valores[i] % 2 == 0) {
				System.out.println("O valor pares são: " + valores[i]);
			}
		}

		System.out.println("-------------------------------------------------");

		// Menores que 50

		int[] menores = new int[12];
		for (int i = 0; i < 12; i++) {
			System.out.println("Informe o valor " + (i + 1) + ":");
			menores[i] = sc.nextInt();
		}
		for (int i = 0; i < 12; i++) {
			if (menores[i] < 50) {
				System.out.println("O valores menores que 50 são: " + menores[i]);
			}
		}

		System.out.println("-------------------------------------------------");

		// Procurando um nome no vetor

		String[] nomes = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + i + " nome ");
			nomes[i] = sc.next();
		}
		System.out.println("Digite um nome para procurar: ");
		String procurar = sc.next();
		boolean encontrado = false;
		for (int i = 0; i < 5; i++) {
			if (nomes[i].equalsIgnoreCase(procurar)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("Nome encontrado!");
		} else {
			System.out.println("Nome não encontrado!");
		}

		System.out.println("-------------------------------------------------");

		// Produto e preço

		String[] produtos = new String[4];
		double[] precos = new double[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o " + (i+1) + "produto ");
			produtos[i] = sc.next();
			System.out.println("Digite o preço do produto[" + i + "]: ");
			precos[i] = sc.nextDouble();
		}
		System.out.println("Mostrando os produtos e preços");
		for (int i = 0; i < 4; i++) {
			System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
		}

		System.out.println("-------------------------------------------------");

		// Verificação de notas

		double[] notas = new double[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite a " + (i+1) + "° nota");
			notas[i] = sc.nextDouble();
		}
		System.out.println("Resultado dos alunos");
		for (int i = 0; i < 6; i++) {
			if (notas[i] < 6) {
				System.out.println("Nota " + (i+1) + " = " + notas[i] + " Aluno reprovado");
			} else if (notas[i] >= 6 && notas[i] <= 7) {
				System.out.println("Nota " + (i+1) + " = " + notas[i] + " Aluno em recuperação");
			} else {
				System.out.println("Nota " + (i+1) + " = " + notas[i] + " Aluno aprovado");
			}
		}

		System.out.println("-------------------------------------------------");

		// Promoção de ingressos

		double[] ingressos = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o preço do ingresso[" + i + "]: ");
			ingressos[i] = sc.nextDouble();
		}
		System.out.println("Verificando promoções");
		for (int i = 0; i < 5; i++) {
			if (ingressos[i] > 100) {
				System.out
						.println("ingressos[" + (i+1)  + "] = R$" + ingressos[i] + " -> Ingresso com promoção disponível!");
			} else {
				System.out.println("ingressos[" + (i+1) + "] = R$" + ingressos[i]);
			}

		}

	}
}
