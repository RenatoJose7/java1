package primeiroProjeto;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// >= Maior ou igual    <= Menor ou igual
		// >  Maior              < Menor
		// == Igual             != Diferente */
		
		int idade = 18;
		if(idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		
		
		// Verificação de desconto
		System.out.println("Quanto você pagou? ");
		double valor = scanner.nextDouble();
		if (valor >= 200) {
			System.out.println("Você ganhou desconto");
		} else {
			System.out.println("Você não ganhou desconto");
		}
		
		String continuar;
		System.out.println("Deseja Continuar? ");
		continuar = scanner.next();
		if(continuar != "sim") {
			System.out.println("Você escolheu continuar");
		} else {
			System.out.println("Você escolheu sair.");
		}
		// Verificação de aprovação 
		double nota1, nota2;
		System.out.println("Informe a nota 1: ");
		nota1 = scanner.nextDouble();
		System.out.println("Informe a nota 2: ");
		nota2 = scanner.nextDouble();
		double media = (nota1 + nota2 ) / 2;
		
		if(media < 7) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
		
		System.out.println();
		System.out.println("Informe o valor da compra: ");
		double conta;
		conta = scanner.nextDouble();
		if(conta >= 200) {
		double desconto = conta * 0.15;
		double descCompra = conta - desconto;
			System.out.println("Você receberá desconto um de R$:"+ desconto);
			System.out.println("O novo valor é de: "+ descCompra);
		}else {
			System.out.println("Você não tem direito a desconto, o valor continua R$:"+conta);
		}
		// Situação de estoque
		 int estoque;
		 System.out.println("Quantos produtos tem no estoque? ");
		 estoque = scanner.nextInt();
		 if(estoque >=100) {
			 System.out.println("Estoque OK");
		 } else if(estoque >= 50) {
			 System.out.println("Atenção ao Estoque");
		 } else {
			 System.out.println("Estoque crítico");
		 }
		 // Verificação de classe eleitoral
		 System.out.println("Quantos anos você tem? ");
		 int idade1;
		 idade1 = scanner.nextInt();
		 if (idade1 < 16) {
			 System.out.println("Não eleitor.");
		 } else if(idade1 < 18) {
			 System.out.println("Voto opcional");
		 }  else if(idade < 65) {
			 System.out.println("Voto obrigatório");
		 } else if(idade > 65) {
			 System.out.println("Voto opcional");
		 } else {
			 System.out.println("Idade invalida");
		 }
			 
			 
			 
			 
			// >= Maior ou igual    <= Menor ou igual
				// >  Maior              < Menor
				// == Igual             != Diferente */
	}

}
