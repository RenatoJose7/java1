package primeiroProjeto;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero =1;
		while(numero <= 5) {
			System.out.println(numero);
			numero ++; 
		}
		int numero2 = 5;
		while (numero >=1 ) {
			System.out.println(numero2);
			numero--;
		}
		
		int soma = 0;
		int valor;
		int contador = 1;
		
		System.out.println("Digite 3 números: ");
		while(contador <= 3) {
			valor = scanner.nextInt();
			soma += valor;
			contador+=1;
		}
		System.out.println("A soma dos números é:" + soma);
		
		
		System.out.println("Digite sair para sair do sistema");
		String resp = scanner.next();
		
		while (!resp.equalsIgnoreCase("Sair") ) {
			System.out.println("Tente novamente");
			resp = scanner.next();
		}
		System.out.println("Você conseguiu sair");
		
		int cont = 1;
		System.out.println("Informe um valor: ");
		int num = scanner.nextInt();
		while(num >= cont) {
			System.out.println(cont);
			cont++;
		}
		System.out.println("Tente acertar o número ");
		int num1 = scanner.nextInt();
		
		while(num1 != 7) {
			System.out.println("Tente outro número");
			num1 = scanner.nextInt();
		}
		System.out.println("Você conseguiu!");
	}
	
}


