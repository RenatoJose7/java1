package primeiroProjeto;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
////		
////		int opcao = 2;
////		
////		switch(opcao) {
////			case 1:
////				System.out.println("O número é 1");
////				break;
////			case 2:
////				System.out.println("O número é 2");
////				break;
////			default:
////				System.out.println("Número incorreto");
////		}
////
////		// Cardapio da cantina
////		System.out.println("Qual produto deseja? ");
////		System.out.println("1- Suco");
////		System.out.println("2- lanche ");
////		System.out.println("3- Chocolate");
////		int escolha = scanner.nextInt();
////		switch(escolha){
////		case 1:
////			System.out.println("Pague R$ 4.00");
////			break;
////		case 2:
////			System.out.println("Pague R$ 7.00");
////			break;
////		case 3:
////			System.out.println("Pague R$ 5.00");
////			break;
////		default:
////			System.out.println("Opção incorreta");
////		}
////		
////		//
////		
////		int valor = 2;
////		switch(valor ) {
////		case 1:
////		case 2:
////			System.out.println("Muito bom");
////			break;
////		case 3:
////		case 4:
////			System.out.println("Bom");
////			break;
////		default:
////			System.out.println("Ruim,,,,,,,,,,,,,,,,,,,,,,,,");
////		}
//		
//		int escolha;
//		System.out.println("Digite um número e veja uma cor ");
//		escolha = scanner.nextInt();
//		
//		switch(escolha) {
//		case 1:
//			System.out.println("Vermelho");
//			break;
//		case 2:
//			System.out.println("Azul");
//			break;
//		default:
//			System.out.println("Opção invalida");
//		}
//		
//		System.out.println("Escolha um número e veja uma cor: ");
//		int numero = scanner.nextInt();
//		switch(numero) {
//		case 1:
//			System.out.println("Vermelho");
//			break;
//		
//		case 2:
//			System.out.println("Azul");
//			break;
//		default:
//			System.out.println("Valor incorreto");
//		
//		}
//		System.out.println("Qual categoria você pertence?");
//		String categoria = scanner.next();
//		switch(categoria.toUpperCase()) {
//		case "A":
//			System.out.println("Infantil");
//			break;
//		case "B":
//			System.out.println("Juvenil");
//			break;
//		default:
//			System.out.println("Categoria incorreta");
//		}
//
//		System.out.println("Escolha a operalçao de dois números");
//		String operacao = scanner.next();
//		
//		switch(operacao){
//		case "+":
//			int adicao = 5 + 5;
//			System.out.println(adicao);
//			break;
//		case "-":
//			int subtracao = 5 - 5;
//			System.out.println(subtracao);
//			break;
//		case "*":
//			int multi = 5 * 5;
//			System.out.println(multi);
//			break;
//		case "/":
//			int div = 5 / 5;
//			System.out.println(div);
//			break;
//		default:
//			System.out.println("Operação incorreta");
//		}
		int cont = 1;
		System.out.println("Informe um valor: ");
		int num = scanner.nextInt();
		while(num >= cont) {
			System.out.println(cont);
			cont++;
		}
	}

}
