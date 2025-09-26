package primeiroProjeto;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		while(contador <= 5) {
			System.out.println(contador);
			contador ++;
		}
		System.out.println("--------------------------------------");
		int cont = 5;
		while (cont >= 1) {
			System.out.println(cont);
			cont--;
		}
		
		System.out.println("--------------------------------------");
		int c = 0;
		while (c <= 10) {
			System.out.println(c);
			c += 2;
		}
		
		
		System.out.println("--------------------------------------");
		int contador2 = 1;
		int soma = 0;
		
		while(contador2 <= 5) {
			System.out.println("Digite o "+ contador2 +":" );
			int numero = sc.nextInt();
			soma = soma + numero;
			contador2 ++;
		}
		System.out.println("A soma é: "+soma);
		
		System.out.println("--------------------------------------");
		System.out.println("O que deseja? ");
		String texto = sc.next();
		
		while(texto.equalsIgnoreCase("Ficar")) {
			System.out.println("O que deseja? ");
			texto = sc.next();
		}
		System.out.println("Saiu");
		
		
	}

}
