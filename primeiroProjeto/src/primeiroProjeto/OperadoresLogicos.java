package primeiroProjeto;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		System.out.println("Você tem ingresso? (true/false): ");
		boolean ingresso = scanner.nextBoolean();
		
		if(idade >= 18 && ingresso) {
			System.out.println("Entrada Permitida");
		} else {
			System.out.println("Entrada negada");
		}

		System.out.println("_______________________");
		System.out.println("Qual sua nota? (0 a 10) ");
		double nota = scanner.nextDouble();
		System.out.println("Qual sua frequência (0 a 100) ");
		int frequencia = scanner.nextInt();
		
		if(nota >= 7 || frequencia >= 75) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		System.out.println("_______________________");
		System.out.println("Sistema de login");
		System.out.println("Você é administrador? (true/false): ");
		boolean adm = scanner.nextBoolean();
		System.out.println("Você está logado? (true/false): ");
		boolean login = scanner.nextBoolean();
		if(adm && login) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado");
		}
		
		System.out.println("_______________________");
		System.out.println("Informe uma letra: ");
		String vogal = scanner.next();
		if(vogal.equalsIgnoreCase("a")|| vogal.equalsIgnoreCase("e")||vogal.equalsIgnoreCase("i")|| vogal.equalsIgnoreCase("o")||vogal.equalsIgnoreCase("U")) {
			System.out.println("É uma vogal ");
		} else {
			System.out.println("É uma consoante");
		}
		
		// Recaptulação: E
		
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		System.out.println("Tem titulo de eleitor? ");
		String resposta = scanner.next();
		
		if (idade >= 16 && resposta.equalsIgnoreCase("sim")) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar");
		}
		
		// ou
		int numero;
		System.out.println("Informe um número: ");
		numero = scanner.nextInt();
		if(numero >= 10 || numero <= 20) {
			System.out.println("O número está no intervalo");
		} else {
			System.out.println("O número está fora");
		}
		
		
		// true or false
		
		System.out.println("Qual valor da compra? ");
		double valor = scanner.nextDouble();
		System.out.println("É cliente VIP? ");
		boolean vip = scanner.nextBoolean();
		
		if (valor > 200 && vip == true) {
			double desconto = valor * 0.15;
			double valorFinal = valor - desconto;
			System.out.println("Vai pagar: %.2f,", valorFinal);
		} else {
			System.out.println("Não tem desconto");
		}
		
		System.out.println("Qual sua idade? ");
		int idade2 = scanner.nextInt();
		System.out.println("Possuí experiência? ");
		String exp = scanner.next();
		
		if (idade >= 20 && idade <= 40 && exp.equalsIgnoreCase("Sim")) {
			System.out.println("Inscrição aceita");
		} else {
			System.out.println("Inscrição rejeitada");
		}
	}

}
